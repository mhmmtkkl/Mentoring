package loop_break_continue;

import java.util.Random;

public class Task1 {

    public static void main(String[] args) {


        /* todo 1.LOOP

        write a program to calculate average of 4 random numbers using by for loop
         */

        Random rand = new Random();
//
//        int num1 = rand.nextInt(20);
//        int num2 = rand.nextInt(20);
//        int num3 = rand.nextInt(20);
//        int num4 = rand.nextInt(20);
//
//        int totalNum = num1 + num2 + num3 + num4;
//
//        System.out.println(totalNum);

        //how to sum hundreds of line code like that, will be hard, instead of writing one by one we need to use loop



        int totalNum = 0; //if you write this inside loop, before each iteration total will be assigned 0

        for (int i = 0; i < 4 ; i++) {


            int num = rand.nextInt(20);

            System.out.println(num);

            totalNum += num;

        }

        System.out.println("totalNum : " + totalNum);


    }
}
