package Ali.officeHour.tryCatch;

public class tryCatch2 {

    /*
        What kind of exception do you know?
            https://www.geeksforgeeks.org/types-of-exception-in-java-with-examples/

        Can you type multiple catches in try catch?s
            Yes

     */
    public static void main(String[] args) {

        int[] i1 = new int[5];

        try {
            System.out.println(10/0);
        }catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("All exception");

        }catch (ArithmeticException e){


        }

        System.out.println("Code is done ");

    }

}
