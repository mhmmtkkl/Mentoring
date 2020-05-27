package Yusuf.Static;

public class StaticKeyWord {
    static int a = 5;
    int aa = 10;
    static String b = "Techno";
    String bb = "Study";

    public static void main(String[] args) {
        System.out.println(b);
    }
    static {
        a = 2;
        b = "esen";
    }

}
