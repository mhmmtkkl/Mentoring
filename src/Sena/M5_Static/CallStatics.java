package Sena.M5_Static;

public class CallStatics {

    public static void main(String[] args) {

        System.out.println(Summary.daysInAYear);
        int hours = Summary.hourCountInAYear();

        // notice that there is no need for creating an object
    }
}
