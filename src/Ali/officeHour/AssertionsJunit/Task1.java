package Ali.officeHour.AssertionsJunit;

import org.junit.Assert;
import org.junit.Test;

public class Task1 {

    /*
        Create one method name is unique
        it is taking one string as parameter

        Return type is boolean

        If the parameter String is unique then return true

        else return false.

        For example:
            String is mouse

            return should be true


     */

    public boolean unique(String myStr){

        char[] arrayChar = myStr.toCharArray();
        boolean result = true;
        for(int i = 0 ; i < arrayChar.length ; i++){
            for(int j = i+1 ; j < arrayChar.length ; j++){
                if(arrayChar[i] == arrayChar[j]){
                    result=false;
                }
            }
        }
        return result;
    }

//    Negative scenario
//      False result
//      Which is my functionality shouldn t work

    @Test
    public void test1(){

        String str = "12345677";

        boolean b1 = unique(str);

        Assert.assertFalse(b1);

    }

    @Test
    public void test3(){

        String str = "          ";

        boolean b1 = unique(str);

        Assert.assertFalse(b1);

    }

    @Test
    public void test4(){

        String str = "//*-+^&*()";

        boolean b1 = unique(str);

        Assert.assertFalse(b1);

    }

    @Test
    public void test2(){

        String str = "";

        boolean b1 = unique(str);

        Assert.assertTrue(b1);

    }

    @Test
    public void test5(){

        String str = "asdfghj";

        boolean b1 = unique(str);

        Assert.assertTrue(b1);

    }

    /*

         How you can test elevator?

           1) press all numbers
           2) press emergency button (Who we gona call?)
           3) when i press 5 then i press open door
           4) I will press on 7. then press stop on 3th floor.
           5) I will press on 7. Power failure


     */


}
