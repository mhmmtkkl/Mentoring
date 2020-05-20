package map;

import java.util.*;

public class Task1 {


    //create a hashMap accepts a list of 10 random number (bound 5) as a parameter
    //check this hashMap if any single integer occurs
    //  3 times in the list, print out "I have 3 same values in map"

    //Hint: if the list has same value in 3 times, consider to check frequency of value

    //step1
    public static ArrayList<Integer> createList(){

        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int number = rand.nextInt(5);

            list.add(number);
        }

        return list;
    }

    //step2

    public static HashMap<Integer,Integer> generateMap(ArrayList<Integer> list){

        HashMap<Integer,Integer> map = new HashMap<>();

//        int number = (int)(Math.random()*11);
//        map.put(number, 0);
//

        for (Integer key : list) {
            if (map.containsKey(key)){
                Integer value = map.get(key);
                value++;           //we will increase value if there is any duplicate elements inside list.
                map.put(key,value);
            }else {
                map.put(key, 0);
            }
        }

        return map;
    }

    public static void checkContains3(HashMap<Integer,Integer> map){

        Collection<Integer> values = map.values();

        for (Integer value : values) {

            if (value==3){
                System.out.println("I have 3 same values in map");
            }

        }
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = createList();
        System.out.println(list);

        HashMap<Integer,Integer> map = generateMap(list);

        System.out.println(map);
       //checkContains3(map);
    }




}
