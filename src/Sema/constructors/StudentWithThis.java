package Sema.constructors;
//java program to overload constructors
public class StudentWithThis {
    int id;
    String name;
    String city;
    //creating two arg constructor
    StudentWithThis(int id, String name){
        this.id=id;
        this.name=name;
    }
    //creating three arg constructor
    StudentWithThis(int id, String name, String city){
        this(id,name);
//        this.id=id;
//        this.name=name;
        this.city=city;
    }
    //method to display the values
    void display(){
        System.out.println("id:"+id+" name:"+name+" city:"+city);
    }

    public static void main(String[] args) {
        //creating objects
        StudentWithThis s=new StudentWithThis(1,"Sema");
        StudentWithThis s2=new StudentWithThis(2,"Zeynep","NJ");
        //calling method to display the value of object
        s.display();
        s2.display();
    }
}

