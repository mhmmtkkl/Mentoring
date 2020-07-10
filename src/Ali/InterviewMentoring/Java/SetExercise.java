package Ali.InterviewMentoring.Java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetExercise {

    public static void main(String[] args) {


        ArrayList<String> a1 = new ArrayList<>();
        a1.add("Lion");
        a1.add("Tiger");
        a1.add("Dog");
        a1.add("Elephant");
        a1.add("Cat");
        a1.add("Elephant");

        for(int i = 0 ; i < a1.size() ; i++){

            System.out.println(a1.get(i));

        }

        System.out.println("----------------------");

        LinkedHashSet<String> s3 = new LinkedHashSet<>();
            s3.add("Lion");
            s3.add("Tiger");
            s3.add("Dog");
            s3.add("Elephant");
            s3.add("Cat");

            for(String values:s3){

                System.out.println(values);

            }

    /*
            Create a method name is getSum

            add 3.23 , 3.10 , 5.12 , 10.12 , 23.12

            Parameter is HashSet double

            return is double

            result should be 44.69

            Sum all the numbers and return the result

     */

        HashSet<Double> hs1 = new HashSet<>();

        hs1.add(3.23);
        hs1.add(3.10);
        hs1.add(5.12);
        hs1.add(10.12);
        hs1.add(23.12);

        double result = 0;

        for (double s:hs1){

            result += s;

        }
        System.out.println(result);
    }

}
