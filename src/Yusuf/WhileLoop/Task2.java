package Yusuf.WhileLoop;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Task 2
        //Get a user input
        //Print sum factor of all the numbers from 1 to user input using do-while loop.

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a limit: ");
        int userInput = input.nextInt();
        int i = 1;
        int sum = 1;
        do{
            sum *=i; // sum = sum * i;
            i++;
        }while(i <= userInput);
        System.out.println(sum);

    }
}
