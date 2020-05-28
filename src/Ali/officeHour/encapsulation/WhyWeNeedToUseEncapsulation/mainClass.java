package Ali.officeHour.encapsulation.WhyWeNeedToUseEncapsulation;

public class mainClass {

    public static void main(String[] args) {

   /*
       here we are not using a encapsulation
        and we are also writing a less code
        but
            if I want my score as between 0 and 100 then I need to write this code everytime

        question q1 = new question();

        q1.studentName="Ali";
        q1.studentAge=20;
         score should be between 0 and 100
        q1.score="200";


        System.out.println(q1.studentName);
        System.out.println(q1.studentAge);
        System.out.println(q1.score);

        */

        question q1 = new question();

        q1.setStudentName("Ali");
        q1.setStudentAge(20);
        q1.setScore("200");

        System.out.println(q1.getStudentName());
        System.out.println(q1.getStudentAge());
        System.out.println(q1.getScore());

        System.out.println("------");

        question q2 = new question();

        q2.setStudentName("Samil");
        q2.setStudentAge(20);
        q2.setScore("score is 100");

        System.out.println(q2.getStudentName());
        System.out.println(q2.getStudentAge());
        System.out.println(q2.getScore()); // Input should not contain letters only NUMBERS.

        System.out.println("------");
        question q3 = new question();

        q3.setStudentName("Furkat");
        q3.setStudentAge(20);
        q3.setScore("100");

        System.out.println(q3.getStudentName());
        System.out.println(q3.getStudentAge());
        System.out.println(q3.getScore());

    }

}
