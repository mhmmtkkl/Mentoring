package Tuba.stringBuilderAndBuffer;

public class StringBuilderMethods {
    public static void main(String[] args) {
        // Equality in Strings and StringBuilders
        // Strings
        String s1 = "Geeks";
        String s2 = "Geeks";
       // String s2 = new String("Hello");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        // StringBuilder

        StringBuilder sb = new StringBuilder(" Hello");

        StringBuilder sb1 = new StringBuilder("Hello");

        System.out.println(sb.equals(sb1));


    }
}
