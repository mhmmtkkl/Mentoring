package Sema.encapsulation.student;

public class TestEncapsulate {
    public static void main(String[] args) {
        Encapsulation student=new Encapsulation();
        //setting value of the variables
        student.setStudentName("Suzanna");
        student.setStudentAge(21);
        student.setStudentRoll(51);

        //display value of the variables
        System.out.println("Student's name: "+student.getStudentName());
        System.out.println("Student's age:"+ student.getStudentAge());
        System.out.println("Student's roll:"+ student.getStudentRoll());

        //direct access of geekRoll is not possible due to encapsulation
       // System.out.println("Student's roll:"+student.geekName);
    }
}
