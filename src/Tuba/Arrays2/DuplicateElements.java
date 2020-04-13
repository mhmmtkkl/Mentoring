package Tuba.Arrays2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DuplicateElements {
    public static void main(String[] args) {
        // find the duplicate elements

        int[] arr = {1, 1, 2, 3, 4, 2, 5};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i ; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    System.out.println(arr[i] + " is myArray duplicate element");
                }
            }
        }

    }}
