package array;

import java.util.Arrays;

public class ArrayQuestion {

    public static void main(String[] args) {


        //advance zeroPoint
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

            if(arr[i]==2){

                arr2[counter_Five] = 5;
                counter_Five++;

            }else{
                arr2[counter_Two] = 2;
                counter_Two--;


            }

        }

        System.out.println(Arrays.toString(arr2));








        //array reverse
//    Given an integer which is 123, reverse digits of an integer.
//            Example :
//    Input: 123
//    Output: 321

//        int [] reverse = {1, 2, 3};
//
//        int length = reverse.length;
//
//        for (int i = length -1; i >= 0; i--) {
//
//            System.out.print(reverse[i]);
//
//        }
//
//        System.out.println("--------------");
//






        //array bothends

//    Given an array of ints, return a new array length 2 containing the first and last elements from the original array.
//
//    create int array  ([1, 2, 3, 4])
//
//    result should be [1, 4]


//        int[] original  = {1, 2, 3, 4};
//
//        int[] newOne  = new int[2];
//
//        for (int k = 0; k < newOne.length; k++) {
//            {
//
//                for (int i = 0; i < original.length; i++) {
//
//                    if (i == 0) {
//
//                        newOne[k] = original[i];
//
//                    } else if (i == original.length - 1) {
//
//                        newOne[newOne.length-1] = original[i];
//                    }
//
//                }
//
//            }
//        }
//        System.out.println(Arrays.toString(newOne));







        //word count

//    Create a string "Removes white space from both ends of a string"
//
//    print the count of word in the string


//        String s1 = "Removes white space from both ends of a string";
//
//        String []wordCount = s1.split(" ");
//
//        System.out.println(wordCount.length);








        //advance array getsum

//    Create a String "$12 $23 $10 $2 $5 $2"
//
//    remove the $ sign and sum all the numbers
//
//    print the total of the numbers


//        String[] cost = {"$12", "$23", "$10", "$2", "$5", "$2"};
//
//
//        int total = 0;
//
//        for (int i = 0; i < cost.length; i++) {
//
//            String remove = cost[i].replace("$", "");
//
//            int removes = Integer.parseInt(remove);
//
//            total += removes;
//        }
//        System.out.println(total);


        //dos'un dersten

//    Write a Java program to find the duplicate values of an array of integer value

//    Write a Java program to find the maximum and minimum value of an array.

//    Write a Java program to copy an array by iterating the array

    }
}
