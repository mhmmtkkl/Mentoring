package Ali.officeHour.Week2;

import java.util.Scanner;

public class scannerClass {

    public static void main(String[] args) {

//        scanner

        /*
            What is scanner
                Scanner is a class for getting the
           input of the primitive types like int, double, etc. and strings. It is the easiest way to read input in a Java program.

         */

        System.out.println("enter your username");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your username");

        String userName = scanner.nextLine();  // Read user input

        System.out.println("your name is  "+userName);

        System.out.println("Enter your pin");

        int pin = scanner.nextInt();

        System.out.println("Your pin is " + pin );

        System.out.println("are you attending all the classes");

        boolean areYouInTheClass = scanner.nextBoolean();

        System.out.println("are you in the class : "+areYouInTheClass );




//        nextBoolean()	Reads a boolean value from the user
//          scanner.nextBoolean();
//        nextByte()	Reads a byte value from the user
//          scanner.nextByte();
//        nextDouble()	Reads a double value from the user
//          scanner. nextDouble();
//        nextFloat()	Reads a float value from the user
//          scanner. nextFloat();
//        nextInt()	Reads a int value from the user
//          scanner. nextInt();
//        nextLine()	Reads a String value from the user
//          scanner. nextLine();
//        nextLong()	Reads a long value from the user
//          scanner. nextLong();
//        nextShort()	Reads a short value from the user


    }


}
