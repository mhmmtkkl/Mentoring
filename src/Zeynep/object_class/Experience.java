package object_class;
/*
Task2
create another class called Experience
add 3 more attributes int yearOfExperience, int bonus, Staff staff
add a method return salary that is added bonus if experience is more than 5 years (>=5)
add method that returns all attributes as one string
*/

public class Experience {
    int yearOfExperience;
    int bonus;
    Staff staff;

    int addBonusToSalary(){
        if (yearOfExperience >= 5){
            return staff.salary + bonus;
        }else
            return staff.salary;
    }

    public String toString(){

        String output = "\nPosition " + staff.position +
                "\nYear of experience " + yearOfExperience +
                "\nBonus " + bonus +
                "\nTotal salary according to experience " + addBonusToSalary();

        return output;
    }



}