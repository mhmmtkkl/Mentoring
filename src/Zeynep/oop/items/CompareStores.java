package oop.items;

public class CompareStores {

    public static void main(String[] args) {
        Wegmans wegmans = new Wegmans("cheese", 6.99, 0.5);
        System.out.println(wegmans);
        System.out.println("-------------");

        Walmart walmart = new Walmart();
        //walmart.name = "walmart";
        //cannot reach directly to private field

//        String name = walmart.getName();
//        name = "walmart";
        //double price = walmart.getPrice();
        //        price = 7.99;
        //System.out.println(name);
        //or

        walmart.setName("walmart");
        //System.out.println(walmart.getName());
        System.out.println(walmart); //i used this without getter method bec of creating override in walmart class



    }
}
