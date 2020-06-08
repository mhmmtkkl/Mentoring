package Sema.abstraction.animal;
//when you are writing the class fist it pops up error and force to implement override methods
//create a valid class we have to implement those
public class Dog extends Animal{
//create a constructor
    public Dog(String name) {
        super(name);
    }
//those override make valid the class
    @Override
    public void eat() {
        System.out.println(getName()+"is eating");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, Breathe out, repeat");
    }
    //the important thing here is that not all methods have to be abstract,
    //this is one of the difference between an abstract class and interface, you can actually mix these up
    //We can actually mix it up.We can actually add fields, we can add regular methods or constructor in this case.
}
