package Ali.aastudy.Inheritance;

import java.util.Scanner;

public class mainClass {

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
