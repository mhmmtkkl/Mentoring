package officeHour;

import java.util.Scanner;

public class String1 {

    public static void main(String[] args) {

//        equals()   provide two Strings make sure one String is equal to other String

        String name = "Ali";

        System.out.println(name.equals("ali"));


//        equalsIgnoreCase()
        System.out.println("Enter your name: ");

//        Scanner scanner = new Scanner(System.in);
//
//        String scannerName = scanner.nextLine();
//
//        System.out.println(name.equalsIgnoreCase(scannerName));


//         contains

        String lastName = "James";

        String lastNameContains=  "Jam";

        System.out.println("is James contains jam "+lastName.contains(lastNameContains));


//        System.out.println("Please enter your last name ");
//
//        String scannerLastName = scanner.nextLine();
//
//        System.out.println(lastName.contains(scannerLastName));

/*

        Task 1:
        Create string as your full name

                Create one more String as your last name

                Verify full name String contains last name String

 */

//        upperCase()
    //         make the string upper case

//        lowerCase
    //         make all the String as lower case

//        replace()
    //         replace the char with an other char

            String state = "ohio , California" ;

            state = state.replace("o" , "T");

            System.out.println(state);

            state = state.replace("T" , " ");

            System.out.println(state);

//        trim()





    }
}
