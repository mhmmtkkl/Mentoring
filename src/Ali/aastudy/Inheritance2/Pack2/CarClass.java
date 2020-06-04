package Ali.aastudy.Inheritance2.Pack2;

public class CarClass extends VehicleClass{


    /*
    this vs super

    this is pointing to the variable / method  in the class

    super is pointing to the variable / method in the parent class

     */
    int doorCount;

    public CarClass(String model , int doorCount, int speed) {
        super(model , speed);
        this.doorCount = doorCount;

    }

    @Override
    public String toString() {
        return "CarClass{" +
                "doorCount=" + doorCount +
                ", model='" + model + '\'' +
                ", speed=" + speed +
                '}';
    }
}
