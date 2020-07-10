package Ali.officeHour.Polymorpism;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {


        /*
        Pol is ability of act multiple forms for an object.
            It is an ability of object to behave in multiple form. The most common use of polymorphism is Java,
            when a parent class reference type of variable is used to refer to a child class object.
        WebDriver driver = new ChromeDriver(); We use method overloading and overriding to achieve Polymorphism.

         */
        Cat c1 = new Cat();
        c1.animalSound();

        Animal c2 = new Cat();
        c2.animalSound();

        Animal c3 = new Dog();
        c3.animalSound();

//        ArrayList<Animal> s1 = new ArrayList<>();
//        s1.add(new Cat());
//        s1.add(new Dog());
//        s1.add(new Dog());
//        s1.add(new Cat());
//        s1.add(new Cat());
//
//        for(Animal str:s1){
//            str.animalSound();
//        }

    }
}
