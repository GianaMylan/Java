package org.perscholas.example;

import java.util.Scanner; // so i can input things into terminal <specifically the scanner>
import java.util.Calendar; // so I can use time/date properties

public class Grades {
    public static void main(String[] args) {
        largestOfTwo();
        whatGrade();
        greetings();
    }

    public static void largestOfTwo() {
        int x = 123;
        int y = 99;
        System.out.println("Highest number is " + Math.max(x,y));
    }

    public static void whatGrade() {
        int score; //number grade
        char grade; //letter grade

        Scanner console = new Scanner(System.in); // read input of number grade
        System.out.println("Enter test score: ");
        score = console.nextInt();

        if (score >=  90) {
            grade = 'A';
        } else if ( score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 55) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Your grade is " + grade);
    }

    public static void greetings() {
        Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY); // retrieving the hour of day

        if(hour >= 5 && hour < 12) {
            System.out.println("Good Morning");
        } else if (hour >= 12 && hour < 16) {
            System.out.println("Good Afternoon");
        } else {
            System.out.println("Hey there");
        }
    }

}
