package Sena.M1_StringMethods;

public class M1_StringMethods {
    public static void main(String[] args) {

        /**
         * Presentation link:
         * https://docs.google.com/presentation/d/1_QjZGRVsPBghjjQHv81-MFRxmAnrJwfKLG9UaM9kLBs/edit?usp=sharing
         */

        /**
         * String Methods:
         * toLowerCase()
         * toUpperCase()
         * equals()
         * equalsIgnoreCase()
         * startsWith()
         * endsWith()
         * contains()
         * length()
         * charAt()
         * indexOf()
         * substring()
         * replace()
         * trim()

         */

        String myString = "Hello World";


        // Task 1: to capitalize all letters?

        System.out.println(myString.toUpperCase());

        System.out.println("---------------");

        ///////

        // Task 2: to have all small case letters?


        System.out.println(myString.toLowerCase());
        // remember that strings are immutable

        System.out.println("---------------");

        ///////

        // Task 3: to change something with another thing within the String?

        System.out.println(myString.replace("Hello", "Hi"));
        // while using replace, first include the oldChar then newChar

        System.out.println("---------------");

        ///////

        // Task 4: test if the String has the word "World"

        // 1. way
        System.out.println(myString.contains("World"));

        // 2. way
        System.out.println(myString.endsWith("World"));

        System.out.println("---------------");

        ///////

        // Task 5: test if the String has the word "hi"

        System.out.println(myString.contains("hi"));

        System.out.println("---------------");

        ///////

        // Task 6: test if the String starts with "Ha"

        System.out.println(myString.startsWith("Ha"));

        System.out.println("---------------");

        ///////

        // Task 7: test if the String ends with "world"

        System.out.println(myString.endsWith("world"));
        // this code will give you boolean result false since Java is case sensitive

        System.out.println("---------------");


    }
}
