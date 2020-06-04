package Ali.officeHour.Abstract.Example;

import java.util.Random;

public class OverloadingVsOverriding {

      /*
        Override means:
            To understand the method comes from the parent class.
            When the method comes from the parent class
                1) Method should have the same name
                2) I can not change the parameter
                3) I can not chane the return type
                4) Overriding should happen in the two different classes ( parent - child )

        Overloading
                1) Method should have the same name
                2) I should change the parameter count or parameter type
                3) I can change the return type
                4) Overloading should be in the same class

        Note:
            In the overloading you have same name same parameter type and count
            But you have a different return type

            It it okay?

            ANSWER is NOOOO

                Why?
                    Because when i create a object of that class java doent know which method to run.

        Interface vs Abstract

        Overloading vs Overriding (Polymorphism)

     */

   public int RandomNumber(int num){

       Random rnd = new Random();

       return rnd.nextInt(num);

   }

    public void RandomNumber(String num){
        System.out.println("this is a random number ");
    }

    public void RandomNumber(){

    }



}
