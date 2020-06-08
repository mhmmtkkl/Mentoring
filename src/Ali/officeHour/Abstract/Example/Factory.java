package Ali.officeHour.Abstract.Example;

public abstract class Factory {

    /*
        add toy
        remove toy

        get - get the toy from the truck 1
        get - get the toy from the truck 2

     */


    public void add(){
        System.out.println("Adding the toy to truck");
    }

    public void remote(){
        System.out.println("Remove the toy from the truck");
    }

    public abstract void get();

    public abstract void update();

}
