package Ali.aastudy.DateClass;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task3 {

    /*
        Create method name is compareDate()
        Parameter is two String (date1 , date2)
        return type is int

        Compare the difference between the dates
        Print the result

        For example:
        date1: 01/01/2000
        date2: 01/01/2020

        result should be 20
   */

    private int compareDate(String date1, String date2){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MM-yyyy");

//        changing String to LocalDate date1
        LocalDate lcDate1 = LocalDate.parse(date1 ,formatter);

//        changing String to LocalDate date2
        LocalDate lcDate2 = LocalDate.parse(date2 ,formatter);

        int difference = lcDate1.compareTo(lcDate2);

        return difference;

    }

    /*
        Create test methods and verify compareDate method is working as expected.


     */

    @Test
    public void test1(){

        int actual = compareDate("13-05-2020" , "14-05-2002");

        int expected = 17;

        Assert.assertEquals(expected, actual);

    }
}
