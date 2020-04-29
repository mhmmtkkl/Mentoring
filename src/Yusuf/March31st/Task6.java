package March31st;

import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        //Task 6
        //Get 5 numbers from the user and determine if they are even or odd.
        //Sum the numbers that are even and and print them.
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter 5 numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();

        int even = 0;

        if (num1%2==0){
            even+=num1;// even = even + num1;
        }
        if (num2%2==0){
            even +=num2;
        }
        if (num3%2==0){
            even +=num3;
        }
        if (num4%2==0){
            even +=num4;
        }
        if (num5%2==0){
            even +=num5;
        }
        System.out.println(even);

    }
}
