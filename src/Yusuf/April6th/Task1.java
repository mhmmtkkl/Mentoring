package Yusuf.April6th;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        //Task 1
        //Get a value from the user
        //Write a program to print numbers from 1 to user input using do while loop.

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a limit: ");
        int userInput = input.nextInt();
        int i = 0;

        do{
            System.out.println(i);
            i++;
        }while(i <= userInput);
    }
}
