package Ali.officeHour.PassByValueVSReference;

public class pass2Objects {

    String name;

    public static void main(String[] args) {

        pass2Objects o1 = new pass2Objects();

        pass2Objects o2 = o1; //new pass2Objects()

        o1.name="Ali";

        System.out.println("o2 name is here --> "+o2.name); // ali

        o2.name= "Ekrem";

        System.out.println("o1 name is here --> "+o1.name);//  ekrem

        System.out.println(o1);
        System.out.println(o2);

    }


}
