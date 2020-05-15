package Sena.M6_AccessModifiers.AccessModifiers;

import java.util.HashSet;

public class Summary {

    /**
     * Presentation Link:
     * https://docs.google.com/presentation/d/1SXUOgfxJpTWQzpzZkwtcvRdPuvYsijiBxKwAy1EXDj0/edit?usp=sharing
     */

    // ACCESS MODIFIERS

    // Modifiers -> 1. Non Access Modifiers (final, static)
    //              2. Access Modifiers (public, protected, default, private)

    // PUBLIC: Same class, Same package class, Same package subclass, Other package class, Other package subclass
    // PROTECTED: Same class, Same package class, Same package subclass, Other package subclass
    // DEFAULT(PACKAGE PRIVATE): Same class, Same package class, Same package subclass
    // PRIVATE: Same class

    // classes can only be either public or default


    public int age = 66;
    protected byte num = 1;
    String lastName; // default acc modifier
    private boolean isItRamadan = true;

    // Encapsulation
    private static String name = "";

    public static void printName() {
        System.out.println(name);

    }

    // tasks:

    // 1. create a method named as stateTax,
    // which is accessible just within the same package!
    // return type is double, parameter is String.
    // remove any $ and , signs from the String, convert into double and calculate state tax
    // by getting the 7.75 percent of the double value.

    double stateTax(String num) {
        num = num.replace("$", "");
        num = num.replace(",", "");

        double number = Double.valueOf(num);

        double result = number * 0.0775;
        return result;
    }


    // 2. create a method named as britToAmerican,
    // which is accessible from different package too but just for sub classes!
    // return type is HashSet<String> set, parameter is HashSet<String> set, String colour, String color.
    // change all "colour" into "color" from the HashSet

    protected HashSet<String> britToAmerican (HashSet<String> set, String colour, String color) {
        for (String str: set) {
            if (str.equalsIgnoreCase(colour)) {
                str = color;
            }
        }

        return set;
    }






}
