package static_constructor;

public class Task3 {
    //step1 create Pay class that has 3 attributes named double hourlyRate, int numberOfHours, and int overTime
//create a constructor that stores those attributes as parameters
//create a double method that returns weekly salary (hourlyRate * numberOfHours)
//create a double method that returns "overtime" pay of 1.5 times the normal salary,
// calculate overtime payment (hourlyrATE*1.5*OVERtime)
//print it out all of this information with toString method

    public static void main(String[] args) {
        Pay pay = new Pay(45.5, 40, 8);
        System.out.println(pay);

    }
}
class Pay{
    double hourlyRate;
    int numberOfHours;
    int overTime;

    public Pay(double hourlyRate, int numberOfHours, int overTime){ //overloaded constructor

        this.hourlyRate = hourlyRate;
        this.numberOfHours = numberOfHours;
        this.overTime = overTime;
    }
    double weeklyPayment(){

        return this.hourlyRate* numberOfHours;

    }

    double overtime(){
        return (this.hourlyRate*1.5)*overTime;
    }

    public String toString(){

        String output = "Hourly rate is : " + this.hourlyRate + "\n"+
                numberOfHours + "hours works in a week " +
                "\n totally gets " + " " + weeklyPayment()+
                "\n overtime :" + overtime() +
                "\n after added overTime : " + (weeklyPayment()+overtime());

        return output;
    }







}

