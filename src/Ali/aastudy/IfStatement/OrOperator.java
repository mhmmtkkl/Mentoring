package Ali.aastudy.IfStatement;

public class OrOperator {

    public static void main(String[] args) {


    /*
        or ||

           operator 1     operator 2
           true             false           true
           false            true            true
           true             true            true
           false            false           false

     */

        int num1 = 20;

//          true        false
        if(num1>10 || num1<15){

            System.out.println("my number is " + num1);

        }



    }
}