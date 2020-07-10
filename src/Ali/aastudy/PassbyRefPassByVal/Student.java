package Ali.aastudy.PassbyRefPassByVal;

public class Student {

    int age;

    public void studentAge(int age){

        age= 100;

        System.out.println("Student age in the studentAgeMethod" + age);

    }

    public void studentAge2(Student s1){

        s1.age= 50;

        System.out.println("Student age in the studentAgeMethod 2 " + age);
    }

    public static void main(String[] args) {

        Student student = new Student();

        student.age = 20;

        student.studentAge(10);
        System.out.println(student.age);

        student.studentAge2(student);

        System.out.println(student.age);

    }

}
