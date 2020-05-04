package Yusuf.May4th;

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
