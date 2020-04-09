package Tuba.arrays;

import java.util.Arrays;

public class ChangingTheString {
    public static void main(String[] args) {
        // you have a string "HeySiri"
        // change it to "ByeSiri"

      String str="HeySiri";
      char[] myArray=str.toCharArray();
   myArray[0]='B';
   myArray[1]='y';
   myArray[2]='e';

      for(int i=0;i<myArray.length;i++){
          //System.out.print(myArray[i]);
      }
        System.out.println(Arrays.toString(myArray));


    }
}
