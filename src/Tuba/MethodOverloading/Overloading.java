package Tuba.MethodOverloading;

import java.util.Arrays;

public class Overloading {

    // Why do we need methods ?
    // to make java easier
    // to use different outputs
    // to make our codes reusable
    // for the time saving

    // Why do we need method overloading?

    // 3 ways to overload a method

    // First way is same return type,same method name , amount of parameters are different

    public static int getSum(int a, int b) {  // 2 parameters

        return a + b;
    }

    public static int getSum(int a, int b, int c) {  // 3 parameters

        return a + b + c;
    }

    // Second Way is different return type, same method name

    public static int getMultiply(int a, int b) {

        return a * b;
    }

    public static double getMultiply(double a, double b, double c) {

        return a * b * c;
    }
    // Third way is order of parameters are different

    public static int myNameLength(String name, int len) {
        len = name.length();
        return len;
    }

    public static int myNameLength(int len, String name) {
        len = name.length();
        return len;
    }

    public static String myMethod(int ... num){  // varargs
        return Arrays.toString(num);
    }

    public static void main(String[] args) {
        int nu1 = 9;
        int num2 = 10;
        int num3 = 38;

        int total = getSum(nu1, num2, num3);
        System.out.println(total);

        System.out.println(getSum(nu1, num2, num3));


    }
}
