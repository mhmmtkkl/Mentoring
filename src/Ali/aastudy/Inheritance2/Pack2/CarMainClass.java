package Ali.aastudy.Inheritance2.Pack2;

public class CarMainClass {

    public static void main(String[] args) {

    CarClass c1 = new CarClass("Ford" , 4 , 250);


        System.out.println(c1);
    c1.addSpeed(60);
        System.out.println(c1);
    c1.reduceSpeed(20);
        System.out.println(c1);


    }
}
