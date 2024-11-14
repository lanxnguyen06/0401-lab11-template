/*
 * Created on 2025-11-07
 * 
 * Copyright (c) 2025 Nadine von Frankenberg
 */

package coffee;

public class Affogato extends Coffee {

    private static final int DEFAULT_SIZE = 4;

    public Affogato() {
        this(DEFAULT_SIZE);
    }

    public Affogato(int size) {
        super(size);
        super.setType("Affogato");
    }

    @Override
    public void make() {
        System.out.println("Making a " + getSize() + "-oz " + getType() + "...");
        System.out.println("Adding ice cream.");
        System.out.println("Adding espresso.");
    }
}
