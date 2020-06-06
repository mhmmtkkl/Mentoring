package Yusuf.ExecutionOrder;

public class ExecutionOrder2 {
    static{
        System.out.println("Hello this is a static block");
    }
    ExecutionOrder2(){
        System.out.println("Hello this a constructor");
    }
    public static void demo() {
        System.out.println("Hello this is an instance method");
    }
    public static void main(String args[]){
        new ExecutionOrder2().demo();
    }
}
