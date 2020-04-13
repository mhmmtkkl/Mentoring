package loop_break_continue;

public class ForLoop {

    public static void main(String[] args) {


        /** simple for loop

         instead of writing same codes again again, we are using the for loop

         loop will iterate until condition is false

         it has special syntax


         */

        // initilize + condition + inc/dec
        // for ( int i = 0   ;  i < 5     ; i++   ){



        //counting from smaller to bigger number

        for (int i = 0; i < 5; i++){

            //for loop helps us to iterate until condition is false

            //inside of curly braces, you can reach i

            System.out.println("incresing i is here >>>> " + i);
        }










        //counting from bigger to smaller number


        for (int i = 5 ; i > 0; i--){
            System.out.println("decresing numbers " + i);
        }




        //example : sum the numbers from 1 to 5

        int total =0;

        for(int i =1; i <= 5; i++){

            total +=i;  //total = total + i;


        }

        System.out.println(total);









        System.out.println(">>>>>>>>>loop_break_continue.Task2");

    }




}
