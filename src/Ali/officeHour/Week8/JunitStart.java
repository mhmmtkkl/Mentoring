package Ali.officeHour.Week8;

import org.junit.Assert;
import org.junit.Test;

public class JunitStart {

    /*
        Why we need a Junit?

           Assert.assertTrue  (  condition : true )
           Assert.assertFalse  (  condition : false )
           Assert.assertEquals  ( expected , actual ) Expected result should match with actual result
           Assert.assertNotEquals ( expected , actual ) Expected result should NOT match with actual result

     */
//
//    public static void main(String[] args) {
//
//        String a1 = "asd";
//        String a2 = "asd2";
//
//        System.out.println(a1.equals(a2));
//
//        System.out.println("code is done ");
//
//    }

    @Test
    public void Test1(){

        String a1 = "https://www.etsy.com/cart";
        String a2 = "cart";

        Assert.assertTrue("A1 is "+a1+" should contain a2 and a2 is " + a2 ,a1.contains(a2));

    }

    @Test
    public void Test2(){

        String a1 = "https://www.etsy.com/cart";
        String a2 = "cart1";

        Assert.assertFalse("A1 is "+a1+" should contain a2 and a2 is " + a2 ,a1.contains(a2));

    }

    @Test
    public void Test3(){

        String a1 = "https://www.etsy.com/cart";
        String a2 = "https://ww";

        Assert.assertEquals(a1,a2);

    }

    @Test
    public void Test4(){

        String a1 = "https://www.etsy.com/cart";
        String a2 = "https://ww";

        Assert.assertNotEquals(a1,a2);

    }

}
