package oop.food;

public class Soup extends Food {

    public Soup(String ingredients, String cookware){  //constructor help me to inherit Food constructor by super
        super(ingredients, cookware);
    }

    public boolean isHot(){
        return true;
    }
}
