package Ali.aastudy.AbstractVSinterface;

public class Overrideing {

    int brand;
    int speed;

    protected void method1(int i1){

        System.out.println("i1 is here "+i1);

    }

}


class childOverriding extends Overrideing{

    /*

        Overloading vs Overriding

        Can I change the parameter count or paramter type in the overriding
            Overriding not able to change the parameter count or parameter type

        Can I change the return type in the overriding?
            No , i can not change the return type in the overriding

        Can I change the parameter count in the overloading?


        Can I change the return type in the overloading?

        Parent class method public can not make the child class method as protected or private

        but if the parent class method is protected can make the child class method can be public
     */
    @Override
    protected void method1(int i2) {
        super.method1(i2);

        System.out.println("hello world");
    }

}

class MyMainClass{

    protected static void main(String[] args) {

        childOverriding c1 = new childOverriding();

        c1.method1(5);

    }

}