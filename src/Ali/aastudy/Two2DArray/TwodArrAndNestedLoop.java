package Ali.aastudy.Two2DArray;

import java.util.Arrays;

public class TwodArrAndNestedLoop {

    public static void main(String[] args) {

        /*
            loop for the
                    while loop
                    do while loop
                    infinite loop
                    nested loop
         */


        int[][] nums = {{1,2,3} , {4,4,5,6} , {7,8,9} };

//        in all array length
        System.out.println(nums.length);

//        second part of the 2d array length
        System.out.println(nums[1].length);

//        print all the array in one println
        System.out.println(Arrays.deepToString(nums));


//        print it in the for loop
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = 0 ; j < nums[i].length ; j++) {

                System.out.println(nums[i][j]);
                }
            }




    }



}
