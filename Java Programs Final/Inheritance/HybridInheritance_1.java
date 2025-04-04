class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    protected int empID;
    protected String department;

    public Employee(String name, int age, int empID, String department) {
        super(name, age);
        this.empID = empID;
        this.department = department;
    }

    public void showEmployeeDetails() {
        showDetails();
        System.out.println("Employee ID: " + empID);
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee {
    protected int teamSize;

    public Manager(String name, int age, int empID, String department, int teamSize) {
        super(name, age, empID, department);
        this.teamSize = teamSize;
    }

    public void showManagerDetails() {
        showEmployeeDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    protected String programmingLanguage;

    public Developer(String name, int age, int empID, String department, String programmingLanguage) {
        super(name, age, empID, department);
        this.programmingLanguage = programmingLanguage;
    }

    public void showDeveloperDetails() {
        showEmployeeDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class TechLead extends Manager {
    private String expertise;

    public TechLead(String name, int age, int empID, String department, int teamSize, String expertise) {
        super(name, age, empID, department, teamSize);
        this.expertise = expertise;
    }

    public void showTechLeadDetails() {
        showManagerDetails();
        System.out.println("Expertise: " + expertise);
    }
}

public class HybridInheritance_1{
    public static void main(String[] args) {
        System.out.println("\n Employee Management System\n");

        TechLead techLead = new TechLead("Alice Johnson", 35, 101, "Software Development", 10, "AI & Cloud Computing");

        techLead.showTechLeadDetails();
    }
}
