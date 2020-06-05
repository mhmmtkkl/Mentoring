package Sema.abstraction.animal;
//note for me
//we are going to inherit from this abstract class
//it is going to let us define behaviors that are necessary,without specifying how they are to be performed
//(nasil greceklestiklerini belirtmeden gerekli davranislari tanimlamiza izin verir)
//we accually are forcing the class that is ultimately going to implement from abstract class to create those methods and that is
//why actually marked them abstract
//the other methods are quite ok, they work as normal java code
public abstract class Animal {
    //define variable
    private String name;
    //constructor
    public Animal(String name) {
        this.name = name;
    }
    //abstract methods
    public abstract void eat();
    public abstract void breathe();

    //getter
    public String getName() {
        return name;
    }
}
