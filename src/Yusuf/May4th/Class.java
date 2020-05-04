package Yusuf.May4th;

import java.util.ArrayList;

public class Class {
    String subject;
    Student student;
    Teacher classTeacher;

    public String toString(){
        return "Subject of the class: " + subject+
                "\n\nName: " + student.name +
                "\nAge: " + student.age +
                "\nMajor: " + student.major +
                "\nAverage grade: " + student.getAverageGrade()+

                "\n\nName of the teacher: " + classTeacher.name +
                "\nDegree of " + classTeacher.name + ": " + classTeacher.BADegree+
                "\nThe teacher is : " + classTeacher.howIsTeacher();

    }
}
