package org.perscholas.example;

public class Calculator {
    public static void main(String[] args) {
        addition();
        subtraction();
        multiplication();
        division();
       // int a = 5;
      //  int b = '6';

      ///  a = b + a;
       // System.out.println("variable a: " + a);
    }

    public static void addition() {
        int a = 10;
        int b = 7;
        int sum = a + b;

        System.out.println("sum is: " + sum);
    }

    public static void subtraction() {
        int a = 20;
        int b = 5;
        int c = 0;

        if(a > b) {
           c = a - b;
           System.out.println("presenting: " + c);
        } else {
            c = b - a;
            System.out.println("presenting: " + c);
        }
    }

    public static void multiplication() {
        int x = 5;
        int y = 2;
        int z = x * y;

        System.out.println("answer is: " + z);
    }

    public static void division() {
        int num1 = 100;
        int num2 = 2;
        int num3 = num1 / num2 ;

        System.out.println("the answer is: " + num3);
    }


}


/*
* 20 min: Create a simple calculator program that has following four methods
    Addition of two numbers
    Subtraction of two numbers. Smaller number is always subtracted from larger one.
    Multiplication of two numbers
    Division of two numbers.
    Introduce three to four logical errors. Make sure your program compiles
20 minutes: Exchange your code with a classmate.
    Run the program in debugger mode and find the logical or computational errors
*/