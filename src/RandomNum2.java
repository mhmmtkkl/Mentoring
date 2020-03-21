import java.util.Random;
import java.util.Scanner;

public class RandomNum2 {


    public static void main(String[] args) {
//      random generator between 20 - 30

        Random random2 = new Random();

        int randomAges = random2.nextInt(30 - 20 + 1) + 20;

        System.out.println(randomAges);


//      get the max input from scanner.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the max num");

        int maxNum = scanner.nextInt();

        int randomNum = random2.nextInt(maxNum);


        System.out.println("random2 is here -->>   "+randomNum);

/*
       extra : create a random number

             get the max input from scanner. Create a 3 numbers and sum all the numbers.

*/




    }
}
