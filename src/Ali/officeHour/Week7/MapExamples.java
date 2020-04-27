package Ali.officeHour.Week7;

import java.util.HashMap;

public class MapExamples {

    /*

       get()

       containsKey()

       containsValue()

       keySet()

       values()

     */

    public static void main(String[] args) {

        HashMap<Integer , String> h1 = new HashMap<>();

        h1.put(1 , "Lion");
        h1.put(9 ,  "Tiger");
        h1.put(7 , "Elephant");
        h1.put(5 , "Zebra");
        h1.put(2 , "Dog");
        h1.put(6 , "Cat");
        h1.put(12 , "something");

//      get()
        System.out.println("value of 5 "+h1.get(5));

        System.out.println("value of 12 "+h1.get(12));

//      containsKey() check is key have the key in the parenthesis
        System.out.println(h1.containsKey(12));
        System.out.println(h1.containsKey(15));

//        containsValue()
        System.out.println(h1.containsValue("Cat"));

        System.out.println("---------------------");

//        keySet and values
        for(Integer i:h1.keySet()){
            System.out.println(i + " values " + h1.get(i));
        }




    }


}
