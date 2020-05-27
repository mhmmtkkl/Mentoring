package Ali.officeHour.encapsulation.intro;

public class introMain {


    public static void main(String[] args) {

        IntroEncapsulation introEncapsulation = new IntroEncapsulation();

        introEncapsulation.setCarName("Toyota");
        introEncapsulation.setCarAge(12);

        System.out.println(introEncapsulation.getCarName());
        System.out.println(introEncapsulation.getCarAge());
        System.out.println(introEncapsulation.getCarPrice());

    }

}
