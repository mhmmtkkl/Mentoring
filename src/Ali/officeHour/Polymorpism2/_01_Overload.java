package Ali.officeHour.Polymorpism2;

public class _01_Overload {


    public void method1(int i1){

    }

    public String method1(String i1){

        return  "a";
    }

    public static void main(String[] args) {

        _01_Overload o1 = new _01_Overload();

        o1.method1(4);
        o1.method1("4");

    }


}
