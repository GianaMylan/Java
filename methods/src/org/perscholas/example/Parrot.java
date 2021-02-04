package org.perscholas.example;

import java.util.Calendar;
import java.util.Scanner;

public class Parrot {
    public static void main(String[] args) {
        reverseWord();
        primeNum();
        getUp();
    }

    public static void reverseWord() { //write a program that reverses a word

        Scanner read = new Scanner(System.in);
        System.out.println("Enter word or sentence: ");

        String str = read.nextLine();
        String reverse = "";

        for(int i = str.length() - 1; i >= 0; i--) { // break down the string by each character
            reverse = reverse + str.charAt(i); // building it back together in reverse
        }

        System.out.println("Reversed string: ");
        System.out.println(reverse);
    }

    public static void primeNum() { // prints all PRIME numbers from 1-20
        int i = 0;
        int num = 0;
        String primeNum = "";

        for(i = 0; i <= 20; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if(i%num==0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                primeNum = primeNum + i + " ";
            }
        }
        System.out.println("Prime numbers between 1 and 20: ");
        System.out.println(primeNum);
    }

    public static void getUp() { // 1st param: boolean name 'squawking'
        // 2nd param: hour of day util.Calendar 0-23
        // get up (true) when squawking is true if <time <6 && time >22>
        // everything else is false

        Calendar c = Calendar.getInstance();
        int currentHour = c.get(Calendar.HOUR_OF_DAY); // hour of day
        boolean squawking = true;

        if ( currentHour < 6 && currentHour > 22 && squawking == true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }// I wasn't quite sure what to put but I think this is the param
}
