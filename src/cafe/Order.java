/*
 * Created on 2025-11-09
 * 
 * Copyright (c) 2025 Nadine von Frankenberg
 */

 // NO NEED TO TOUCH THIS FILE // i changed the two order constructors to take in a single order and group order... my way cause idk how she wanted it

package cafe;

import coffee.Coffee;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private final int orderId;
    private final Customer customer;
    private final List<Coffee> coffees = new ArrayList<>();
    private boolean fulfilled;

    public Order(int orderId, Customer customer, Coffee coffee) {
        this.orderId = orderId;
        this.customer = customer;
        this.coffees.add(coffee);
        this.fulfilled = false;
    }

    public Order(int orderId, Customer customer, List<Coffee> coffees) {
        this.orderId = orderId;
        this.customer = customer;
        this.coffees.addAll(coffees);
        this.fulfilled = false;
    }

    public void addCoffee(Coffee coffee) {
        coffees.add(coffee);
    }

    public List<Coffee> getCoffees() {
        return coffees;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getOrderId() {
        return orderId;
    }

    public boolean isFulfilled() {
        return fulfilled;
    }

    public void markFulfilled() {
        this.fulfilled = true;
    }

    public void printReceipt() {
        System.out.println("--- Receipt ---");
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.getName());
        for (Coffee coffee : coffees) {
            System.out.println(" - " + coffee.getType() + " (" + coffee.getSize() + " oz)");
        }
        System.out.println("Payment: " + "Paying with " + customer.getPaymentType());
        System.out.println("----------------\n");
    }
}
