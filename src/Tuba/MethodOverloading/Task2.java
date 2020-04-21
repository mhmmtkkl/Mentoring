package Tuba.MethodOverloading;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {
    //1st Example
    public static ArrayList<Integer> myList(ArrayList<Integer> list1) {
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int each : list1) {
            if (each < 100) {
                list2.add(each);
            }
        }
        return list2;
    }

    // 2nd example
    public static ArrayList<Integer> myList(ArrayList<Integer> list1, int num) {
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int each : list1) {
            if (each < num) {
                list2.add(each);
            }
        }
        return list2;
    }

    // 3rd Example
    public static ArrayList<Integer> myList1(ArrayList<Integer> list1, int... num) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int each : num) {
            if (each % 2 == 0) {
                list.add(each);
            }
        }
        return list;
    }

    // 4th Example
    public static ArrayList<String> replaceArrayList(ArrayList<String> color, String oldColor, String newColor) {
        for (int i = 0; i < color.size() - 1; i++) {
            if (color.get(i).equals(oldColor)) {
                color.set(color.indexOf(oldColor), newColor);
            }
        }
        return color;
    }

    public static void main(String[] args) {

    }

    // 6th Example
    public static ArrayList<String> removeShortLength(ArrayList<String> list, String... s) {
        for (String each : s) {
            list.add(each);
        }

        for (int i = 0; i < list.size() - 1; i++) {
            int l1 = list.get(i).length();
            int l2 = list.get(i + 1).length();
            if (l1 == l2) {
                list.remove(i);
            } else if (l1 > l2) {
                list.remove(i + 1);
            } else {
                list.remove(i);
            }
        }
        return list;
    }

    //7th Example
    public static ArrayList<Integer> minToFront(ArrayList<Integer> array) {
        int minIndex = 0;

        for (int i = 1; i < array.size(); i++) {
            if (array.get(minIndex) > array.get(i)) {
                minIndex = i;
            }
        }
        int minValue = array.remove(minIndex);
        array.add(0, minValue);
        return array;
    }


    public static ArrayList<Integer> fibonacciNumbers(int max) {
        ArrayList<Integer> myListFibonacci = new ArrayList<>();
        int[] array = new int[max + 2];
        array[1] = 1;

        for (int i = 2; i <= max; i++) {
            array[i] = array[i - 2] + array[i - 1];

            myListFibonacci.add(array[i]);

        }
        myListFibonacci.add(0, array[1]);
        return myListFibonacci;

    }


}

