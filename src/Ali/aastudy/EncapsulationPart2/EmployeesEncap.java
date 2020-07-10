package Ali.aastudy.EncapsulationPart2;

class EmployeesEncap {

    private String employeeName;
    private int employeeID;
    private int salary;
    private LOCATIONS locations;

    public EmployeesEncap(LOCATIONS locations , String employeeName){
        this.locations = locations;
        this.employeeName = employeeName;
    }

    public void setEmployeeID(int employeeID) {

        if(employeeID >=100 && employeeID <=600 ) {
            this.employeeID = employeeID;
        }else{
            throw new RuntimeException("Employee id is should be more  or equal then 100 and less or equal to 600 but your employee id is  "+employeeID);
        }
    }

    public void setSalary(int salary) {

        if(salary>50000) {
            int taxAmount = locations.getTax();
            this.salary = salary - (salary / 100 * taxAmount);
        }else{
            throw new RuntimeException("Employee salary should be at least 50K ");
        }

    }

    @Override
    public String toString() {
        return "EmployeesEncap{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeID=" + employeeID +
                ", salary after tax =" + salary +
                '}';
    }
}
