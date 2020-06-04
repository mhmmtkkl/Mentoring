package Ali.aastudy.Inheritance2.Pack1;

public class CarMain {

    public static void main(String[] args) {

        Car c1 = new Car("Ford" , 50 , 4 );

        System.out.println(c1);

        c1.addSpeed(50);

        System.out.println(c1);

        c1.reduceSpeed(20);

        System.out.println(c1);

    }
}
