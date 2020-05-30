package oop.items;

public class Item {

    private String name;
    private double price;
    private double discount;

    public Item(){

    }

    public Item(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice(){
        return price;
    }
    public double getDiscount(){
        return discount;

    }

    @Override
    public String toString() {
        return "Item = " +
                " name='" + name + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                '}';
    }
}
