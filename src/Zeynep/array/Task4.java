package array;

import java.util.Arrays;
import java.util.Random;

public class Task4 {

    public static void main(String[] args) {

        //    Return an array that contains the exact same numbers as the given array,
        //    but rearranged so that all the fives are grouped at the start of the array.
        //    The order of the non-five numbers does not matter. So {5,2,5,2,5} becomes {5, 5, 2, 2, 2}.
        //    You may modify and return the given array or make a new array.
//
//    Create an array as 5,2,5,2,5
//
//    result should be 5, 5, 2, 2, 2



        int[] arr = new int[]{5,2,5,2,5};

        int counter_Five = 0;

        int counter_Two = arr.length-1;

        int[] arr2 = new int[arr.length];

        for(int i = 0 ; i < arr.length ; i++){

            if(arr[i]==5){

                arr2[counter_Five] = 5;
                counter_Five++;

            }else{
                arr2[counter_Two] = 2;
                counter_Two--;


            }

        }

        System.out.println(Arrays.toString(arr2));

    }

}
