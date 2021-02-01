package org.perscholas.example;

public class CalDebug {
    public static void main(String[] args) {
        System.out.println( add(2, 2) ); // -> 4
        System.out.println( subtract(2, 2) ); // -> 0
        System.out.println( multiply(4, 4) ); // -> 16
        System.out.println( divide(2, 2) ); // -> 1
    }
    public static int add(int x, int y) {
        return x + y;
    }
    public static int subtract(int x, int y) {
        return x - y;
    }
    public static int multiply(int x, int y) {
        return x * y;
    }
    public static int divide(int x, int y) {
        return x / y;
    }

}
