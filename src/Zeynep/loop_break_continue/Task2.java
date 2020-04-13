package loop_break_continue;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
         /* todo 2.LOOP with scanner

        write a program that takes a number from console and

        print multiplication table according that number
        ex : number 3



         1 * 2 = 2
         2 * 2 = 4
         3 * 2 = 6
         4 * 2 = 8

         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Provide a number, please!!!");

        int num = scan.nextInt();   //if you write inside loop, when it iterates loop, it will want you to provide a number

        for (int i = 1 ; i <=10; i++){

            int multiply = num * i;

            System.out.println(num + " * " + i + " = " + multiply);
        }
    }
}
