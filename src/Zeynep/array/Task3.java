package array;

import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {


        // Write a Java program to find the duplicate values of an array of integer values
        int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};

        for (int i = 0; i < my_array.length-1; i++) {
            for (int j = i + 1; j < my_array.length; j++) {  //we dont want to compare number itself when we start from 0 for J

                if ((my_array[i] == my_array[j]) && (i != j)) {
                    {
                        System.out.println("Duplicate Element : " + my_array[j]);
                    }


                }
            }
        }


        //Write a Java program to find the duplicate values of an array of string values

        String[] my_array1 = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};

        for (int i = 0; i < my_array1.length-1; i++)
        {
            for (int j = i+1; j < my_array1.length; j++)
            {
                if( (my_array1[i].equals(my_array1[j])) && (i != j) )
                {
                    System.out.println("Duplicate Element is : "+my_array1[j]);
                }
            }
        }
    }
}




