/*
 * Created on 2025-11-07
 * 
 * Copyright (c) 2025 Nadine von Frankenberg
 */

package coffee;

public class Cappuccino extends Coffee {

    public Cappuccino() {
        this(12);
    }

    public Cappuccino(int size) {
        super(size);
        super.setType("Cappuccino");
    }

    @Override
    public void make() {
        System.out.println("Making a " + super.getType() + "...");
        System.out.println("Foaming milk.");
        System.out.println("Adding espresso shot.");
    }
}
