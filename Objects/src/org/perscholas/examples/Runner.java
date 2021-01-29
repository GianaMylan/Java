package org.perscholas.examples;

import org.perscholas.examples.classes.Car;
import org.perscholas.examples.classes.MyObject;
import org.perscholas.examples.classes.Person;
import org.perscholas.examples.classes.Superhero;
import org.perscholas.examples.classes.Doctor;
import org.perscholas.examples.classes.Automobile;

public class Runner {

    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        MyObject variableName = new MyObject(); // calling myObject from MyObject.java
        //System.out.println(variableName.name);
        variableName.sayHello("Frost");
        variableName.sayGoodbye("Frost");
        //created new object for the class

        Person frost = new Person("Emma", "Frost", 29, "Queens");
        Car tsla = new Car("Tesla", "white");
        System.out.println("I have a " + tsla.color + " " + tsla.name);

        Superhero peter = new Superhero("Peter", "Parker", 22, "Queens","Web-Slinging", "Spiderman");
        System.out.println(peter.age);
        System.out.println(peter.superHeroName);

        Doctor doctor = new Doctor("Gregory", "House", 33, "Somewhere", "Lincoln", "Diagnostics", 100);
        doctor.introduceSelf();
        doctor.whatIsWrong();
    }
}

