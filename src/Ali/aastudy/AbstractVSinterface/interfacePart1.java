package Ali.aastudy.AbstractVSinterface;

public interface interfacePart1 {

    /*
        Interface detail.

           1) Can not create a final method
                public final void method1();

           2) Can not create protected or final method
            //    private void method1();

            3) Interface all the variables are final

    */

    public void method1();

    public void method2();

    int i1=1;

}

class InterfaceChild implements interfacePart1{


    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}