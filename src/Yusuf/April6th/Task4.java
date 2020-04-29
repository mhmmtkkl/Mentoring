package Yusuf.April6th;
import java.util.Scanner;
import java.util.Random;
public class Task4 {
    public static void main(String[] args) {
        //Task 4
        //Create a game which you guess the computer's randomly selected number from 1 to 10
        //Don't end the game until you find the answer

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int randomNumber = rand.nextInt(8);
        System.out.print("Please guess a number: ");

        int yusuf = 1;
        while(yusuf > 0){
            int userInput = input.nextInt();
            if(userInput != randomNumber){
                System.out.print("Wrong, please try again: ");
            }
            else{
                System.out.println("Correct, the number was " + randomNumber);
                break;
            }
        }

    }
}

