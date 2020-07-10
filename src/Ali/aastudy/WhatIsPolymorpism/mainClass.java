package Ali.aastudy.WhatIsPolymorpism;

import java.util.ArrayList;

public class mainClass {

    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.sleep();

        Animal d2 = new Dog();
        d2.sleep();

        ArrayList<Animal> a1 = new ArrayList<>();

        a1.add(new Dog());
        a1.add(new Cat());
        a1.add(new Lion());
        a1.add(new Lion());
        a1.add(new Dog());
        a1.add(new Cat());

        for (Animal animal:a1){

            animal.sleep();

        }


    }
}
