package oop.food;

public class Food {
    private String ingredients;
    private String cookware;

    public Food(){

    }

    public Food(String ingredients, String cookware){

        this.ingredients = ingredients;
        this.cookware = cookware;

    }

    @Override
    public String toString() {
        return "BookName{ " +
                "ingredients='" + ingredients + '\'' +
                ", cookware='" + cookware + '\'' +
                '}';
    }
}
