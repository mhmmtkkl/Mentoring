package map;

import java.util.HashMap;
import java.util.HashSet;

public class Task3 {

    /* Write a method isUnique that accepts a Map from strings to strings as a
     * parameter and returns true if no two keys map to the same value (and false
     * if any two or more keys do map to the same value).
     */

    public static boolean isUnique(HashMap<String, String> map){

        HashSet<String> set = new HashSet<String>();

        //1.step

//        for(String key : map.keySet()) {
//            String value = map.get(key);
//
//            if(set.contains(value))
//                return false;
//
//            set.add(value);
//        }

        //2.step
        for (String s : map.keySet()) {
            String value = map.get(s);

            set.add(value);

            if (set.contains(value)){
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("Marty", "Stepp");
        map.put("Stuart", "Reges");
        map.put("Kendrick", "Perkins");
        map.put("Jessica", "Stepp");
        map.put("Hal", "Reges");

        System.out.println(isUnique(map));
    }
}
