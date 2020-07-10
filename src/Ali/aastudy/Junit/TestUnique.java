package Ali.aastudy.Junit;

import org.junit.Assert;
import org.junit.Test;

public class TestUnique {

    @Test
    public void test1(){

        Unique unique = new Unique();

        boolean result = unique.uniqueMethod("hello");

        Assert.assertTrue( "Result should be true but your result is " + result , result==false );

    }

    @Test
    public void test2(){

        Unique unique = new Unique();

        boolean result = unique.uniqueMethod("mouse");

        Assert.assertTrue( "Result should be true but your result is " + result , result==true );

    }

    @Test
    public void test3(){

        Unique unique = new Unique();

        /*
        I am as a tester need to ask for the requirement
        Can I enter just a space or not
        If the answer is yes
        Output should be false right ?
         */
        boolean result = unique.uniqueMethod("          ");

        Assert.assertTrue( "Result should be true but your result is " + result , result==false );

    }

    @Test
    public void test4(){

        Unique unique = new Unique();

        /*
        I am as a tester need to ask for the requirement
        Can I enter just a just a numbers
        If the answer is yes
        What should be the output?
         */
        boolean result = unique.uniqueMethod("123456789");

        Assert.assertTrue( "Result should be true but your result is " + result , result==true );

    }

    @Test
    public void test5(){

        Unique unique = new Unique();

        /*
        I am as a tester need to ask for the requirement
        Can I enter just a just a numbers
        If the answer is yes
        What should be the output?
         */
        boolean result = unique.uniqueMethod("1111111111111");

        Assert.assertTrue( "Result should be true but your result is " + result , result==false );

    }

    @Test
    public void test6(){

        Unique unique = new Unique();

        /*
        I am as a tester need to ask for the requirement
        Can I enter just a just a unique character
        If the answer is yes
        What should be the output?
        */

        boolean result = unique.uniqueMethod("*****************");

        Assert.assertTrue( "Result should be true but your result is " + result , result==false );

    }

    @Test
    public void test7(){

        Unique unique = new Unique();

        /*
        I am as a tester need to ask for the requirement
        Can I enter just a just a unique character
        If the answer is yes
        What should be the output?
         */

        boolean result = unique.uniqueMethod("/*-+!@#$%^&(");

        Assert.assertTrue( "Result should be true but your result is " + result , result==true );

    }


}
