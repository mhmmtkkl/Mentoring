package Ali.officeHour.DoWhileLoopSwitchStatement.switchStatement;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {

        /*
        Create a scanner object

        Create a string , Assign string to scanner

        if String is US
            print I live in United States
        if String is BEL
             print I live in Belgium
        if String is DEU
            print I live in Germany
            else
            print I live somewhere else

         */

        Scanner dp = new Scanner(System.in);

        String whereYouLive = dp.nextLine();

        switch (whereYouLive.toUpperCase()){
            case "US":
                System.out.println("I live in United States");
            break;
            case "BEL":
                System.out.println("I live in Belgium");
            break;
            case "DEU":
                System.out.println("I live in Germany");
            break;
            default:
                System.out.println("I live in somewhere else");

        }


    }

}
