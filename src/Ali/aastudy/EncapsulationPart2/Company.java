package Ali.aastudy.EncapsulationPart2;

public class Company {

    /*

        Why we need to use get and set instead of constructor?

        Create an enum locations
            This enum has 5 data each one of them has tax amount.
            NEWYORK 30
            NEWJERSEY 28
            OHIO 25
            ATLANTA 20
            PITTSBURGH 10

            Return the tax amount.
            NOTE: Tax amount should be int


        Create class EmployeesEncap

        Create String employeeName
                int employeeID , salary
           one LOCATIONS

        All variables are write only

        Employee id should be more then 100 and less then 600

        Salary should be more then 50K
                If not throw an error

                Calculate the salary after tax and return the result.



        Create a to String method and print the name employee id and salary after tax.

     */

    public static void main(String[] args) {

        EmployeesEncap employee1 = new EmployeesEncap(LOCATIONS.NEWYORK ,"Ali");

        employee1.setEmployeeID(100);
        employee1.setSalary(100000);

        System.out.println(employee1);

        EmployeesEncap employee2 = new EmployeesEncap(LOCATIONS.NEWJERSEY ,"Someone");
        employee2.setEmployeeID(102);
        employee2.setSalary(200000);

        System.out.println(employee2);

    }
}
