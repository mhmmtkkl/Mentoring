package Sema.javaClass;
//Object and Class Example:Initialization through method
//defining a Student class
class StudentRecord{
    int rollno;
    String name;

    //creating method for insert the data
    void insertRecord(int r,String n){
        rollno=r;
        name=n;
    }
    //creating method for display information
    void displayInformation(){
        System.out.println(rollno+" "+name);//printing members with a white space
    }

}
public class TestStudent1 {
    public static void main(String[] args) {
        //creatings Objects
        StudentRecord s1=new StudentRecord();
        StudentRecord s2=new StudentRecord();
        //initializing objects with method
        s1.insertRecord(1,"Sema");
        s2.insertRecord(2,"Zeynep");
        //printing data with method
        s1.displayInformation();
        s2.displayInformation();
    }
}
