/*
 * Created on 2025-11-07
 * 
 * Copyright (c) 2025 Nadine von Frankenberg
 */

package coffee;

public class Espresso extends Coffee {

    private static final int DEFAULT_SIZE = 4;

    public Espresso() {
        this(DEFAULT_SIZE);
    }

    public Espresso(int size) {
        super(size);
        setType("Espresso");
    }

    @Override
    public void make() {
        System.out.println("Making an " + super.getType() + "...");
    }

    public void make(boolean addShot) {
        this.make();
        if (addShot) {
            System.out.println("Adding an extra espresso shot!");
        }
    }
}
