package Tuba.ifElseStatement;

import java.util.Scanner;

public class ifElseStatementWithAbsoluteValue {
    public static void main(String[] args) {

        /*
        take a number and find the absolute value of your number
        Example if number is 1 the output will be again 1
        if the number is -1 the output will be 1
         */
        // -5= -5 * -1=5 // this is a rule how you convert ur negative num to positive num

        Scanner scan = new Scanner(System.in);
        int myNum = scan.nextInt();

        if(myNum<0){
            System.out.println(myNum*(-1));

        }else{
            System.out.println(myNum);
        }
    }
}
