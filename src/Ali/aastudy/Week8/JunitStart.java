package Ali.aastudy.Week8;

import org.junit.Assert;

public class JunitStart {

    /*
        Why we need Junit?

        Testing is the process of checking the functionality of an application to ensure it runs as per requirements.
        Unit testing comes into picture at the developers’ level; it is the testing of single entity (class or method).
        Unit testing plays a critical role in helping a software company deliver quality products to its customers.

        We need to test our code to make is it working as expected or not.

        assertTrue
        assertFalse
        assertEquals
        assertNotEquals


     */

    public static void main(String[] args) {

        String str1 = "33.99";

        String str2 = "35.99";

//        Assert.assertEquals("Text str1 = "+ str1+ " and str2 "+str2 +" is not equal.",str1,str2);

        Assert.assertTrue("Text str1 = " + str1 + " and str2 " + str2 + " is not equal.",str1.equals(str2));

        System.out.println("Code is done");

    }

}
