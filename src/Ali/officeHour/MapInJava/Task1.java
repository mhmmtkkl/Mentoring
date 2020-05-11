package Ali.officeHour.MapInJava;

import java.util.HashMap;

public class Task1 {

    /*
        Create one method name is removing

        Return type is HashMap<Integer,String>

        Parameter is HashMap<Integer , String> m1 , int num

        if s1 is in the m1 keys

        remove it from the map m1

        For example
        m1 = <1, "Lion">
              2, "Tiger"
              3, "Zebra"
              4, "Elephant"

          num 3

          result should be
            <1, "Lion">
              2, "Tiger"
              4, "Elephant"

     */

    public static HashMap<Integer , String> removing(HashMap<Integer , String> m1 , int num){

         m1.remove(num);

         return m1;

    }

    public static void main(String[] args) {

        HashMap<Integer , String> anyName = new HashMap<>();

        anyName.put(1 , "Apple");
        anyName.put(2 , "Orange");
        anyName.put(3 , "Banana");
        anyName.put(4 , "Kiwi");

        int myNum = 3;

        HashMap<Integer , String> myName = new HashMap<>();

        myName = removing(anyName , myNum);

        System.out.println(myName);


    }


}
