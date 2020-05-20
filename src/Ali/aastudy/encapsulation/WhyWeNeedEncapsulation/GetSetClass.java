package Ali.aastudy.encapsulation.WhyWeNeedEncapsulation;

public class GetSetClass {

    private String myName;
    private int myAge;
    private String score;

    public String getMyName(){
        return myName;
    }

    public int getMyAge(){
        return myAge;
    }

    public String getScore(){
        return score;
    }

    public void setMyNam(String myName){
        this.myName = myName;
    }

    public void setMyAge(int myAge){
            this.myAge = myAge;
    }

    public void setScore(String score){

/*
        when I type the score is 59
            This is throwing an error

            Why:
             because "score is" not a number so that is why error is NumberFormatException

            How to handle this error:

                Solution 1 :   grade = grade.replaceAll("\\D", "");
                    Problem here is we are removing all the texts but I want my users to
                 know there is an error here

                Solution 2:
                     Try - catch
 */

        try{
            if(Integer.parseInt(score)>=0 && Integer.parseInt(score)<=100 ){
                this.score = score;
            }else{
                this.score = "This is not a valid grade";
            }
        }catch (NumberFormatException e){

            this.score = "Your input should be all numbers";
        }
    }


}
