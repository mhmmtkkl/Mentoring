package Sema.collections.student;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentDemo {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student(1,"John",30));
        students.add(new Student(2,"Suzanna",32));
        students.add(new Student(3,"Adam",35));

        Map<Integer,String> map=new HashMap<>();
        for (Student student : students) {
            map.put(student.getStudentId(),student.getStudentName());
        }

        System.out.println(map);

    }
}
