package Sema.abstraction.animal;

public class Parrot extends Bird{
    //constructor all we need to to here, is because the other methods are already overridden in the Bird class
    //we only really need to do one(fly)
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("flitting from branch to branch");

    }
}
