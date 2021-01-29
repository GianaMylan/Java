package org.perscholas.examples.classes;

public class Mouse {
    public String name;
    public String lastName;
    public String color;

    public Mouse(String name, String lastName, String color) {
        this.name = name;
        this.lastName = lastName;
        this.color = color;
    }

    public void scurry() {
        System.out.println(this.name + " scurried to you.");
    }
}
