package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Task2 {

    //write a return method that check if a string is build out of the same letters as another string
    // ex same("abc", "cab);  >>>>true
    // ex same("abc", "abb);  >>>>false


    public static boolean isItsame(String one, String two){

//        //step1 split string and get the array
//
//        one.split("");
//
//        //step2 convert array to arraylist
//
//        Arrays.asList(one.split(""));
//
//        //step3 sort with TreeSet
//
//        new TreeSet<String>(Arrays.asList(one.split("")));
//
//        //step4 convert set to string

        String value1 = new TreeSet<String>(Arrays.asList(one.split(""))).toString();
        String value2 = new TreeSet<String>(Arrays.asList(two.split(""))).toString();


        return value1.equals(value2);


    }



    public static void main(String[] args) {


        String str1 = "caa";

        String str2 = "abc";

        System.out.println(isItsame(str1, str2));


    }

}
