package Ali.officeHour.Week3.switchStatement;

import java.util.Scanner;

public class task1 {

    /*
        Create one int

            if int is = 0
            print the i dont have any sibling

            if int is  = 1
            print the I have one sibling

            if int is = 2
            print the I have two sibling

            if int is more then 2
            print I have too many siblings

     */

    public static void main(String[] args) {

        Scanner dp = new Scanner(System.in);

        int countOfSibling = dp.nextInt();

        switch (countOfSibling){
            case 0:
                System.out.println("i dont have any sibling");
            break;
            case 1:
                System.out.println("I have one sibling");
            break;
            default:
                System.out.println("I have too many siblings");
            break;
            case 2:
                System.out.println("I have two siblings");
            break;
        }


    }




}
