package Ali.officeHour.Week2;

import java.util.Scanner;

public class scanner3 {

    public static void main(String[] args) {


            Scanner scan = new Scanner(System.in);

            System.out.println("Enter the password");

            String s1 = scan.nextLine();

            System.out.println(!s1.contains("Yusuf"));

            System.out.println(s1.length());

            System.out.println("enter two numbers");

            int i1 = scan.nextInt();

            int i2 = scan.nextInt();

            int total = i1+i2;

            System.out.println(total == 10);


        }
}
