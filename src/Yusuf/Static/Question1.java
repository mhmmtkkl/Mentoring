package Yusuf.Static;

    public class Question1 {
        int num1 = 6;
        static int num2 = 10;

        public static void main(String args[]) {
            Question1 s1 = new Question1();
            Question1 s2 = new Question1();
            s1.num1 = 15;
            s1.num2 = 17;
            s2.num1 = 22;
            s2.num2 = 28;
            System.out.println(s1.num1 + " " + s1.num2 + " " + s2.num1 + " " + s2.num2);
        }
    }

