package Ali.aastudy.tryCatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class tryCatchZeynepMentoring {

  /*
    Checked exception





    Unchecked exception  Runtime exeption


   */

    public static void main(String[] args){

//        Unchecked exception

//        int i = 10/0; //aritmetic exception

        try{

            String s1 = "Hello world";

            char s1index = s1.charAt(2); // String index out of bound exceptoin

            System.out.println(s1index);

        }catch(ArithmeticException e){

            System.out.println("in exception ");

        }finally {

            System.out.println("in finally ");
        }



//        Checked exception

        login();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    public static void login() {



        /*
        How do you handle date in java?
        I am using local dates in java to handle dates.

            Throw exception:
                it is in the method signature line
                If I am calling this method in the other method I need to add that throw to that method signature

            Try catch:
                We can create multiple catch in one try catch?
                What is Finally keyword in try catch?
                What kind of exceptions do you know?
                    Arithmetic exception
                    String out of bound exception
                    Array index out of bound exception
                    Null pointed exception

                Interrupted exception  --> If i use Thread.sleep
                FileNotFoundException  --> If i use FileInputStream

                If you write Exception like in the line 87 then you dont need to add(create different) other exception types

         */
        try {
            FileInputStream input = new FileInputStream("");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {

            System.out.println();
        }


    }


}
