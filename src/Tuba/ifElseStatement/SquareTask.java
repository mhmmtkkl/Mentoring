package Tuba.ifElseStatement;



import java.util.ArrayList;
import java.util.Scanner;

public class SquareTask {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();
        array.add(9);
        array.add(7);
        array.add(8);
        int minIndex = 0;

        for (int i = 1; i < array.size(); i++) {
            if (array.get(minIndex) > array.get(i)) {
                minIndex = i;
            }
        }

        int minValue = array.remove(minIndex);
        array.add(0, minValue);

        System.out.println(array);
    }

}

