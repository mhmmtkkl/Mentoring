package Ali.aastudy.Inheritance2.Pack2;

public class VehicleClass {

    /*
        Encapsulation vs Constructor

           Encapsulation is a data hiding.

                For example:
                    If I have a instance variable name
                    And I dont have any condition for the name (name herhangi bir String olabilir her hangi bi filter yok)
                    Then I can use constructor

                    But If I have a instance variable age
                    And I have a condition for the age (age should be more then 0 and less 120)
                    Then I need to use getter and setter.

        For example:
            Currently I am working with one more QA tester in my company.
            And When I create a class for student
              I need name , dob , phone number
            So I am creating a constructor with these variables
            When ever he is using this class he should providing these data
            So in this way when ever other users use the class then we are letting them to give those data.

     */

    protected String model;
    protected int speed;


    public VehicleClass(String model , int speed){

        this.model = model;
        setSpeed(speed);

    }


    public void setSpeed(int speed) {
        if(speed<200) {
            this.speed = speed;
        }else{
            throw new RuntimeException("Speed should be less then 200");
        }
    }

    public void addSpeed(int addSpeedAmount){

        speed+=addSpeedAmount;
    }

    public void reduceSpeed(int reduceSpeedAmount){

        speed-=reduceSpeedAmount;
    }

}
