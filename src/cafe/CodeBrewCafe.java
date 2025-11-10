/*
 * Created on 2025-11-07
 *
 * Copyright (c) 2025 Nadine von Frankenberg
 */

package cafe;

import coffee.*;

public class CodeBrewCafe {

    public static void main(String[] args) throws Exception {
        // Single order
        Customer lane = new Customer("Lane");
        Cappuccino cappuccino = new Cappuccino(16);
        
        // TODO: create an order & process the order (see TODO below!)

        // Group order
        Customer lorelai = new Customer("Lorelai");
        LatteMacchiato vanillaLatte = new LatteMacchiato(16, true);
        Espresso espresso = new Espresso();
        // TODO: Create a group order (multiple coffees) and process it

    }

    // TODO: overload the method processOrder()
    // processOrder includes preparing (Barista) an order and printing the receipt
    // (Order)
    private static void processOrder(Order order) {

    }

    private static void processOrder(Order order, boolean isGroupOrder) {

    }
}
