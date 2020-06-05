package Sema.abstraction.windowsOffice;

public abstract class WindowsOffice {
    /*
    -An abstract class must be declared with an abstract keyword
    -It can have abstract and non abstract method
    -It can not be instantiated
    -It can be final methods
    -It can have constructor and static methods
     */

    public void add(){
        System.out.println("added...comes from abstract WindowsOffice class");
    }
    public void delete(){
        System.out.println("deleted...comes from abstact WindowsOffice class");
    }

    abstract void update();
    abstract void get();
}
