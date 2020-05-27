package Yusuf.Static;

public class Question2 {

    int num1 = 3;
    static int num2 = 5;

    Question2(int num1, int num2) {

        if (num2 < 30) {
            this.num2 = num2;
        }
        num1 = num1;
    }

    public static void main(String args[]) {

        Question2 s1 = new Question2(9, 10);
        Question2 s2 = new Question2(12, 22);

        System.out.println(s1.num1 + " " + s1.num2 + " " + s2.num1 + " "+ s2.num2);

    }
}