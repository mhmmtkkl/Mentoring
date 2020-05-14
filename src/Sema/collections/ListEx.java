package Sema.collections;

import java.util.*;

class Person{
    private int id;
    private String name;

    public Person(int id,String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class ListEx {
    public static void main(String[] args) {
        Person p1=new Person(0,"Bob");
        Person p2=new Person(1,"Sue");
        Person p3=new Person(2,"Mike");
        Person p4=new Person(3,"Suzanna");

        List<Person> list=new ArrayList<Person>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        System.out.println(list);




    }
}
