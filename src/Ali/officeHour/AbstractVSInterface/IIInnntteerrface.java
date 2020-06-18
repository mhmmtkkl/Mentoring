package Ali.officeHour.AbstractVSInterface;

public interface IIInnntteerrface {

    /*
        All the methods should be public in the interface.

        All the methods in the interface are public and abstract as default.

        All the variables are public and final in the interface.

        Private is not allowed in the interface
            Because all the methods are in the interface we are overriding them in the child classes

     */

     int age=30;

     void method2();

     static void method1() {
        System.out.println("hello world");
     }

}

class childOfInterface implements IIInnntteerrface{

    @Override
    public void method2() {
        System.out.println("method 2 in the child.");
    }

    public static void main(String[] args) {

        IIInnntteerrface.method1();

    }

}
