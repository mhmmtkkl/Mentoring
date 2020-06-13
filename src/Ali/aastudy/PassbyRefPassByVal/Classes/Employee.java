package Ali.aastudy.PassbyRefPassByVal.Classes;

public class Employee {

    int age;

    public void setAge1(Employee e1) {
        e1=  new Employee();

        e1.age = 15;
    }

    public void setAge2(Employee e1) {
        e1.age = 20;
    }

    public static void main(String[] args) {

        Employee myEmp = new Employee();

        myEmp.age=10;

        System.out.println("Before calling the set methods ==> "+myEmp.age);

        myEmp.setAge1(myEmp);

        System.out.println("After calling the setAge1  ==> "+myEmp.age);

        myEmp.setAge2(myEmp);

        System.out.println("After calling the setAge2  ==> "+ myEmp.age);

    }
}
