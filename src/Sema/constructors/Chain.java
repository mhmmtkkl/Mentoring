package Sema.constructors;
//Java program to illustrate Constructor Chaining
//within same class Using this() keyword
class Chain
{
    //default constructor1
    //default constructor will call another constructor
    //using this keyword from same class
    Chain()
    {
        //calls constructor 2
        this(5);
        System.out.println("the default constructor");
    }
    //parameterized constructor 2
    Chain(int x){
        //calls constructor 3
        this(5,15);
        System.out.println(x);
    }
    //parameterized constructor 3
    Chain(int x, int y){
        System.out.println(x*y);
    }

    public static void main(String[] args) {
        //invokes default constructor first
        new Chain();
    }

}
