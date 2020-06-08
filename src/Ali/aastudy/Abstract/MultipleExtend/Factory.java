package Ali.aastudy.Abstract.MultipleExtend;

public abstract class Factory {

    /*
        If I would like to force the child classes have the same methods like the parent class.

     */

    public void add(){
        System.out.println("Adding the toy to truck");
    }

    public void remove(){
        System.out.println("If the toy is damaged then remove the toy before it is going to truck");
    }

    public abstract void update();

    public abstract void get();

}
