package Ali.officeHour.Abstract.Example;

public class Truck1 extends Factory{



    @Override
    public void get() {

        System.out.println("Get the toy from truck 1");
    }

    @Override
    public void update() {
        System.out.println("Update the toy from the Truck1");
    }

}
