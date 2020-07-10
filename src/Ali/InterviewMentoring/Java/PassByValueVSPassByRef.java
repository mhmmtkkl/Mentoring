package Ali.InterviewMentoring.Java;

public class PassByValueVSPassByRef {

    /*
      What is the difference between pass-by-value and pass-by-reference? pass  by value & pass by reference?

        Pass by value means --> that you are copying the value in the memory of the actual variable(main method)

        Pass by reference --> means copy of the address of the actual parameter and make change from the object it self.

     */

    int age;

    public static void method1(int age){


        age = 100;

        System.out.println("i1 in the method 1 " + age);

    }

    public static void method2(PassByValueVSPassByRef o1){

        o1.age =200;

        System.out.println("o1 in the method 2 " + o1.age);

    }


    public static void main(String[] args) {

        PassByValueVSPassByRef p1 = new PassByValueVSPassByRef();

        p1.age=50;

        method1(p1.age); // --> pass-by-value

        System.out.println(p1.age); // 50 100

        method2(p1); // --> pass-by-reference

        System.out.println(p1.age); // 50 100 200

    }

}
