package Sena.M9_Interface;

public class Summary {

    /**
     * Presentation link:
     * https://docs.google.com/presentation/d/18Vl4zrmA-M5PoJX65bBD-VvQ3aDyWqmL_ItfK1BNfwc/edit?usp=sharing
     */

    // Interface
    // In the Java programming language, an interface is a reference type, similar to a class,
    // that can contain only constants, method signatures, default methods, static methods, and nested types.
    // Interfaces are 100% abstract except for "default methods"...
    // Interfaces do not accept constructors and private/protected/default methods / variables.
    // Multiple interfaces can be implemented to a subclass

}

interface myInterface {

    // variables:
    public String name = "Interface"; // no need for public to be written, it already has to be public
    final int seasons = 4; // no need for final to be written, it already has to be final
    static double midnight = 00.00; // no need for static to be written, it's already static

//    public String error1; // needs to be initialized since it has to be final
//    private String error2 = "interface"; // cannot be private
//    protected boolean error3 = true; // cannot be protected


    // methods:
    void myMethod ();

//    byte errorMethod1 () {
//        return 124;
//    } // cannot contain body

//    private String [] errorMethod2 (); // private is not allowed


    // constructor:

//    public myInterface (String name, int seasons) { // constructors are not allowed
//        this.name = name;
//        this.seasons = seasons;
//    }






}
