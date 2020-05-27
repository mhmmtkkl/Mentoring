package array;

public class Task1 {

    public static void main(String[] args) {


        //Write a Java program to find the maximum and minimum value of an array.

        int[] myArray = {3, 4, 5, 6, 2, 3, 18, 1};




        System.out.println(findMaxValue(myArray));

        System.out.println(findMinValue(myArray));

    }

    public static int findMaxValue(int[] array){

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {

            int currentValue = array[i];

            if (currentValue > max){
                max = currentValue;
            }

        }


        return max;
    }

    public static int findMinValue(int[] array){

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {

            int currentValue = array[i];

            if (currentValue < min){
                min = currentValue;
            }

        }
        return min;
    }

}
