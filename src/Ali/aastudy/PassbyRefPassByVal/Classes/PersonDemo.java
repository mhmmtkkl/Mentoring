package Ali.aastudy.PassbyRefPassByVal.Classes;

public class PersonDemo {

    public static void main(String[] args) {

        Person p1 = new Person();

        Person p2 = p1;

        p1.age = 18;

        p1.addAge(p1);

        System.out.println(p1.age);
        System.out.println(p2.age);

    }

}

/*
    What is Polymorphism

        Dynamic Polymorphism -->
            overriding

        Static Polymorphism -->
            overloading

 */


