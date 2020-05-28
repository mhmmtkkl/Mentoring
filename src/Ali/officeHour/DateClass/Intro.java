package Ali.officeHour.DateClass;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Intro {

    /*

        Date in java.

        What is date class?
            With a date class we are able to create a date.

        How we gona use date class?
            While writing the date in the singup page.
            For example :
                Today is 5/13/2020

                If type 5/14/2002 then web site should give an error.

                But Tomorrow which is 5/14/2020  then I need to type 5/15/2002

        How much time we need to spend on date classes?
             Focus on talking on date class for the interview.

     */

    /*
        Date for today and change it to MM/dd/YYYY and print it.
     */

        public static void today(){

                LocalDate ld = LocalDate.now();

                System.out.println(ld);

                DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("MM/dd/YYYY");

                String s1 = ld.format(myFormatter);

                System.out.println(s1);

        }

    public static void main(String[] args) {

            today();

    }

    /*
        Why we are taking this exam is to understand agile system easier. In the interview we will be more comfortable. Right?

     */
}
