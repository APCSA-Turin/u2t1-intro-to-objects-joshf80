// Cat class definition
public class Student {

    // instance variables
    private String studentName;
    private int studentGrade;
    private double studentGpa;
 
    // constructor
    public Student(String name, int grade, double gpa) {
        studentName = name;
        studentGrade = grade;
        studentGpa = gpa;
    }

    public void printInfo() {
        System.out.println("Name: " + studentName);
        System.out.println("GPA: " + studentGpa);
        System.out.println("Grade: " + studentGrade);
    }
 
 }
 
 
