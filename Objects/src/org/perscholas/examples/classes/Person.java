package org.perscholas.examples.classes;

public class Person {
    public String name;
    public String lastName;
    public int age;
    public String city;
    // public = access anywhere
    // default = when you don't assign an access modifier = only available in the same package
    // protected = you allow the children of the class to have access
    // private = only the class has to the variable/method
    public Person(String name, String lastName, int age, String city) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCity() {
        return this.city;
    }
    public void introduceSelf() {
        System.out.println("Hello, I am " + this.name + " it is so nice to meet you");
    }
}
