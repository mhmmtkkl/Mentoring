import java.util.Scanner;

public class String1 {

    public static void main(String[] args) {

//        equals()   provide two Strings make sure one String is equal to other String

        String name = "Ali";

        System.out.println(name.equals("ali"));


//        equalsIgnoreCase()
        System.out.println("Enter your name: ");

        Scanner scanner = new Scanner(System.in);

        String scannerName = scanner.nextLine();

        System.out.println(name.equalsIgnoreCase(scannerName));

//         contains

        String lastName = "Koklu";

        System.out.println("Please enter your last name ");

        String scannerLastName = scanner.nextLine();

        System.out.println(lastName.contains(scannerLastName));

/*

        Task 1:
        Create string as city
                value as city name where you live.

                With a scanner add any city name

                Verify first String (city) is containing the second String (city) from scanner.

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
