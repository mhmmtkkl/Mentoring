package Ali.aastudy.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDifferences {

    /*
        map differences

        Order
        Hash map -> random order
        Three map -> alphabetical order
        Linked hash map -> insertion order or enter order

        null keys and values
            hashmap --> one null key and multiple  null values
            Linked hash map  --> one null key and multiple  null values
            tree map --> non null key and multiple null values

     */

    public static void main(String[] args) {

        HashMap<Integer , String> h1 = new HashMap<>();

        h1.put(1, "Apple");
        h1.put(2, "Berry");
        h1.put(3, "Kiwi");
        h1.put(4, null);
        h1.put(10, null);
        h1.put(6, "Orange");
        h1.put(12, "Banana");
        h1.put(5, "Pineapple");
        h1.put(9, "Orange");
        h1.put(13, "Banana");
        h1.put(null, "Pineapple");
        h1.put(null, "Orange");

        for(Integer i1 : h1.keySet()){

            System.out.println(i1 +" "+h1.get(i1));

        }

        System.out.println("---------------------");

        TreeMap <Integer , String > t1 = new TreeMap<>();

        t1.put(1, "Apple");
        t1.put(2, "Berry");
        t1.put(3, "Kiwi");
        t1.put(4, "Banana");
        t1.put(10, "Pineapple");
        t1.put(6, "Orange");
        t1.put(12, null);
        t1.put(5, null);
        t1.put(9, "Orange");
        t1.put(18, "Banana");
        t1.put(19, "Pineapple");
        t1.put(8, "Orange");

        for(Integer i1 : t1.keySet()){

            System.out.println(i1 +" "+t1.get(i1));

        }

        System.out.println("-----------------");
        LinkedHashMap<Integer , String > l1 = new LinkedHashMap<>();

        l1.put(1, "Apple");
        l1.put(2, "Berry");
        l1.put(3, "Kiwi");
        l1.put(4, null);
        l1.put(10, "Pineapple");
        l1.put(6, null);
        l1.put(null, "Banana");
        l1.put(5, "Pineapple");
        l1.put(null, "Orange");
        l1.put(13, "Banana");
        l1.put(15, "Pineapple");
        l1.put(8, "Orange");

        for(Integer i1 : l1.keySet()){

            System.out.println(i1 +" "+l1.get(i1));

        }

    }




}
