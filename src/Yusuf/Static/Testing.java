package Yusuf.Static;

public class Testing {
    public static void main(String[] args) {
        StaticKeyWord obj = new StaticKeyWord();
        System.out.println(StaticKeyWord.a);
        StaticKeyWord.a = 6;
        System.out.println(StaticKeyWord.a);
    }
}
