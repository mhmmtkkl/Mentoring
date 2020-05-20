package array;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {

        //Print elements that are greater than avarage

        int[] numbers = {30, 40, 100, 155, 23, 136};

        int total = 0;

        double average = 0 ;

        for (int number : numbers) {

            total += number;
            average = total / numbers.length;


        }
        System.out.println("average " + average);

        for (int number : numbers) {

            if (number > average){

                System.out.println(number);
            }

        }











        }




    }

//    public static int[] removeNumbersGreaterThanHundred(int[] number, int[] removed){
//
//        int counter = 0;
//
//        for (int i : number) {
//
//            if (i <= 100){
//                counter++;
//                for (int i1 : removed) {
//                    i1 = i;
//                }
//
//            }
//
//        }
//
//        return removed;
//    }

