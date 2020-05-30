package Ali.officeHour.EncapsulationPart2.Task;

public class EmployeesEncap {

    /*
      Create class EmployeesEncap

        Private create String employeeName
                int employeeID , salary
           one LOCATIONS

        All variables are write only

        Employee id should be more then 100 and less then 600

        Salary should be more then 50K
                If not throw an error

                Calculate the salary after tax and return the result.

        Create a to String method and print the name employee id and salary after tax.

     */
    private String EmployeeName;
    private int employeeID;
    private double salary;

    LOCATIONS locations;

    public EmployeesEncap(String EmployeeName , LOCATIONS locations , int employeeID , double salary){

        this.EmployeeName = EmployeeName;
        this.locations = locations;
        setEmployeeID(employeeID);
        setSalary(salary);


    }

//     Employee id should be more then 100 and less then 600
    public void setEmployeeID(int employeeID){

        if(employeeID>=100 && employeeID<=600){
            this.employeeID = employeeID;

        }else{
            throw new RuntimeException("Employee id is not valid it should be more then 100 and less then 600");
        }
    }



    //  Salary should be more then 50K

//   Calculate the salary after tax and return the result.

//    100.000  - 30.000(30%) = 70000

    public void setSalary(double salary) {

        if(salary>50000){
            this.salary = salary - (salary*locations.getTax()/100);
        }else{
            throw new RuntimeException("Salary should be more then 50K");
        }
    }

    @Override
    public String toString() {
        return "EmployeesEncap{" +
                "EmployeeName='" + EmployeeName + '\'' +
                ", employeeID=" + employeeID +
                ", salary=" + salary +
                ", locations=" + locations +
                '}';
    }
}
