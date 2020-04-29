package March31st;

import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        //Task 4
        //Tell the student his/her letter grade by asking them their number grade.
        //90 and above A
        //80 and above B
        //70 and above C
        //60 and above D
        //below 60 F
        Scanner input = new Scanner(System.in);
        System.out.print("Please tell me your grade: ");
        int grade = input.nextInt();

        if(grade >= 90){
            System.out.println("A");
        }
        else if (grade >= 80){
            System.out.println("B");
        }
        else if (grade >=70){
            System.out.println("C");
        }
        else if (grade >=60){
            System.out.println("D");
        }
        else if (grade < 60){
            System.out.println("F");
        }



    }
}
