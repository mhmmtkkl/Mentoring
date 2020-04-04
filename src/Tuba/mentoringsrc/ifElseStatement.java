package Tuba.mentoringsrc;

import java.util.Scanner;

public class ifElseStatement {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int myGrade=scan.nextInt();

        if(myGrade>70){
            System.out.println("You got C");
        }else{
            System.out.println("You got D");
        }
        System.out.println("This line will  execute all the time because it is out of if-else body");
    }
}
