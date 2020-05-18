package set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class Task1 {

    //    Populate your hash set with random numbers (you can use array or arraylist to populate)
    //    your hashSet size <= 10
    //    random numbers must be between 0-20


    public static HashSet<Integer>  createRandomset(HashSet<Integer>set, int number){

        Random rand = new Random();

        int[] arr = new int[number];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = rand.nextInt(20);

            set.add(arr[i]);

        }
       return set;
    }




    public static void main(String[] args) {
        HashSet<Integer> populated = new HashSet<>();

        createRandomset(populated, 10);

        System.out.println(populated);
        System.out.println(populated.size());
    }

    //Aydin's solution

//    public static ArrayList<Integer> populate(){
//        Random random = new Random();
//        ArrayList arrayList = new ArrayList();
//        int i = 0;
//        while(i<10){
//            int num1 = random.nextInt(20);
//            int num2 = random.nextInt(20);
//            if(num1 != num2){
//                arrayList.add(num1);
//                i++;
//            }
//        }
//        return arrayList;
//    }
//
//    public  static HashSet<Integer> toHashSet (ArrayList<Integer> arrayList){
//        HashSet<Integer> set= new HashSet<>();
//        for(Integer i: arrayList){
//            set.add(i);
//        }
//        return  set;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(toHashSet(populate()));
//    }










}
