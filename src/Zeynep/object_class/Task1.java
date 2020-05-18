package object_class;

/*
Task1
Create a class Staff
Add 3 attributes which are String position, int salary and double rate
Add method that calculates tax  and returns tax amount ( salary * rate)
Add method that returns all attributes as one string
Print out those info for manager, developer and tester under main method
 */

public class Task1 {

    public static void main(String[] args) {

        Staff staff = new Staff();
        staff.position = "Manager";
        staff.salary = 90_000;
        staff.rate = 0.2;
        staff.getTaxAmount();

        System.out.println(staff);
        System.out.println("-----------");

        Staff staff2 = new Staff();
        staff2.position = "Devolep";
        staff2.salary = 120_000;
        staff2.rate = 0.25;
        staff2.getTaxAmount();

        System.out.println(staff2);
        System.out.println("-----------");

        Staff staff3 = new Staff();
        staff3.position = "Tester";
        staff3.salary = 100_000;
        staff3.rate = 0.2;
        staff3.getTaxAmount();

        System.out.println(staff3);
        System.out.println("-----------");

        Experience experience = new Experience();
        experience.yearOfExperience = 5;
        experience.bonus = 10_000;
        experience.staff = new Staff();
        experience.staff.position = staff.position;
        experience.staff.salary = staff.salary;

        System.out.println(experience);



    }


 }

 class Staff{
    String position;
    int salary;
    double rate;

    double getTaxAmount(){
        return salary*rate;
    }

    public String toString(){
        String output = "\nPosition " + position +
                "\nsalary " + salary +
                "\nrate  " + rate +
                "\ntax amount " + getTaxAmount();
        return output;
    }
 }




