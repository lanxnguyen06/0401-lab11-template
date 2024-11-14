/*
 * Created on 2025-11-07
 * 
 * Copyright (c) 2025 Nadine von Frankenberg
 */

package cafe;

import coffee.Coffee;

public class Barista {

    // Single coffee order
    public static void prepareOrder(Order order) {
        if (order.getCoffees().size() == 1) {
            Coffee coffee = order.getCoffees().get(0);
            System.out.println("Preparing " + coffee.getSize() + "-oz " + coffee.getType() + "...");
            coffee.make();
            coffee.setReadyForPickup();
            order.markFulfilled();
            System.out.println("Order #" + order.getOrderId() + " ready for pickup!\n");
        } else {
            prepareOrder(order, true); // delegate to multi-item prepare method
        }
    }

    // TODO: Prepare multiple coffees for a group order
    // Use method overloading and avoid duplicate code!
}
