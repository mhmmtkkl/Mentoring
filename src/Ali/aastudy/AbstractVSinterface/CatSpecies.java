package Ali.aastudy.AbstractVSinterface;

public interface CatSpecies {

//    All variables in the interface is final and static
    int legs = 4;
    int eyes = 2;

//    Can not make the methods in the interface as private or Protected
    public void walk();
    public void speak();

//    Can not create a final method in the interface because final keyword does not allow to change the body but in the interface child
//        have to change the body.
//    public final void eat();

}

class HouseCat implements CatSpecies{

    @Override
    public void walk() {
        System.out.println("House cat is walking");
    }

    @Override
    public void speak() {
        System.out.println("Miao");
    }
}

class Lion implements CatSpecies{

    @Override
    public void walk() {
        System.out.println("Lion is walking");
    }

    @Override
    public void speak() {
        System.out.println("Woarr");
    }
}

class MainClass{

    public static void main(String[] args) {

        CatSpecies c1 = new Lion();
        c1.speak();
        c1.walk();

        CatSpecies c2 = new HouseCat();
        c2.speak();
        c2.walk();

    }
}