package Sema.abstraction.animal;

public abstract class Bird extends Animal  {
    //this is an abstract class that itself is extending from another abstract class
    //it is implementing the required methods that the animal class requires it to,namely eat and breath
    //create constructor
    public Bird(String name) {
        super(name);
    }
//Java forces to create override methods and modify them
    @Override
    public void eat() {
        System.out.println(getName()+"is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("Breath in, breath out, repeat");
    }
    //modify the bird class not all birds can fly
    public abstract void fly();
}
