package Sema.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        //does not allow duplicates
        //Set allows single null value.

        HashSet set=new HashSet();//comes unorder
        set.add(122);
        set.add("Abc");
        set.add(122.34);
        set.add(12);
        set.add('J');
        System.out.println(set);

        LinkedHashSet lhSet=new LinkedHashSet();
        lhSet.add(122); //insertion order
        lhSet.add("Abc");
        lhSet.add(122.34);
        lhSet.add(12);
        lhSet.add('J');
        System.out.println(lhSet);

        TreeSet tSet=new TreeSet();// allows just one data type
        tSet.add(122);
        tSet.add(122);
       // tSet.add("Abc");
       // tSet.add(122.34);
        tSet.add(12);
     //   tSet.add('J');
        System.out.println(tSet);


    }
}
