package Ali.officeHour.EncapsulationPart2.WhyWeNeedEncapslation;

public class mainClass {

    public static void main(String[] args) {

        Student student = new Student("John" );
        student.setScore(50);

        System.out.println(student);

        Student student1=  new Student("Emily");

        student1.setScore(500);
        System.out.println(student1);

    }
}
