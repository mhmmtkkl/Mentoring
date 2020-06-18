package Ali.officeHour.PassByValueVSReference;

public class EmpPass {

    double salary;

    public void changingSalary(EmpPass e){

        System.out.println("before changing e.salary --> "+e.salary);

        e = new EmpPass();

        e.salary = 500;

        System.out.println(e.salary); // 500 - 500
        System.out.println("e location --> "+e);

    }

    public static void main(String[] args) {

        EmpPass e1  = new EmpPass();

        e1.salary = 400;

        e1.changingSalary(e1);

        System.out.println(e1.salary); // 500 - 400

        System.out.println("e1 location --> "+e1);

    }
}
