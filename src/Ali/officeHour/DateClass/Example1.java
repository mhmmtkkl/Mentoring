package Ali.officeHour.DateClass;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Example1 {

    /*
        Create one method name is addMonth()
        return type is String
        parameter is one int(myMonth)

        Get a today date
        add a month to today date
        and return the added date

     For example:

        Today date is 05/13/2020
        myMonth is 5

        return should be 10/13/2020



     */

    public static String addMonth(int myMonth){

        LocalDate ld = LocalDate.now();

        System.out.println("before adding month "+ld);

        ld = ld.plusMonths(myMonth);
//        ld.plusDays()
//        ld.plusYears()
//        ld.plusWeeks()

//        ld.minusYears()
//        ...

        System.out.println("after adding month "+ld );

        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("MM/dd/YYYY");

        String s1 = ld.format(myFormatter);

        System.out.println(s1);

        return s1;
    }

    public static void main(String[] args) {
        addMonth(4);

    }



}
