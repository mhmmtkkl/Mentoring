package Ali.officeHour.DateClass;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Example2 {

    /*
        Create one method which Compare dates
        two string parameter (date1 , date2)
        return is int

        difference between date1 , date2

    For example:
        date1: 01-01-2000
        date2: 01-01-2020

        result should be 20

        Check how to compare to dates with month and days
        getMonthValue()

        Following code should return a 17

     */

    public static int compareDates(String date1 , String date2){

        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate myDate1 = LocalDate.parse(date1 , dt);

        LocalDate myDate2 = LocalDate.parse(date2 , dt);

        int compare = myDate1.compareTo(myDate2);

        return compare;

    }

    public static void main(String[] args) {

        System.out.println(compareDates("13-05-2020" , "14-05-2002"));

    }

}
