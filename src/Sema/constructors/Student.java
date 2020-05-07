package Sema.constructors;
//java program to overload constructors
public class Student {
    int id;
    String name;
    String city;
    //creating two arg constructor
    Student(int i, String n){
        id=i;
       name=n;
    }
    //creating three arg constructor
    Student(int i, String n, String c){
        id=i;
        name=n;
       city=c;
    }
    //method to display the values
    void display(){
        System.out.println("id:"+id+" name:"+name+" city:"+city);
    }

    public static void main(String[] args) {
        //creating objects
        Student s=new Student(1,"Sema");
        Student s2=new Student(2,"Zeynep","NJ");
        //calling method to display the value of object
        s.display();
        s2.display();
    }
}

