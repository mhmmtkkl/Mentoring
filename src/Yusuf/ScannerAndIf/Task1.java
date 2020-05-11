package Yusuf.ScannerAndIf;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Coronavirus
        //Tell the people their risk for Coronavirus by asking their ages
        //10 and younger is "You're safe but don't kill other people"
        //Between 10 and 30 "You won't die but you'll get sick"
        //Between 30 and 60 "You'll get through it but it may be rough"
        //60 or older "Self-Quarantine"
        Scanner input = new Scanner(System.in);
        System.out.println("How old are you? ");
        int age = input.nextInt();

        if(age < 10){
            System.out.println("You're safe but don't kill other people");
        }
        else if(age >=10 && age <=30){
            System.out.println("You won't die but you'll get sick");
        }
        else if(age >30 && age <=60){
            System.out.println("You'll get through it but it may be rough");
        }
        else if(age > 60){
            System.out.println("Self-Quarantine!!!");
        }

    }
}
