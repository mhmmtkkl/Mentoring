package Ali.officeHour.AbstractVSInterface;

public class PParentCClass {

    /*

        Overriding

        Interface

        What is overriding?
            Overriding is a concept in Java. Basicallt taking the method from the parent class.

            I am able to change the body of the class but not able to change the parameter , name and return type

    */
    int speed;

//    if I add the final keyword in the method what will happen?

//    Final in the method mean can not change the body.
//      overriding mean I am taking the method from the parent change the body that is why overriden methods can
//      not be final

    /*


     */
    public void method1(int i1){
        System.out.println("method 1 in the parent class");
    }

//    Able to call final method by object like in the main method
    public final int randomNum(){
        return 100;
    }
}

class childClass1 extends PParentCClass{
    /*
        Super vs this keyword

            - Super keyword is using for to get connection method or variable in the parent class.

            - This keyword is using for  to get connection method or variable in the same class.

     */

    int speed;

    @Override
    public void method1(int i1) {
        super.method1(i1);
        System.out.println("method 1 in the child class");

    }

    public static void main(String[] args) {
        childClass1 c1 = new childClass1();

        c1.method1(5);
        System.out.println(c1.randomNum());

    }
}