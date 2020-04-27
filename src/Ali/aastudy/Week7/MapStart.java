package Ali.aastudy.Week7;

import java.util.HashMap;

public class MapStart {

    public static void main(String[] args) {

        /*
            Map is a key and value pair
            Key should be unique
            Value could be duplicated


         */


        HashMap<Integer , String> m1  = new HashMap<>();

        m1.put(1 , "New Jersey");
        m1.put(2 , "New York");
        m1.put(3 , "Georgia");
        m1.put(4 , "Ohio");
        m1.put(5 , "Florida");
        m1.put(3 , "New Jersey");

        System.out.println(m1);

        System.out.println(m1.get(2));

        System.out.println(m1.containsKey(3));

        System.out.println(m1.containsValue("sada"));

        m1.replace(4 , "California");

        System.out.println(m1);

        for(Integer i1 : m1.keySet()){
            System.out.println(i1);
        }

        for(String s1 :m1.values()){
            System.out.println(s1);
        }

    }


}
