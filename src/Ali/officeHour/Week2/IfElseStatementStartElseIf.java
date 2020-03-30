package Ali.officeHour.Week2;

import java.util.Scanner;

public class IfElseStatementStartElseIf {

    public static void main(String[] args) {

      /*
        Using else if statement
                if first condition is not correct then JAVA is looking for the first else if statement
                   if first else if statement is false then JAVA will look for the second else if statement

      */

      /*

        Create two string

        if the first one contains second one then
        Print first String is containing the second String

        else if the first String is NOT contains second String then
        Print first String is NOT containing the second String

       */

        Scanner dp = new Scanner(System.in);

        String sentence = dp.nextLine();

            if(sentence.length()>15){

                System.out.println("your sentence is too long.");

            }else if (sentence.length()>10){

                System.out.println("your sentence is okay");

            }else if(sentence.length()>5){

                System.out.println("your sentence is too short");

            }


            //IF THE LENGTH OF THE STRING MORE THEN 15 THEN JAVA WILL PRINT ALL THE  System.out.println IN THE BELOW CODE

//        if(sentence.length()>15){
//
//            System.out.println("your sentence is too long ");
//
//        }
//        if (sentence.length()>10){
//
//            System.out.println("your sentence is okay");
//
//        }
//        if(sentence.length()>5){
//
//            System.out.println("your sentence is too short");
//
//        }

        System.out.println(14%3);
//            3 6 9 12
//              14 - 12 = 2


        /*
            create one int

            if int divide by 4 reminder is 0
            print number can divide by 4

            if int divide by 4 reminder is 1
            print num by 4 reminder is 1

            if int divide by 4 reminder is 2
            print num by 4 reminder is 2

            if int divide by 4 reminder is 3
            print num by 4 reminder is 3

         */


        /*
            Create one int name is room count

            if the room count is bigger then 3
                print Our houses doesnt have more then 3 rooms

            else if the room count is equal to 3
                print rent is 2500

            else if the room count is equal to 2
                print rent is 2000

            else if the room count is equal to 1
                print rent is 1500

            else if the room count is equal to 0
                print rent is 1400

         */




         /*

      multiple else if

        Create one scanner
        Create one String take the fruit you liked

        if the String equal to banana
            print You like banana

        else if String equal to apple
          print You like apple

        else if String equal to pineApple
          print You like pineApple

        else if String equal to watermelon
          print You like watermelon


       */




      /*

       && and operator in java

       || or operator in java

       */


        System.out.println("enter your username ");

        String username = dp.nextLine();

        System.out.println("enter your password ");

        String password= dp.nextLine();

        if(username.contains(password) || password.length()<5){

            System.out.println("Change your password");

        }else if(!username.contains(password) && password.length()>=5){

            System.out.println("Your password is accepted");

        }

/*
        Create two int

        int 1 name is star

        int 2 name is mile from city downtown

        if star  is < 3 and  mile is >5
        print this is too far and not a good hotel

        if star  is >= 3  and mile <5
        print we can stay here

            str = str.replaceAll("[^\\d.]", "");
         */

  /*

        multiple else if TASK

           create one Scanner
           create int budget = nextInt()

           if the budget is bigger then 10000
                print you can travel anywhere

              if the budget >7500 and less then 10000
                print you can travel anywhere except australia

              else if the budget > 5000 and less then 7500
                print you can travel just in US and europe

              else if budget > 2500 and less then 5000
                print you can travel just in US

              else if budget < 2500
                print stay at home

       */





      /*
      else statement

      if the and else if statements are all wrong

      then else statement is will be executed

       */

       /*
        create

        int age

            if the age is >= 60
                You are a senior citizen

            if age > 50
                you are in your 50s

            if age > 40
                you are in your 40s

             else
                you are so young  dude

         */

        /*
        multiple else if TASK

           create one Scanner
           create int score = nextInt()

           if the score is bigger then 90 less then 100
                print your result is A

                if the score is bigger then 80 less then 90
                print your result is B

                if the score is bigger then 70 less then 80
                print your result is C

                if the score is bigger then 60 less then 70
                print your result is D

                if the score is bigger then 50 less then 70
                print your result is E

                if less then 50 and bigger then 0
                print your result is F

       */

        /*
        create one int
            if int is 1
            print today is monday

            else if int is 2
            print today is tuesday

            else if int is 3
            print today is wednesday

            else if int is 4
            print today is thursday

            else if int is 5
            print today is friday

            else if int is 6
            print today is saturday

            else if int is 7
            print today is sunday

            else
            print this is not a valid day




         */


        System.out.println("code is done");




    }


}
