package Ali.officeHour.Abstract.Example;

public class Truck2 extends Factory{

    @Override
    public void get() {
        System.out.println("Get the toy from the Truck2");
    }

    @Override
    public void update() {
        System.out.println("Update the method from the Truck2");
    }
}
