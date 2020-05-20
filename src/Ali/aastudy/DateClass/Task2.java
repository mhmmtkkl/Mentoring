package Ali.aastudy.DateClass;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task2 {

    /*

        Create a method name is addMonth()
        parameter is int(addMonths)
        return type is String.

        Get a today date from the LocalDate class.
        add months to today date.
        and return the added date.

        For example:

        Today date is 05/11/2020
        addMonths is 5

        return should be 10/11/2020

     */

    public String addMonth(int addMonth){

        LocalDate lc = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/YYYY");

        lc = lc.plusMonths(addMonth);

        String dateFormatted = lc.format(formatter);

        return dateFormatted;

    }

    /*
        @Test
        class verify addMonth method is adding the month correctly
     */

    @Test
    public void test1 (){
        String actual = addMonth(5);

        String expected = "10/11/2020";

        Assert.assertEquals(expected , actual);

    }

}
