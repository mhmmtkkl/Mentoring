package Sema.constructors;
class Test{
    static int i;
    int j;
    // start of static block
    static {
        i=10;
        System.out.println("static block called");
    }
    Test(){
        System.out.println("constructor called");
    }
}

class StaticBlock {
    public static void main(String[] args) {
        //although we have two objects, static block is executed only once.
        Test t1=new Test();
        Test t2=new Test();
    }
}
