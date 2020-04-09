package Tuba.arrays;

import java.util.Arrays;

public class FindingTheSquareOfTheElements {
    public static void main(String[] args) {
        /*
        Given an int array and find the squares of the elements
        Example:{2,6,4,8}
        output:{4,36,16,64}
         */

        int []arr={2,6,4,8};
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]*arr[i];
        }
        System.out.println(Arrays.toString(arr));


    }
}
