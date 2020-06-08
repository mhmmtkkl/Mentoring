package Ali.aastudy.Abstract.MultipleExtend;

public class Truck1 extends Factory{

    @Override
    public void update() {
        System.out.println("Update the toy from Truck1");
    }

    @Override
    public void get() {
        System.out.println("Get the toy from Truck1");
    }
}
