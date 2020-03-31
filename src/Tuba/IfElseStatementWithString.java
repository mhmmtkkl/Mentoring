package Tuba;

public class IfElseStatementWithString {
    public static void main(String[] args) {
        String myStr = "Java";
        myStr=myStr.concat(" is cool");

        // System.out.println(myStr);

        if (myStr.equals("Java is cool")) {
            System.out.println("Perfect, you made a concatenation");
        } else {
            System.out.println("Oops you forgot to assign it");
        }
        System.out.println("this will be execute all the time because it is out of if body");
    }
}
