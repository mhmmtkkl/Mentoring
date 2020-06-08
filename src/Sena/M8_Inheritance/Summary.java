package Sena.M8_Inheritance;

public class Summary {

    /**
     * Presentation link:
     * https://docs.google.com/presentation/d/1Of3EntbM-1Hkqp8co5pcO1cQV8WyNW1HBvHRnAoyC2w/edit?usp=sharing
     */

    // Inheritance: parent class --> child class
    // if parent is a class: use "extends" / parent classes can be used once per class
    // if parent is an interface: use "implements" / interfaces can be used as much as needed per class

    // Notes:
    // private fields and methods are not shared
    // if parent class has a constructor, constructor matching super has to be created
    // if parent class has a method, method has to be overridden

}

class superclass {
    int age = 99;
    String name = "";
    public String toString () {
        return "hi";
    }

//    public superclass (int age, String name) {
//        this.age = age;
//        this.name = name;
//    }

}

class subclass1 extends superclass {

    private String extra;

//    public subclass1(int age, String name, String extra) {
//        super(age, name);
//        this.extra = extra;
//    }

    public static void main(String[] args) {
        subclass1 s1 = new subclass1();
    }
}

//

abstract class abstractSuperclass {

    public abstract double num ();


}

class subclass2 extends abstractSuperclass implements superInterface1, superInterface2 {


    @Override
    public double num() {
        return 0;
    }
}

//

interface superInterface1 {

}

interface superInterface2 {

}

class subclass3 {

}





