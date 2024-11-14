/*
 * Created on 2025-11-07
 * 
 * Copyright (c) 2025 Nadine von Frankenberg
 */

package coffee;

public class DripCoffee extends Coffee {

    private boolean isIced = false;

    public DripCoffee() {
        this(12); // default size
    }

    public DripCoffee(int size) {
        this(size, false);
    }

    public DripCoffee(int size, boolean iced) {
        super(size);
        this.isIced = iced;
        super.setType(iced ? "Iced Drip Coffee" : "Drip Coffee");
    }

    public boolean isIced() {
        return isIced;
    }

    @Override
    public void make() {
        System.out.println("Making a " + getSize() + "-oz " + getType() + "...");
        if (isIced) {
            System.out.println("Adding ice...");
        } else {
            System.out.println("Brewing hot coffee...");
        }
    }

}
