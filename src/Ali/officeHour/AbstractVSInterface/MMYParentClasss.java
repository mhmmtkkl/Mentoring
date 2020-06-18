package Ali.officeHour.AbstractVSInterface;

public class MMYParentClasss {

//   private
     public void method1(){
        System.out.println("Method 1 in the parent class");
    }

/*
    If the parent class method access modifiers as protected
        Child class method access modifiers can be protected or public

    If the parent class method access modifiers as public
        Child class method access modifiers can be public CAN NOT BE PRIVATE OR PROTECTED

       I can not make the child class method less accessible then parent class method

*/
}

class ccchildClasss extends MMYParentClasss{

//    public
    @Override
    public void method1() {
        super.method1();
        System.out.println("Method 1 in the child class");
    }
}
