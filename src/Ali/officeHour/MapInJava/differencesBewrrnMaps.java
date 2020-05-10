package Ali.officeHour.MapInJava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class differencesBewrrnMaps {

    /*

    Difference between hashMap , LinkedHashMap , TreeMap

        Order: HashMap --> Printing randomly

               LinkedHashMap --> Printing as insertion order or entered order

               TreeMap --> Alphabetical order or number from smaller to bigger

        Null keys and values:
              HashMap and linked hash map --> one null key and multiple null values

              TreeMap --> I can not have any null key and I can have multiple null values.

     */

    /*
    ArrayList vs Map
        1)  ArrayList is containing just values.

        1)  Map is containing key and value pair.

        2) Arraylist can have multiple duplicated values

        2) Map Key should be unique and value can be duplicated.

        3) Arraylist can have multiple null values

        3) Map can have one null key and multiple null values

     */

    public static void main(String[] args) {

        HashMap<Integer , String> h1 = new HashMap<>();

        h1.put(1 , "Lion");
        h1.put(9 ,null);
        h1.put(7 , "Elephant");
        h1.put(null , "Zebra");
        h1.put(2 , null);
        h1.put(null , "Cat");
        h1.put(2 , "something");

        System.out.println(h1);

        LinkedHashMap<Integer , String> l1 = new LinkedHashMap<>();

        l1.put(1 , "Lion");
        l1.put(9 , null);
        l1.put(7 , "Elephant");
        l1.put(null , "Zebra");
        l1.put(2 , null);
        l1.put(3 , "Cat");

        System.out.println(l1);

        TreeMap<Integer , String> t1 = new TreeMap<>();

        t1.put(1 , "Lion");
        t1.put(9 , "Tiger");
        t1.put(7 ,  null);
        t1.put(8 , "Zebra");
        t1.put(2 , null);
        t1.put(3 , "Cat");

        System.out.println(t1);

    }




}
