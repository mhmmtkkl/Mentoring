package Yusuf.ExecutionOrder;

class X {
    X()
    {
        System.out.println("Constructor X executed");
    }
}

class Y extends X {
    Y()
    {
        System.out.println("Constructor Y executed");
    }
}

class Z extends Y {
    Z()
    {
        System.out.println("Constructor Z executed");
    }
}

public class ExecutionOrder {
    public static void main(String args[])
    {
        Z zz = new Z();
    }
}
