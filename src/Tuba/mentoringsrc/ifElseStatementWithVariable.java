package Tuba.mentoringsrc;

public class ifElseStatementWithVariable {
    public static void main(String[] args) {
        int myVar=9; //OCA ? Oracle Java Programmer Certification Exam

        if(myVar ++  < 10){ // your variable is still 9
            System.out.println(myVar+" Hello World"); // your variable is 10 here
        }else{
            System.out.println(myVar+ "Bye bye world");
        }
    }
}
