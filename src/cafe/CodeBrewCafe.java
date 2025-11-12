/*
 * Created on 2025-11-07
 *
 * Copyright (c) 2025 Nadine von Frankenberg
 */

package cafe;

import coffee.*;
import java.util.List;
import java.util.ArrayList;

public class CodeBrewCafe {

    public static void main(String[] args) throws Exception {
        // Single order
        Customer lane = new Customer("Lane");
        Cappuccino cappuccino = new Cappuccino(16);
        Order single = new Order(1, lane, cappuccino);
        processOrder(single);

        // Group order
        Customer lorelai = new Customer("Lorelai");
        LatteMacchiato vanillaLatte = new LatteMacchiato(16, true);
        Espresso espresso = new Espresso();
        Affogato affogato = new Affogato();
        List<Coffee> groupOrder = new ArrayList<>(); // stores multiple coffees in a dynamic array so you can add as many coffees as needed
        groupOrder.add(vanillaLatte);
        groupOrder.add(espresso);
        groupOrder.add(affogato);
        Order group = new Order(2, lorelai, groupOrder);
        processOrder(group, true);
        // TODO: Create a group order (multiple coffees) and process it

    }

    // TODO: overload the method processOrder()
    // processOrder includes preparing (Barista) an order and printing the receipt
    // (Order)
    private static void processOrder(Order order) {
        Barista.prepareOrder(order);
        order.printReceipt();
    }

    private static void processOrder(Order order, boolean isGroupOrder) {
        Barista.prepareOrder(order, true);
        order.printReceipt();
    }
}
