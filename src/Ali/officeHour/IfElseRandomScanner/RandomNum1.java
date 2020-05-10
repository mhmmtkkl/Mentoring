package Ali.officeHour.IfElseRandomScanner;

import java.util.*;

public class RandomNum1 {

    public static void main(String[] args) {
//
//        Random random = new Random();
//
//        int randomAge = random.nextInt(10);
//
//        System.out.println(randomAge);
//
////      create random double
//
//        double randomDouble = random.nextDouble();
//
//        System.out.println( "random Double   "+randomDouble * 30 );


        LinkedHashSet<String> s1 = new LinkedHashSet<>();

        s1.add("Germany");
        s1.add("France");
        s1.add("USA");
        s1.add("Canada");
        s1.add("Mexico");
        s1.add("Brazil");

        System.out.println(s1);

        s1.remove("Germany");

        System.out.println(s1);

        System.out.println("--------------");

        HashMap<Integer , String> m1 = new HashMap<>();

        m1.put(1,"Lion");
        m1.put(2,"Tiger");
        m1.put(3,"Elephant");
        m1.put(4,"Cat");
        m1.put(5,"Dog");

        m1.remove(3);
        m1.remove(5);



        for(String s:m1.values()){

            System.out.println(s);
        }



        HashMap<Integer, Float> map = new HashMap<Integer, Float>();

        //Adding key-value pairs to HashMap

        map.put(1,  2f);

        map.put(2, 5f);

        map.put(3, 10f);

        map.put(4, 18f);

        //Checking whether key '3' exist in map

        System.out.println(map.containsKey(3));      //Output : true

        //Checking whether value '3.3' exist in map

        System.out.println(map.containsValue(3.3));   //Output : true





        /*




 */



    }
}



