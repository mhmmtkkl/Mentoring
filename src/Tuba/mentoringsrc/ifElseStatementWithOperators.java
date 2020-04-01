package Tuba.mentoringsrc;

public class ifElseStatementWithOperators {
    public static void main(String[] args) {
        int myGrade=85;

        if(myGrade <100 && myGrade>90){
            System.out.println("You got A");
        }else if(myGrade>=80 && myGrade<=90){
            System.out.println("You got B");
        }else if(myGrade>=60 && myGrade<80){
            System.out.println("you got C");
        }else {
            System.out.println("You got F");
        }
    }
}
