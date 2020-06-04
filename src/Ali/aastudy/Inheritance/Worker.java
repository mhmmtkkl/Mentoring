package Ali.aastudy.Inheritance;

public class Worker extends Employee{

    private int hourlyIncome;

    public Worker(String name, String department , int hourlyIncome) {
        super(name, department);
        this.hourlyIncome = hourlyIncome * 2080 ;
        setSalary(this.hourlyIncome);

    }

    @Override
    public String toString() {
        return "Worker{" +
                "hourlyIncome=" + hourlyIncome +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
