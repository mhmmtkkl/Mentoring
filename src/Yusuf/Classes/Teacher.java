package Yusuf.Classes;

public class Teacher {
    String name;
    int yearOfExperience;
    String BADegree;

    String howIsTeacher(){
        if (yearOfExperience < 2){
            return "not good";
        }
        else if(yearOfExperience >= 2 && yearOfExperience < 4){
            return"meh not bad? I guess?";
        }
        else if(yearOfExperience>=4){
            return "okay no joke this teacher is good. or generally they are...";
        }
        return "";
    }
}
