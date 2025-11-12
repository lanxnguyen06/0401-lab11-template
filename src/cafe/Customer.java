/*
 * Created on 2025-11-07
 * 
 * Copyright (c) 2025 Nadine von Frankenberg
 */

package cafe;

public class Customer {
    private String name;
    private Payment paymentType;

    public Customer(String name, Payment paymentType) {
        this.name = name;
        this.paymentType = paymentType;
    }

    public String getName() {
        return this.name;
    }

    public String getPaymentType(){
        if (paymentType == null){
            return "Bill not paid!";
        }
        else
            return paymentType.getPaymentType();
    }

    public void payForOrder(Order order){
        if (!order.isFulfilled()){
            System.out.println("The customer can't pay yet because the order isn't finished making.");
            return;
        } // if order not done yet customer can't pay for unfished order
        else
            paymentType.makePayment(order);
    }
    // Optional: implement a makePayment() method
}
