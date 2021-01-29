package org.perscholas.examples.classes;

public class Doctor extends Person{
    public String hospital;
    public String specialty;
    public int yoe;

    public Doctor(String name, String lastName, int age, String city, String hospital, String specialty, int yoe) {
        super(name, lastName, age, city);
        this.hospital = hospital;
        this.specialty = specialty;
        this.yoe = yoe;
    }
    public void whatIsWrong() {
        System.out.println("You keep googling your symptoms. Relax yourself");
    }
}
