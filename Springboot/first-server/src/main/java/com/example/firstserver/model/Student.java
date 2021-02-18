package com.example.firstserver.model;

public class Student {
    public String firstName;
    public String lastName;
    public int age;

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName; // before = refers to the above and after refers to the param
        this.lastName = lastName;
        this.age = age;
    } //this whole thing is the constructor
}
