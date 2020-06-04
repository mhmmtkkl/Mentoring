package Ali.aastudy.Inheritance2.Pack1;

public class Car extends Vehicle{

    int doorCount;

    public Car(String name, int speed , int doorCount) {
        super(name, speed);
        this.doorCount = doorCount;
    }


    @Override
    public String toString() {
        return "Car{" +
                "doorCount=" + doorCount +
                ", name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}
