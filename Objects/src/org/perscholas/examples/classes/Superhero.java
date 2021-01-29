package org.perscholas.examples.classes;

public class Superhero extends Person {
    public String superPower;
    public String superHeroName;


    // all of this below is being called in the super(); method
    // public Person(String name, String lastName, int age, String city) {
    //     this.name = name;
    //     this.lastName = lastName;
    //     this.age = age;
    //     this.city = city;
    // }

    public Superhero(String name, String lastName, int age, String city, String superPower, String superHeroName) {
        super(name, lastName, age, city);
        this.superPower = superPower;
        this.superHeroName = superHeroName;
    }
}
