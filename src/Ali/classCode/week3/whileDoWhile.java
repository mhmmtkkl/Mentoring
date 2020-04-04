package Ali.classCode.week3;

import java.util.Random;
import java.util.Scanner;

public class whileDoWhile {

    public static void main(String[] args) {

        Scanner dp = new Scanner(System.in);


//        int num = dp.nextInt();
//
//        while (num<20){
//
//            System.out.println("Hello World");
//
//            num++;
//
//        }


//         char letter ='a';
//
//         while (letter<='z'){
//             System.out.println(letter);
//             letter++;
//         }

    /*

        int total = 0;
            while(dp.hasNext()){

                if(total > 100) {
                    break;
                }
                total += dp.nextInt();
            }

            System.out.println(total);

     */

        /*

        Task 1
            create a int
            while int is less then 100

            print hello world and that int

            add +5 in the while loop

         */

        /*
        Task 2
        Create a string assign scanner to string

             in the while loop
             add string to it self

             if the string length is more then 10

             Start printing it

         */


//        int num = dp.nextInt();
//
//        do{
//
//            System.out.println(num);
//
//            num++;
//
//        }while (num<40);


/*
          Create one int for example 200

          Create one int from the scanner

          guess the number until you get it correct

          use do while loop

        do{

            System.out.println("Guess the password : ");
            guess = dp.nextLine();


        }while (!guess.equals(password));

        System.out.println("you are right bro");

*/

//        int number = 5 ;
//
//        do{
//            number+=5;
//            System.out.println(number);
//        }while (number<100);

/*
        while vs do while loop

           in the While loop condition is tested at the beginning of the loop, and if the condition is True, then only statements in that loop will be executed.

           In the do while loop condition is tested at the end of the loop. So, the Do While executes the statements in the code block at least once even if the condition Fails.

    */

//    int i = 0 ;
//    while(i>0){
//
//        System.out.println("i is here "+i);
//    }
//
//    int  u = 0 ;
//
//    do{
//        System.out.println("u is here "+u);
//
//    }while (u>0);


        /*

        Random class in java


         */


        int num = (int)(Math.random() *100);

        System.out.println(num);

        Random random = new Random();

        int i1 = random.nextInt(100);

        System.out.println(i1);

    }
}
