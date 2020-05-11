package Ali.officeHour.DoWhileLoopSwitchStatement.doWhileLoop;

import java.util.Scanner;

public class whileLoopScanner {

    public static void main(String[] args) {

        Scanner dp = new Scanner(System.in);

        int total =0;

        /*
            Has next: it allow you to type the number or String
            then it will run the code

         */
        while(dp.hasNext()){

            total+=dp.nextInt();

            System.out.println("total is here "+total);

            if(total>100){
                break;
            }
        }

        System.out.println("Code is finished");


    }

}
