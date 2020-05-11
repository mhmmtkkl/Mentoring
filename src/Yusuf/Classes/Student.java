package Yusuf.Classes;

public class Student {
    String name;
    String major;
    int age;
    int firstExamGrade;
    int secondExamGrade;
    int thirdExamGrade;

    int getAverageGrade(){
        return (firstExamGrade + secondExamGrade + thirdExamGrade) / 3;
    }
}
