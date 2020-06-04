package Ali.officeHour.Encapsulation3;

public class Student {


    private String name;
    private int score;

    public Student(String name , int score ){

        this.name = name;
        setScore(score);

    }


    public void setScore(int score) {
        if(score>=0 && score<=100) {
            this.score = score;
        }else{
            throw new RuntimeException("Score should be between 0 and 100");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

}
