package oop.inheritance_2.employees;

public class EmployeeApp {

    public static void main(String[] args) {

        FullTimeEmployee full = new FullTimeEmployee(1234, "Hasan", 10_000);
        //full.payIncrement();
        System.out.println(full);

        PartTimeEmployee part = new PartTimeEmployee(1256, "Yavuz");
        part.setHourlyRate(7500);
        System.out.println(part);


    }
}
