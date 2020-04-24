package Sema.JavaSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Task3JavaSet {
    /*
      Step1---> Write a Java  Method to convert an Array to an ArrayList using add() in a loop.
        {"Pink", "Red", "Blue", "Pink", "Black", "Yellow", "Grey", "Black"}
       Step2--> in Main Method create HashSet, TreeSet, LinkedHashSet of given String Array and print them
      Step3 -->In Main Method add to color which is "Brown" in HashSet,TreeSet,LinkedHashSet
     */
    public static void main(String[] args) {
        ArrayList<String> list=ArrayListColors();

        HashSet<String>hashSet=new HashSet<>(list);
        hashSet.add("Brown");
        System.out.println("HashSet:"+hashSet);

        TreeSet<String> treeSet=new TreeSet<>(list);
        treeSet.add("Brown");
        System.out.println("TreeSet:"+treeSet);

        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>(list);
        linkedHashSet.add("Brown");
        System.out.println("LinkedHashset:"+linkedHashSet);

    }

    private static ArrayList<String> ArrayListColors() {
        ArrayList<String> colorList=new ArrayList<>();
        //convert Array to ArrayList
        String[] colors={"Pink", "Red", "Blue", "Pink", "Black", "Yellow", "Grey", "Black"};
        for (String color : colors) {
            colorList.add(color);
        }
        return colorList;
    }

}
