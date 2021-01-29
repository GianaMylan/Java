package org.perscholas.example;

// shortcut for main method = "psvm" and then tab
// green play button means you can run the file now
// ** Name the class with capital letter **

public class main {

    public static void main(String[] args) {
        System.out.println("Hello, world!");
        buyKeychains();
        buyKeychains(12);
        buyKeychains("half a dozen");

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        int[] firstNumbers = new int[10]; //
        firstNumbers[0] = 100;
        System.out.println(firstNumbers[0]);

        int[]foo = {1, 2, 3};
        for(int bar: foo) System.out.println(bar); // auto iterate

        //ArrayList<String> food = new ArrayList<String>();
        //food.add("Spaghetti");
        //food.add("Pizza");
        //food.add("somethign else");
        //System.out.println(food);
    }
    // create methods below and then call back to it in main method
    //similar to calling functions

    public static void buyKeychains() { //regular method
        System.out.println("You bought a keychain.");
    }
    public static void buyKeychains(int number) { //method with number insertion
        System.out.println("You bought " + number + " keychains");
    }
    public static void buyKeychains(String phraseExample) { //method with a string insertion
        System.out.println("You bought " + phraseExample + " keychains and I think that's too many");
    }

    //morning lab
    //method max of two numbers
    //method max of three
    //method is character a vowel
    //method char count
    //method vowel count

}
