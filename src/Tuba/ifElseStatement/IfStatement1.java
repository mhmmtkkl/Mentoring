package Tuba.ifElseStatement;

import java.util.Scanner;

public class IfStatement1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number:");

        int num = scan.nextInt();
        if (num > 0) {
            System.out.println(num +" is a positive number");
        }
        System.out.println("This line will execute all the time because it is out of if body");
    }
}
