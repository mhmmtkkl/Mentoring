package April14th;
import java.util.Random;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        //Task 2
        //Create a 2D array [5] by [4]
        //Fill the array with random numbers bound:50
        // {{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}}

        int array [][]=new int[5][4];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                int randomNumber =rand.nextInt(50);
                array[i][j]=randomNumber;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
