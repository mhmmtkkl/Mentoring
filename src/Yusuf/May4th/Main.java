package Yusuf.May4th;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Class tsClass = new Class();

        tsClass.classTeacher = new Teacher();
        tsClass.classTeacher.name = "Dos";
        tsClass.classTeacher.yearOfExperience = 15;
        tsClass.classTeacher.BADegree = "Computer Science";
        tsClass.subject = "Java";

        tsClass.student = new Student();
        tsClass.student.name = "Furkat";
        tsClass.student.age = 25;
        tsClass.student.major = "Computer Science";
        tsClass.student.firstExamGrade = 80;
        tsClass.student.secondExamGrade = 90;
        tsClass.student.thirdExamGrade = 100;

        System.out.println(tsClass);
    }
}