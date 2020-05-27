package Ali.aastudy.tryCatch;

import java.util.ArrayList;

public class tryCatchIntro {

    public static void main(String[] args) {

        ArrayList<Integer> a1 = new ArrayList<>();

        int num =2;

        try {

            a1.add(1);
            a1.add(2);
            a1.add(3);
            a1.add(4);

            System.out.println(a1.get(num));

        }catch(Exception e){

            System.out.println("your ArrayList length is " + a1.size() + " you want to get a num -> " + num);

        }

    }

}
