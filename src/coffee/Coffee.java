/*
 * Created on 2025-11-07
 *
 * Copyright (c) 2025 Nadine von Frankenberg
 */

package coffee;

public abstract class Coffee {
    private String type;
    private int size;
    private boolean readyForPickup;

    public Coffee() {
        this(12); // default size
    }

    public Coffee(int size) {
        this.size = size;
        this.readyForPickup = false;
    }

    public abstract void make(); // Polymorphic method

    public void pickup() {
        this.readyForPickup = true;
        System.out.println("Order ready: " + size + "-oz " + type + ".");
    }

    public String getType() {
        return this.type;
    }

    protected void setType(String type) {
        this.type = (type != null && !type.isEmpty()) ? type : "Coffee not defined";
    }

    public int getSize() {
        return this.size;
    }

    public boolean isReadyForPickup() {
        return this.readyForPickup;
    }

    public void setReadyForPickup() {
        this.readyForPickup = true;
    }
}
