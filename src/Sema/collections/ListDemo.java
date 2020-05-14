package Sema.collections;

import java.util.ArrayList;
import java.util.LinkedList;
//java collections: JDK provides a powerful, high quality, and high performance reusable data structure.
//A collections is a data structure that holds a set of object in specific manner.It looks like arrays
// but collections are more advance and more flexible.A collection stores objects dynamically you can add or remove object as you wish
//both of implement List interface
public class ListDemo {
    public static void main(String[] args) {
        //list allows duplicate elements
        //List allows any number of null values.
        //insertion order

        ArrayList al=new ArrayList();
        al.add(12345);
        al.add("Abc");
        al.add(123.45);
        al.add('H');
        System.out.println(al);

       LinkedList ll=new  LinkedList();
        ll.add(12345);
        ll.add("Abc");
        ll.add(123.45);
        ll.add('H');
        System.out.println(ll);

        //Array list gives better performance get and set. can be accessed directly via the get and set methods.
        //Linked list gives better performance add and remove
    }
}
