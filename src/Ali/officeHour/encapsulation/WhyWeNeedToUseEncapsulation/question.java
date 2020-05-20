package Ali.officeHour.encapsulation.WhyWeNeedToUseEncapsulation;

public class question {

    private String studentName;
    private int studentAge;
    private String score;

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        try {
            if (Integer.parseInt(score) >= 0 && Integer.parseInt(score) <= 100) {
                this.score = score;
            } else {
                this.score = "Enter a valid score , Score should be between 0 and 100";
            }
        }catch (NumberFormatException e){
            this.score = "Input should not contain letters only NUMBERS.";
        }
    }

    public String  getStudentName(){
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

}
