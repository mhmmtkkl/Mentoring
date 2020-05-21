package Sema.encapsulation.course;

public class Course {
  private String courseName;
  private String[] students = new String[100];
  private int numberOfStudents;
    
  public Course(String courseName) {
    this.courseName = courseName;
  }
  
  public void addStudent(String student) {
    students[numberOfStudents] = student;
    numberOfStudents++;
  }
  
  public String[] getStudents() { //read value with getter method
    return students;
  }

  public int getNumberOfStudents() { //read value with getter method
    return numberOfStudents;
  }  


  

}
