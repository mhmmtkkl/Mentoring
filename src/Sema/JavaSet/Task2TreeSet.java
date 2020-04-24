package Sema.JavaSet;

import java.util.TreeSet;

public class Task2TreeSet {
    /*
    (5 min)
    Write a Java program:
    --> Create method  to add elements ArrayList to TreeSet. Parameters: TreeSet,int[]Array
    --> Create method that prints set elements in separate lines.
    --> {10, 27, 3, 40, 57, 6, 7, 8, 9, 10}
     */
    public static void main(String[] args) {
        TreeSet<Integer> numbers=new TreeSet<>();
        addElements(numbers,new int[]{10, 27, 3, 40, 57, 6, 7, 8, 9, 10});
        printSet(numbers);
    }
    //print
    private static void printSet(TreeSet<Integer> set) {
        for (Integer integer : set) {
            System.out.println(integer);
        }
    }

    //add arrayList to TreeSet
    private static void addElements(TreeSet<Integer> set, int[] elements) {
        for (int element : elements) {
            set.add(element);
        }
    }

}
