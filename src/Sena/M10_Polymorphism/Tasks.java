package Sena.M10_Polymorphism;

public class Tasks {
}

/**
 * Task 1:
 * // Create an abstract class named as IceCream :)
 * // Have an int variable named as rolls,
 * Have a constructor with the variable you have
 **/

abstract class IceCream {
    int rolls;

    public IceCream(int rolls) {
        this.rolls = rolls;
    }

    public abstract void printProperties();


    /**
     * Task 2:
     * // Have a void method --> if roll number is 1, print "good for you :)"
     * // if roll number is 2-3, print "guess been waiting for summer so bad, eh? :)"
     * // if roll number is more than 3, print "woah, TOO MANY CALORIES"
     * // else, print "Where is my ice creammmm???"
     **/

    public void countRolls() {
        if (rolls > 3) {
            System.out.println("woah, TOO MANY CALORIES");

        } else if (rolls > 1) {
            System.out.println("guess been waiting for summer so bad, eh? :)");

        } else if (rolls > 0) {
            System.out.println("good for you :)");

        } else {
            System.out.println("Where is my ice creammmm???");

        }
    }
}


    /**
     * Task 3:
     * // Create at least 2 subclasses to IceCream, name them with your favorite ice cream flavors
     **/

    class Lime extends IceCream {

        public Lime(int rolls) {
            super(rolls);
        }

        @Override
        public void printProperties() {
            System.out.println("Lime: " + rolls);
        }
    }

    class chocolate extends IceCream {

        public chocolate(int rolls) {
            super(rolls);
        }

        @Override
        public void printProperties() {
            System.out.println("flavor name: " + getClass().getSimpleName());
            System.out.println("roll number: " + super.rolls);
        }
    }


/** Task 4:
 // Have an abstract void method as printProperties at IceCream class
 // Override the method from the subclasses and print the name of the flavor and number of rolls
 **/


 class myIceCreamOrder {
    public static void main(String[] args) {

        IceCream o1 = new Lime(2);
        o1.printProperties();
        o1.countRolls();

        IceCream o2 = new chocolate(1);
        o2.printProperties();
        o2.countRolls();

    }
}

