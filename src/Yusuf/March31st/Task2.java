package March31st;

import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        //Task 2
        //What time of the day is it?
        //8 to 12 Good Morning
        //12 to 18 Good Afternoon
        //18 to 22 Good Evening
        //After 22 Good Night
        Scanner input = new Scanner(System.in);
        System.out.print("What time is it? ");
        int time = input.nextInt();

        if(time >= 8 && time < 12){
            System.out.println("Good Morning");
        }
        else if(time >= 12 && time <= 18){
            System.out.println("Good Afternoon");
        }
        else if(time >= 18 && time < 22){
            System.out.println("Good Evening");
        }
        else if(time >= 22){
            System.out.println("Good Night");
        }

    }
}
