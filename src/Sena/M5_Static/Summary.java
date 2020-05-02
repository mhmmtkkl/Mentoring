package Sena.M5_Static;

public class Summary {
    /**
     * Presentation Link:
     * https://docs.google.com/presentation/d/1KX63zMLcNuLXicBE07zje5FuiNL4eMB22Uujxo0ZXAw/edit?usp=sharing
     */

    /**
     *  STATIC allows you to have one stored instance and share it everywhere.
     *  Changes on the static will be saved as well.
      */

    // Static Keyword can be used for variables, methods, blocks, and nested classes

    // static variable:
    static int num = 0;

    // static method:
    static String printInfo () {
        return "my counter is: " + num;
    }

    // not important
    // static block:
    static {
        printInfo();
    }

    // will see nested classes in the future...


    ////


    // rules for static:

    // rule number 1 : "everything under static has to be static"

    static String myStaticString = "hi!";
    String nonStatic = "hello";

    public static void staticMethod() {}
    public void nonStaticMethod () {}

    // P.S: remember the method formula:
    // access modifier (public) + non static modifier (static) + return type (void) + name + (parameter) + {body}


    // see how statics and non statics react when called in a static method...

    static String staticsAndNonStatics () {
        staticMethod();
//        nonStaticMethod();
        // compile error stating: "Non-static method 'nonStaticMethod()' cannot be referenced from a static context"
        return myStaticString;
//        return nonStatic;
        // compile error stating: "Non-static method 'nonStaticMethod()' cannot be referenced from a static context"
    }

    public static void main(String[] args) {
        staticMethod();
//        nonStaticMethod();
        System.out.println(myStaticString);
//        System.out.println(nonStatic);

        // notice that you cannot call non static variables / methods in main method too since main is also static

    }


    // rule number 2 : to call a static variable / method from another class, call it with the class name

    public static int daysInAYear = 365;
    public static int hourCountInAYear () {
        return daysInAYear * 24;
    }

    // go to callStatics class



}
