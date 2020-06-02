package oop.inheritance_2.employees;

public class FullTimeEmployee extends Employee {

    private int salary;

    //i can assign salary in constructor or create a setter method

    public FullTimeEmployee(int id, String name, int salary) {
        super(id, name);
        this.salary = salary;
    }



    @Override
    public double payIncrement() {

        return salary *0.25;
    }


}
