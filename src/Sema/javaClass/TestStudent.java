package Sema.javaClass;
//Object and Class Example:
//Step1-->main outside the class
// step2-->Initialization through reference
//defining a Student class
class Student{
    //defining fields
    int id;//field or data member or instance variable
    String name;
}

//creating another class testStudent which contain the main method
public class TestStudent {
    public static void main(String[] args) {
        //creating an object
        Student s1=new Student();
        //printing values of the object
        System.out.println(s1.id);//accessing member through reference variable
        System.out.println(s1.name);

        //lets improving this example
        //s1.name=101; //initializinfg objects
    }

}
