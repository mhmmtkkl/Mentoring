package Sema.encapsulation.student;
//Java program to demonstrate encapsulation
public class Encapsulation {
    //private variables declared
    //these can only be accessed by public methods of class
    private String StudentName;
    private int StudentRoll;
    private int StudentAge;

    //get method for name to access private variable studentName
    public String getStudentName() {
        return StudentName;
    }
    //set method for name to access private variable studentName
    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public int getStudentRoll() {
        return StudentRoll;
    }

    public void setStudentRoll(int studentRoll) {
        StudentRoll = studentRoll;
    }

    public int getStudentAge() {
        return StudentAge;
    }

    public void setStudentAge(int studentAge) {
        StudentAge = studentAge;
    }
}
