package Yusuf.Constructors;
enum Condition{
    REALLYOLD, USED, GOOD, LIKENEW;
}
public class Car {
    String brand;
    int year;
    Condition condition;
    double price;
    public Car(){
    }
    public Car(String brand, int year, Condition condition, double price) {
        this.brand = brand;
        this.year = year;
        this.condition = condition;
        this.price = price;
    }
    public Car(String brand, int year){
        this.brand = brand;
        this.year = year;
    }
    public String toString(){
        return "Brand: " + brand+
                "\nYear: " + year +
                "\nCondition: " + condition+
                "\nPrice: " + price;
    }
}
