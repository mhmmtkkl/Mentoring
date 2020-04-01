package Tuba;

public class ifElseStatementWithTrim {
    public static void main(String[] args) {
        String mystr = " ";

        mystr = mystr.trim();

        if (mystr.isEmpty()) {
            System.out.println("yeap");
        } else {
            System.out.println("nope");
        }
    }
}
