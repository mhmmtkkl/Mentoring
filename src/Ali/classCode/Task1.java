package Ali.classCode;

import java.util.Scanner;

public class Task1 {

    /*
        Create two Strings

        if total of the two String length is more then 15
        print your Strings are too long

        if  total of the two String length is less then 15
        print your Strings are okay

     */

    public static void main(String[] args) {

        Scanner dp = new Scanner(System.in);

        System.out.println("enter first String");
        String str1 = dp.nextLine();

        System.out.println("Enter second String");
        String str2 = dp.nextLine();

        int total = str1.length() + str2.length();

        if(total>15){

            System.out.println("your Strings are too long ");

        }

        if(total < 15){

            System.out.println("your Strings are okay");

        }

    }




}
