package Ali.officeHour.Week3.doWhileLoop;

import java.util.Scanner;

public class whileLoopScanner2 {

    public static void main(String[] args) {

        Scanner dp = new Scanner(System.in);

        int totalLength= 0 ;

        while(dp.hasNext()){

            String s1 = dp.nextLine();

            System.out.println("s1 is here --> " + s1);

            int myLength = s1.length();

            totalLength += myLength;

            System.out.println("total length is here -->"+totalLength);

            if(totalLength>12){
                break;
            }
        }



    }
}
