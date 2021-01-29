package org.perscholas.examples.classes;

public class Frog {
    public String name;
    public String color;

    public Frog(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public void hop() {
        System.out.println(this.name + " hopped over to say hi.");
    }
}
