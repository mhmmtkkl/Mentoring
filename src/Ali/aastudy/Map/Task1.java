package Ali.aastudy.Map;

public class Task1 {

        /*
            Do this together

            Create a method name is check

            Return type is boolean

            This method will take one map<String , String> m1 and one String s1

            Check if the m1 key is containing s1

            Call this method from main and print the result


         */


//        public static boolean check(HashMap<String , Integer > m1 , String s1){
//
//            boolean result = m1.containsKey(s1);
//
//            return result;
//        }
//
//         public static void main(String[] args) {
//
//            HashMap<String, Integer> myMap = new HashMap<>();
//            myMap.put("Germany",8000);
//            myMap.put("USA",12000);
//            myMap.put("France",15000);
//
//            String s1 = "knln";
//
//            boolean checkResult = check(myMap, s1);
//
//            System.out.println(checkResult);
//
//    }


    // TASK 2

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


//    public static HashMap<Integer , String> removing(HashMap<Integer,String> m1, int num){
//
//        m1.remove(3);
//
//        return m1;
//    }
//
//    public static void main(String[] args) {
//
//        HashMap<Integer , String> m1 = new HashMap<>();
//
//        m1.put(1,"Lion");
//        m1.put(2,"Tiger");
//        m1.put(3,"Zebra");
//        m1.put(4,"Elephant");
//
//        int num= 3;
//
//        HashMap<Integer , String> s1 =    removing(m1 ,num);
//
//        System.out.println(s1);
//    }

    /*
        Task 3

        Create one method name is merge

        return type is HashMap<String ,Double>

        parameters are TWO HashMap<String , Double >

        merge two HashMap

        return the merged hashMap

        Call merge method in the main method and print the map

     */

//    public static HashMap<String , Double> merge(HashMap<String , Double> m1 , HashMap<String , Double> m2){
//
//        m1.putAll(m2);
//
//        return m1;
//    }
//
//    public static void main(String[] args) {
//
//        HashMap<String , Double> map1 = new HashMap<>();
//
//        map1.put("cucumber",3.12);
//        map1.put("egg",2.00);
//        map1.put("toilet paper" , 50.00);
//        map1.put("bread" , 4.00);
//
//        HashMap<String , Double> map2 = new HashMap<>();
//
//        map2.put("honey",5.00);
//        map2.put("water",3.00);
//        map2.put("tea" ,6.00);
//        map2.put("chicken" , 10.00);
//
//        HashMap<String, Double> result = new HashMap<>();
//
//        result =  merge(map1, map2);
//
//        System.out.println("result unsorted -->>  "+result);
//
//        TreeMap<String,Double> resultSorted = new TreeMap<>();
//
//        resultSorted.putAll(result);
//
//        System.out.println("resultSorted -->> "+resultSorted);
//
//    }

}
