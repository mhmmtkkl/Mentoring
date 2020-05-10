package Ali.officeHour.DoWhileLoopSwitchStatement.doWhileLoop;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        /*
            create one int

            do while int is less then 100

            print the number

            increment by 5

            for example: 0   5   10  15  20

         */

        Scanner dp = new Scanner(System.in);

        int i1 = dp.nextInt();

        do{
            System.out.println(i1);

            i1 += 5;
        }while(i1<=100);


    }


}
