package map;

import java.util.*;

public class Task2 {
    //  Total Payment
    // original price
    // discount
    // cardHolder discount

    // market        | original price  | discount | cardHolder discount | Total
    // Walmart       |     30          |    5     |     0               |   25
    // WEGMANS       |     25          |    3     |     5               |   17
    // Trader's JOE  |     20          |    0     |     0               |   20


    //walmart
        //30,5,0
    //wegmans

    // step1 create method that return Map of market and prices, discount

    public static HashMap<String, List<Integer>> generateMap(){

        HashMap<String, List<Integer>> map = new HashMap<>();

        String market = "Walmart";
        List<Integer> prices = Arrays.asList(30, -5, 0);

        map.put(market,prices);

        market = "Wegmans";
        prices = Arrays.asList(25,-3,0);

        map.put(market,prices);

        market = "Trader's Joe";
        prices = Arrays.asList(20, 0 ,0);

        map.put(market,prices);

        return map;


    }

    // // step 2 create method that calculates total prices of an item

    public static  int getTotal(HashMap<String, List<Integer>> map,String position){

        List<Integer> values = map.get(position);

        int total = 0;
        for (Integer value : values) {
            total+=value;
        }

        return total;

    }


    public static void main(String[] args) {
        HashMap<String, List<Integer>> map = generateMap();
        System.out.println(map);

        System.out.println("walmart " + getTotal(map,"Walmart"));
        System.out.println("wegmans " + getTotal(map,"Wegmans")); //yesterday I did mistake to write proper name like on the top names
        System.out.println("traders joes " + getTotal(map,"Trader's Joe"));
    }

    //Aydin's solution

//    public static List<Integer> generateList(){
//        Random random = new Random();
//        List<Integer> list  = new ArrayList<>();
//        for (int i = 0; i <10 ; i++) {
//            list.add(random.nextInt(5));
//
//        }
//        return list;
//    }
//
//
//    public static HashMap<Integer, Integer> countHashMat(List<Integer> list){
//        HashMap<Integer, Integer> hashMap = new HashMap<>();
//
//        ArrayList <Integer> arrayList = new ArrayList<>();
//
//        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(list);
//
//        ArrayList <Integer> arrayList1 = new ArrayList<>(hashSet);
//
//        for (int i = 0; i < arrayList1.size() ; i++) {
//            Integer count = 0;
//            for (int j = 0; j <list.size() ; j++) {
//                if(arrayList1.get(i) == list.get(j)){
//                    count ++;
//                }
//            }
//            arrayList.add(count);
//        }
//
//        for (int i = 0; i < arrayList.size(); i++) {
//            hashMap.put(arrayList1.get(i), arrayList.get(i));
//        }
//        return hashMap;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(countHashMat(generateList()));
//    }
//}

}
