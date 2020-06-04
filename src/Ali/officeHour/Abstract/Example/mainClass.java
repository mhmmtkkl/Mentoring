package Ali.officeHour.Abstract.Example;

public class mainClass {

    public static void main(String[] args) {

        Factory f1 = new Truck1();

        f1.add();
        f1.get();
        f1.update();

        System.out.println("-----------------");

        Factory f2 = new Truck2();

        f2.add();
        f2.get();
        f2.remote();
        f1.update();

    }
}
