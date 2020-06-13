package oop.inheritance_2.employees;

public class PartTimeEmployee extends Employee {

    private int hourlyRate;


    public PartTimeEmployee(int id, String name) {
        super(id, name);
    }

    //i can assign salary in constructor or create a setter method

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double payIncrement() {

        return hourlyRate * 0.1;

    }
}
