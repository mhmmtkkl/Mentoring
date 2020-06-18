package Ali.aastudy.AbstractVSinterface;

public class ParentClass {

    /*

        Final keyword in java.

            After you created not able to change the value of the variable.

     */

    public void myMethod1(){

        System.out.println("Hello World");

    }

}


class childClass extends ParentClass{

    @Override
    public void myMethod1() {
        super.myMethod1();
        System.out.println("Hi Guys");
    }

}

class mainClass{

    public static void main(String[] args) {
        childClass c1 = new childClass();

        c1.myMethod1();

    }
}
