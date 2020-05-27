package Sema.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        //stored elements as key& value
        //key must be unique
        //map does not allow duplicate keys while it allows duplicate values
        //map can have single null key at most and any number of null values.

        HashMap hm=new HashMap();//unorder
        hm.put("name","John");// key and value
        hm.put("age","25");
        hm.put("email","jonh@live.com");
        System.out.println(hm);

        // LinkedHashMap sorts the elements in the insertion order
        LinkedHashMap lHm=new LinkedHashMap();
        lHm.put("name","John");
        lHm.put("age","25");
        lHm.put("email","jonh@live.com");
        System.out.println(lHm);
        //Tree map sorts thr map in the ascending order of keys and of keys
        TreeMap tm=new TreeMap();
        tm.put("name","John");// key and value
        tm.put("age","25");
        tm.put("email","jonh@live.com");
        System.out.println(tm);



    }
}
