package Ali.aastudy.Encapsulation.intro;

public class introMain {

    public static void main(String[] args) {

        introEncapsulation intro1 = new introEncapsulation();

        intro1.setName("ali");
        intro1.setAge(21);

        System.out.println(intro1.getName());
        System.out.println(intro1.getAge());
        System.out.println(intro1.getPriceOfTheCar());

        introEncapsulation intro2 = new introEncapsulation();

        intro1.setName("Furkat");
        intro1.setAge(24);

        System.out.println(intro2);

    }
}
