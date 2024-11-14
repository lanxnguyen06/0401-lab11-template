/*
 * Created on 2025-11-07
 * 
 * Copyright (c) 2025 Nadine von Frankenberg
 */

package coffee;

public class LatteMacchiato extends Coffee {

    private String flavor = "plain";
    private boolean isIced = false;

    // "Constructor chaining": prevents duplicate code and
    // ensures objects are initialized consistently
    public LatteMacchiato(int size, String flavor, boolean iced) {
        super(size);
        this.isIced = iced;
        if (flavor != null)
            checkFlavor(flavor);
        super.setType(formatType());
    }

    public LatteMacchiato(int size, String flavor) {
        this(size, flavor, false);
    }

    public LatteMacchiato(int size, boolean iced) {
        this(size, "plain", iced);
    }

    public LatteMacchiato(int size) {
        this(size, "plain", false);
    }

    private String formatType() {
        String prefix = isIced ? "Iced " : "";
        return prefix + "Latte Macchiato" +
                (flavor.equalsIgnoreCase("plain") ? "" : " (" + flavor + ")");
    }

    public String getFlavor() {
        return flavor;
    }

    public boolean isIced() {
        return isIced;
    }

    // Optional
    private void checkFlavor(String flavor) {
        if (flavor.equalsIgnoreCase("vanilla") || flavor.equalsIgnoreCase("peppermint")) {
            this.flavor = flavor;
        }
    }

    @Override
    public void make() {
        System.out.println("Making a " + super.getSize() + " " + super.getType() + ".");
        if (this.isIced) {
            System.out.println("Adding ice ...");
        }
        if (!this.flavor.equalsIgnoreCase("plain")) {
            System.out.println("Adding " + this.flavor + " syrup.");
        }
    }
}
