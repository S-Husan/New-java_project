// Superclass
class Employee {
    protected String name;
    protected int id;
    protected double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display basic info
    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
    }

    // Method to increase salary
    public void increaseSalary(double amount) {
        salary += amount;
        System.out.println("Salary increased by " + amount);
    }
}


// Subclass
class Teacher extends Employee {
    private String subject;
    private int experience; // in years

    // Constructor using super
    public Teacher(String name, int id, double salary, String subject, int experience) {
        super(name, id, salary); // calling superclass constructor
        this.subject = subject;
        this.experience = experience;
    }

    // Override display method
    @Override
    public void displayInfo() {
        super.displayInfo(); // call parent method
        System.out.println("Subject: " + subject);
        System.out.println("Experience: " + experience + " years");
    }

    // Additional method
    public void teach() {
        System.out.println(name + " is teaching " + subject);
    }
}


// Main class
public class Main {
    public static void main(String[] args) {
        // Create Teacher object
        Teacher t1 = new Teacher("Husan", 101, 5000, "Computer Science", 3);

        // Use methods
        t1.displayInfo();
        System.out.println();

        t1.teach();
        System.out.println();

        // Increase salary using superclass method
        t1.increaseSalary(500);
        System.out.println();

        t1.displayInfo();
    }
}