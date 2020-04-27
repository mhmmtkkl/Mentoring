package Ali.officeHour.Week6;

import java.util.HashSet;

public class Task1 {

    /*
       In the main method

       Create one HashSet Double

       add 3.23 , 3.10 , 5.12 , 10.12 , 23.12

       sum all the numbers and print them

            result should be 44.69

     */

    public static void main(String[] args) {

        HashSet<Double> hashSet = new HashSet<>();

        hashSet.add(3.23);
        hashSet.add(3.10);
        hashSet.add(5.12);
        hashSet.add(10.12);
        hashSet.add(23.12);

        double total = 0.0;

        System.out.println(hashSet);

        for(Double d1:hashSet){
             total += d1; //total = total + d1;
        }

        System.out.println(total);

    }



}
