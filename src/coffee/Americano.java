/*
 * Created on 2025-11-07
 * 
 * Copyright (c) 2025 Nadine von Frankenberg
 */

package coffee;

public class Americano extends Coffee {

    public Americano() {
        this(12);
    }

    public Americano(int size) {
        super(size);
        super.setType("Americano");
    }

    @Override
    public void make() {
        System.out.println("Making an " + super.getType() + "...");
    }
}