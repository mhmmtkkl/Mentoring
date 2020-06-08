package oop.inheritance_2.employees;

public class Employee {

    private int id;
    private String name;


    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public double payIncrement(){

        throw new RuntimeException("Not Implemented");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", increment " + payIncrement() +
                '}';
    }
}
