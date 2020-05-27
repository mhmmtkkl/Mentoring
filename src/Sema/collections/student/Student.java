package Sema.collections.student;

public class Student {
    private int studentId;
    private String studentName;
    private int studentAge;

    public Student(int studentId, String studentName,int studentAge){
        this.studentId=studentId;
        this.studentName=studentName;
        this.studentAge=studentAge;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }
}
