package Yusuf.May4th;

public class Teacher {
    String name;
    int yearOfExperience;
    String BADegree;

    String howIsTeacher(){
        String quality = "";

        if (yearOfExperience < 2){
            quality = "not good";
        }
        else if(yearOfExperience >= 2 && yearOfExperience < 4){
            quality = "meh not bad? I guess?";
        }
        else if(yearOfExperience>=4){
            quality = "okay no joke this teacher is good. or generally they are...";
        }
        return quality;
    }
}
