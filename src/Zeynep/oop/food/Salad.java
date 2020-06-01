package oop.food;

public class Salad extends Food {
    public Salad(String ingredients, String cookware){  //constructor help me to inherit Food constructor by super
        super(ingredients, cookware);
    }

    public void coldMenu(){
        System.out.println("Salad is side dish and refill is free");
    }
}
