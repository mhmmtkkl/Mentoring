package Ali.officeHour.EncapsulationPart2.WhyWeNeedEncapslation;

public class Student {

    private String name;
    private int score;

    public Student(String name){

        this.name = name;

//  score should be between 0 and 100
//        this.score = score;

    }

    public void setScore(int score) {
        if(score>=0 && score<=100){
            this.score = score;
        }else{
            throw new RuntimeException("Score should be between 0 and 100");
        }
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "user{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
