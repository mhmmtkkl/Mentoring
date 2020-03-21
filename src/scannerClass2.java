import java.util.Scanner;

public class scannerClass2 {

    public static void main(String[] args) {

    /*
        Enter age of the family
        Father
        Mother
        Yourself

        print average

    */

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your father age?");

        int fAge = scanner.nextInt();

        System.out.println("What is your mother age?");

        int mAge = scanner.nextInt();

        System.out.println("What is your age?");

        int yAge = scanner.nextInt();

        System.out.println("Father age is : " + fAge);

        System.out.println("Mother age is : " + mAge);

        System.out.println("Your age is : " + yAge);

        int average = (fAge + mAge + yAge)/3;

        System.out.println("average age of your family : "+average);





    }
}
