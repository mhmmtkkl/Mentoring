package Sema.abstraction.animal;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

//        crate bird class
//        once bu ornek "Parrot" ile daha sonra fly method ile run yap
//        Bird bird =new Bird("Parrot");
//        bird.breathe();
//        bird.eat();
//        Bird can also fly it could be add fly method to our bird class, but not all birds can fly
//        after bird abstract can not be instantiated anymore

        Parrot parrot=new Parrot("Australian ringneck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin=new Penguin("Emperor");
        penguin.fly();

    }
}
