package oop.food;

public class Restaurant {

    public static void main(String[] args) {


        Soup soup = new Soup("mushroom", "pot");
        System.out.println(soup.isHot());
        System.out.println(soup);
        System.out.println("------------------");

        Salad salad = new Salad("veggies", "bowl");
        salad.coldMenu();
        System.out.println(salad);
        System.out.println("------------------");

    }
}
