package access_modifiers;

public class TestA {


    //access modifier for class >>>>> default - public
    //default - package privete

    //private is accesible only that is declared


    public void methodPublic(){
        methodPrivate();
    }

//    protected void methodProtected(){
//        methodPrivate();
//    }

    void methodDefault(){
        methodPrivate();
    }

    private void methodPrivate(){}
}
