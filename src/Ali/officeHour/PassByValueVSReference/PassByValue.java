package Ali.officeHour.PassByValueVSReference;


public class PassByValue {

    public void add(int num){

        // num is = 100
        num = num +50;

        System.out.println("num in the add method " + num); // 50  - 150
    }

    public static void main(String[] args) {

        int salary = 100;

        PassByValue p1 = new PassByValue();

        p1.add(salary);

        System.out.println("Salary in the main method " + salary); //150 - 100
    }

}
