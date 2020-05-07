package Sema.constructors;
//Java Program to illustrate Constructor chaining
//within same class Using this() keyword
//and chaining order of constructors
public class Chain1 {
    //default constructor
    Chain1(){
        System.out.println("default");
    }
    //parameterized constructor 2
    Chain1(int x){
        //invokes default constructor
        this();
        System.out.println(x);
    }
    //parameterized constructor 3
    Chain1(int x, int y){ //polymorphism
        //invokes parameterized constructor 2
        this(5);
        System.out.println(x*y);
    }

    public static void main(String[] args) {
        //invokes parameterized constructor 3
        new Chain1(8,10);
    }

}
