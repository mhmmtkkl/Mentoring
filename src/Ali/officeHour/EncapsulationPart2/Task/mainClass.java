package Ali.officeHour.EncapsulationPart2.Task;

public class mainClass {

    public static void main(String[] args) {

        EmployeesEncap employeesEncap = new EmployeesEncap("John"  , LOCATIONS.NEWYORK , 200 , 100000);

        System.out.println(employeesEncap);

        EmployeesEncap employeesEncap1 = new EmployeesEncap("John"  , LOCATIONS.OHIO , 120 , 55000);

        System.out.println(employeesEncap1);

    }
}
