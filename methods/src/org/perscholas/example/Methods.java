package org.perscholas.example;

public class Methods {
    public static void main(String[] args) {
        maxOfTwoNumbers();
        maxOfThree();
        isAVowel();
        charCount();
        vowelCount();
    }
    public static void maxOfTwoNumbers() {
        int x = 10;
        int y = 20;
        System.out.println("Highest number is " + Math.max(x,y));
    }

    public static void maxOfThree() {
        int a = 2;
        int b = 9;
        int c = 20;
        if(a > b && a > c) {
            System.out.println(a + " is the largest number.");
        } else if (b > a && b > c ) {
            System.out.println(b + " is the largest number.");
        } else {
            System.out.println(c + " is the greatest number.");
        }
    }

    public static void isAVowel() {
        char letter = 'T';

        switch (letter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
                System.out.println(letter + " is a vowel.");
                break;
            default:
                System.out.println(letter + " is not a vowel.");
        }
    }

    public static void charCount() {
        String str = "a string";

        System.out.println("Length of string is: " + str.length());
    }

    public static void vowelCount() {
        int count = 0;
        String str = "This is a test sentence.";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'y') {
                count ++;
            }
        }
        System.out.println("The sentence has " + count + " characters.");
    }



}
