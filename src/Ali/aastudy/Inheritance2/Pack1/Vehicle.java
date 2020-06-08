package Ali.aastudy.Inheritance2.Pack1;

public class Vehicle {

    protected String name;
    protected int speed;

    public Vehicle(String name , int speed){

        this.name = name;
        this.speed = speed;
    }

    public void addSpeed(int addSpeedAmount){

        speed+=addSpeedAmount;

    }

    public void reduceSpeed(int reduceSpeedAmount){

        speed-=reduceSpeedAmount;

    }

}
