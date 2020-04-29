package Yusuf.April29th;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

    //Task 1
    //Create a class named Employee in a different file. Employee will have an first name, last name, id number, password
    //Create a method in your class which will create new employee and store them in new variables in your class
public class Task1 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Employee yusuf = createNewEmp("Yusuf","Esen",80808,"qwerty");
            Employee ali = createNewEmp("Ali","Koklu",234234,"dghsf");
            Employee dos = createNewEmp("Dos","Mukhammet",3543,"dsfgsd");
            Employee samil = createNewEmp("Samil","Balci",234543,"dsdsfgsdfg");
            Employee furkat = createNewEmp("Furkat","Ali",78655,"qwehjfghjrty");

            ArrayList<Employee> list= new ArrayList<>();

            Collections.addAll(list,yusuf,ali,dos,samil,furkat);

            System.out.println("Please give an ID: ");
            int givenID = input.nextInt();

            for (int i = 0; i <list.size(); i++) {
                if(list.get(i).idNum==givenID){
                    System.out.println(list.get(i).firstName + " " + list.get(i).lastName+"\n"+ list.get(i).password);
                }
            }
        }

    public static Employee createNewEmp(String fName, String lName,int id, String pw){
        Employee newEmp = new Employee();
        newEmp.firstName = fName;
        newEmp.lastName = lName;
        newEmp.idNum = id;
        newEmp.password = pw;

        return newEmp;
    }
        public static void printInfo(Employee emp){
            System.out.println(emp.firstName + " " + emp.idNum);
        }
}