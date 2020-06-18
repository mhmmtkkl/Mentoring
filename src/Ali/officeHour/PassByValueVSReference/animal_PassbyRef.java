package Ali.officeHour.PassByValueVSReference;

public class animal_PassbyRef {

    int age;

    public void settingAge(animal_PassbyRef a){

        a.age = 100;

        System.out.println("age in the method " + a.age); // 100

    }

    public static void main(String[] args) {

        animal_PassbyRef animal = new animal_PassbyRef();

        animal.age = 50;

        animal.settingAge(animal);

        System.out.println("animal after the method " + animal.age); //100

    }

}
