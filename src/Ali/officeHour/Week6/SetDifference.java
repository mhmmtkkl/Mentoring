package Ali.officeHour.Week6;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDifference {

    /*

        Difference between sets

        HashSet LinkedHashSet TreeSet

        1) Ordering difference

        HashSet
             Print(return) randomly

        LinkedHashSet
            Print insertion order  or entered order

        TreeSet
            Print Alphabetical order , Number from smaller to bigger

        2) Performance difference
        HashSet > TreeSet > LinkedHashSet

     */

    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Lion");
        hashSet.add("Elephant");
        hashSet.add("Tiger");
        hashSet.add("Georaff");
        hashSet.add("Zebra");
        hashSet.add("Leopard");

        System.out.println("hashSet -->> " + hashSet);

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Lion");
        linkedHashSet.add("Elephant");
        linkedHashSet.add("Tiger");
        linkedHashSet.add("Georaff");
        linkedHashSet.add("Zebra");
        linkedHashSet.add("Leopard");

        System.out.println("linkedHashSet  -->> "+linkedHashSet);

        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("Lion");
        treeSet.add("Elephant");
        treeSet.add("Tiger");
        treeSet.add("Georaff");
        treeSet.add("Zebra");
        treeSet.add("Leopard");

        System.out.println("treeSet -->> " + treeSet);



    }

}
