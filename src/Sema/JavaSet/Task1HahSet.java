package Sema.JavaSet;

import java.util.HashSet;

public class Task1HahSet {
    /*
    (3 min)
       Write a Java program to append the specified element in the hash set.
       Red,Green,Black,White,Pink,Yellow
    */
    public static void main(String[] args) {
        //Create an empty hashSet
        HashSet<String> hashSet=new HashSet<>();
        //use add() method to add values in the hashSet
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Black");
        hashSet.add("White");
        hashSet.add("Pink");
        hashSet.add("Yellow");
        //print the hashset
        System.out.println("The Hash Set:"+hashSet);
    }
}
