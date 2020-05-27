package Ali.officeHour.encapsulation.intro;

public class IntroEncapsulation {

    /*
        Encapsulation:
            What is encapsulation?
               Hiding data.
               Using getter and setter.
               Encapsulation is a process of wrapping code and date into single unit
               Hides the fine detail of what is inside the capsule

        Getter -> Getter is reading the instance variable

        Setter -> Setter is writing in the instance variable

        this -> when I need to access to my instance variable I need to use this keyword.

     */

    private String carName;
    private int carAge;

//    this variable is just a readable because it has just a get method
    private int carPrice = 7000;

    public int getCarPrice(){
        return carPrice;
    }

    public String getCarName(){
         return carName;
    }

    public int getCarAge(){
        return carAge;
    }

    public void setCarName(String carName){
        this.carName = carName;
    }

    public void setCarAge(int carAge){
        this.carAge = carAge;
    }


}



