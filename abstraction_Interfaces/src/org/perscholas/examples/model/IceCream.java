package org.perscholas.examples.model;

public class IceCream {
    public String flavor;
    public String brand;
    public boolean isChunky;
    public double price;
    public boolean hasDairy;

    public IceCream(String flavor, String brand, boolean isChunky, double price, boolean hasDairy) {
        this.flavor = flavor;
        this.brand = brand;
        this.isChunky = isChunky;
        this.price = price;
        this.hasDairy = hasDairy;
    }
}
