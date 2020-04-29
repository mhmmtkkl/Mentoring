package March31st;

import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        //Task 3
        //Password Strength checker
        //The password must contain any of these characters "* \ . , $"
        //Length == 8

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a password to check it's strength: ");
        String pw = input.nextLine();

        if ((pw.contains("*") || pw.contains("\\") || pw.contains(".") || pw.contains(",") || pw.contains("$")) && pw.length() == 8){
            System.out.println("Your password seems strong!");
        }
        else {
            System.out.println("You need a stronger password");
        }



    }
}
