package Tuba.ifElseStatement;

import java.util.ArrayList;

public class ifElseIfStatement {
    public static void main(String[] args) {

        ArrayList<Long> myList = new ArrayList<>();
        long max =100;
        long first = 0;
        long second = 1;
        long c;

        for (int i = 0; i < max; i++) {
            c = first+second;
            first = second;
            second = c;
            myList.add(c);

        }
        myList.add(0, (long) 1);
        System.out.println(myList);
    }





    }
