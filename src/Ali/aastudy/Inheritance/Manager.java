package Ali.aastudy.Inheritance;

public class Manager extends Employee {

    private int underemployed;

    public Manager(String name, String department , int underemployed) {
        super(name, department);
        this.underemployed = underemployed;
    }

    @Override
    public String toString() {
        return "ClassChild{" +
                "numberOfEmployee=" + underemployed +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
//Underemployed


/*
 import java.util.Scanner;

class Main {
 public static void main(String[] args) {
     Scanner dp = new Scanner(System.in);

        String ManagerName = dp.nextLine();
        String ManagerDepartment = dp.nextLine();
        int ManagerNumberOfEmployee = dp.nextInt();
          dp.nextLine();
        int ManagerSalary = dp.nextInt();
          dp.nextLine();

        String workerName = dp.nextLine();
        String workerDepartment = dp.nextLine();
        int workerHourlyIncome= dp.nextInt();


  // dont change the code before this line

     Manager c1 =new Manager(ManagerName, ManagerDepartment ,ManagerNumberOfEmployee);

      c1.setSalary(ManagerSalary);
        System.out.println(c1);

   Worker worker = new Worker(workerName , workerDepartment , workerHourlyIncome);

        System.out.println(worker);

 }
}

class Employee {
    protected String name;
    protected int salary;
    protected String department;

    public Employee(String name , String department){
        this.name = name;
        this.department = department;
    }

    public void setSalary(int salary) {

        if(salary>60000 && salary < 120000) {
            this.salary = salary;
        }
        else{
            throw new RuntimeException("Salary should be between 60000 and 100000");
        }
    }

}

class Manager extends Employee {

    private int underemployed;

    public Manager(String name, String department , int underemployed) {
        super(name, department);
        this.underemployed = underemployed;
    }

    @Override
    public String toString() {
        return
                "Name=" + name + '\n' +
                "Salary=" + salary + '\n' +
                "Department=" + department + '\n' +
                "Underemployed=" + underemployed ;
    }
}


class Worker  extends Employee{

    private int hourlyIncome;

    public Worker(String name, String department , int hourlyIncome) {
        super(name, department);
        this.hourlyIncome = hourlyIncome * 2080 ;
        setSalary(this.hourlyIncome);

    }

    @Override
    public String toString() {
        return
                "Name=" + name + '\n' +
                "Department =" + salary + '\n' +
                "Hourly income =" + department + '\n';

    }
}



/*
  Type your answer for the first two questions.

 1)


 2)

*/

