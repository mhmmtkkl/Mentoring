package Tuba.arrays;

public class ExampleDefaultValue {
    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 4;
        arr[1] = 2;
        // if you don't initialize your elements your default value is 0

        System.out.println(arr[1] + " " + arr[3]);

        char[] ch = new char[3];
        ch[0] = 'a';
        ch[1] = 'b';
        System.out.println(ch[1] + " " + ch[2]);

        String[] str = new String[4];
        str[0] = "Samil";
        str[1] = "Dogan";
        System.out.println(str[1] + " " + str[3]);
    }
}
