package Ali.aastudy.Encapsulation.WhyWeNeedEncapsulation;

public class GetSetMain {


    public static void main(String[] args) {

        GetSetClass getSetClass = new GetSetClass();

        getSetClass.setMyNam("Ali");
        getSetClass.setMyAge(15);
        getSetClass.setScore("score is 59");

        System.out.println(getSetClass.getMyName());
        System.out.println(getSetClass.getMyAge());
        System.out.println(getSetClass.getScore());

        System.out.println("--------------");

        GetSetClass getSetClass2 = new GetSetClass();

        getSetClass2.setMyNam("Ahmet");
        getSetClass2.setMyAge(15);
        getSetClass2.setScore("200");

        System.out.println(getSetClass2.getMyName());
        System.out.println(getSetClass2.getMyAge());
        System.out.println(getSetClass2.getScore());

        System.out.println("--------------");

        GetSetClass getSetClass3 = new GetSetClass();

        getSetClass3.setMyNam("Junior");
        getSetClass3.setMyAge(15);
        getSetClass3.setScore("52");

        System.out.println(getSetClass3.getMyName());
        System.out.println(getSetClass3.getMyAge());
        System.out.println(getSetClass3.getScore());

    }


}
