package Ali.officeHour.PassByValueVSReference;

public class asdasd {

    private char var;
    public static void main(String[] args) {
        char var1= 'a';
        char var2 = var1;

        var2= 'e';

        asdasd a1 = new asdasd();
        asdasd a2 = a1;
        a1.var ='o';
        a1.var='i';

        System.out.println("var1 " + var1+ "+ var2 " + var2 );

        System.out.println("a1.var " + a1.var+ "+ a2.var " + a2.var );

    }
}
