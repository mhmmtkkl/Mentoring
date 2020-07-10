package Ali.aastudy.Junit;

import org.junit.Assert;
import org.junit.Test;

public class JunitStart {

    /*

        Why we need Junit?

        We need to test our code to make is it working as expected or not.

        assertTrue   Assert.assertTrue( condition expected is true )
        assertFalse   Assert.assertFalse( condition expected is false )
        assertEquals   Assert.assertEquals(  expected , actual )  --> expected and actual should be equal
        assertNotEquals  Assert.assertNotEquals( expected , actual ) --> expected and actual should not be equal

     */

    public int sum(int num1 , int num2){


        return num1+num2;

    }

    @Test
    public void test1(){

        int result = sum(5,5);

        Assert.assertEquals(10,result);

    }

    @Test
    public void test2(){

        int result = sum(10,5);

        Assert.assertTrue("Expected result is 10 but your result is " + result,10==result);

    }

    @Test
    public void test3(){

        int result = sum(5,5);

        Assert.assertFalse("Expected result should bot be 10 but your result is " + result,10==result);

    }


}
