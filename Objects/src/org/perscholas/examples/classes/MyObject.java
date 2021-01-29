package org.perscholas.examples.classes;

public class MyObject {
    String name;
    String lastName;

    public void myObject(String nameP, String lastNameP) {
        this.name = nameP;
        this.lastName = lastNameP;
    }
    public void sayHello(String name) {
        System.out.println("Hello, " + name);
    }
    public void sayGoodbye(String name) {
        System.out.println("Goodbye, " + name);
    }
}
