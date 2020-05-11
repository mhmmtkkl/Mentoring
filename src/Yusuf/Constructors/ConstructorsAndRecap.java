package Yusuf.Constructors;

import java.util.ArrayList;

public class ConstructorsAndRecap {
    String name;
    int age;
    public ConstructorsAndRecap(){
    }
    public ConstructorsAndRecap(String name, int age){
    }
    public ConstructorsAndRecap(String name){
        this.name=name;
    }

    public static void main(String[] args) {
        ConstructorsAndRecap a = new ConstructorsAndRecap();
    }
}