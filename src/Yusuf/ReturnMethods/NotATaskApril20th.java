package April20th;

import java.util.Random;

public class NotATaskApril20th {
            //Task 1
 /*   public static int vowelCount(String a){
        int count=0;
        for(int i =0; i < a.length();i++) {
            if (a.charAt(i) =='a'||a.charAt(i) =='e'||a.charAt(i) =='i'||a.charAt(i) =='o'||
                    a.charAt(i) =='u'){
                count++;
            }
        }
        return count;
    }*/

            //Task 2

/*    public static boolean checkForSame(String a, String b){
                return  vowelCount(a)==vowelCount(b);
            }*/

            //Task 3

/*        public static String mixUpLetters(String str){
            char array[] = str.toCharArray();
            char newArray[]=new char[array.length];
            Random rand = new Random();
            String x = "";
            for (int i = 0; i <str.length(); i++) {
                int randomNum=rand.nextInt(str.length());
                String randomNumString = String.valueOf(randomNum);
                if(!x.contains(randomNumString)){
                    newArray[randomNum] = array[i];
                    x+=randomNum;
                }
                else{
                    randomNum=rand.nextInt(str.length());
                    i--;
                }
            }
            String mixUp = new String(newArray);

            return mixUp;
        }
    }*/



}
