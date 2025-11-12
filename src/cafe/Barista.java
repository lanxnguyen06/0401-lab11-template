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
            Coffee coffee = order.getCoffees().get(0); // getCoffees returns list of coffees so use arrayList method .get to get the first coffee in the list (even if it's a single order)
            System.out.println("Preparing " + coffee.getSize() + "-oz " + coffee.getType() + " for " + order.getCustomer().getName());
            coffee.make();
            coffee.setReadyForPickup();
            order.markFulfilled();
            System.out.println("Order #" + order.getOrderId() + " ready for pickup!\n");
        }
    }

    // group order
    public static void prepareOrder(Order order, boolean isGroupOrder){
            System.out.println("Preparing group order # " + order.getOrderId() + " for " + order.getCustomer().getName());
            for (int i = 0; i < order.getCoffees().size(); i++){
                Coffee coffee = order.getCoffees().get(i); // iterates through the list of coffees and grabs the one at the i index
                System.out.println("Preparing " + coffee.getSize() + "-oz " + coffee.getType() + " for " + order.getCustomer().getName());
                coffee.make();
                coffee.setReadyForPickup();
            }
                order.markFulfilled();
                System.out.println("Group order #" + order.getOrderId() + " ready for pickup!\n");
        }
    }

            // prepareOrder(order, true); // delegate to multi-item prepare method

    // TODO: Prepare multiple coffees for a group order
    // Use method overloading and avoid duplicate code!

