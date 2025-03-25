package Inheritance;
class Person {
    protected String name;
    protected int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + " | ID: " + id);
    }
}

class Student extends Person {
    private String course;
    private int year;

    public Student(String name, int id, String course, int year) {
        super(name, id);
        this.course = course;
        this.year = year;
    }

    public void showStudentDetails() {
        displayInfo();
        System.out.println("Course: " + course + " | Year: " + year);
    }
}

class Professor extends Person {
    private String department;
    private String specialization;

    public Professor(String name, int id, String department, String specialization) {
        super(name, id);
        this.department = department;
        this.specialization = specialization;
    }

    public void showProfessorDetails() {
        displayInfo();
        System.out.println("Department: " + department + " | Specialization: " + specialization);
    }
}

public class HierarchialInheritance_2 {
    public static void main(String[] args) {
        System.out.println("\n University Management System \n");

        Student student1 = new Student("Alice", 101, "Computer Science", 2);
        student1.showStudentDetails();

        System.out.println();

        Professor professor1 = new Professor("Dr. Smith", 501, "Computer Science", "Artificial Intelligence");
        professor1.showProfessorDetails();
    }
}
