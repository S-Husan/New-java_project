class Employee {
    String name;
    double salary;

    Employee(String n, double s) {
        this.name = n;
        this.salary = s;

    }

    public void displayDitails() {
        System.out.println("The name of the emploee is " + name);
    }
}

class Manager extends Employee {
    double bonus;
    Manager(String name, double salary, double b) {
        super(name, salary);
        this.bonus = b;
    }
    public void displayDitails(){
        super.displayDitails(   );
         System.out.println("The selery is " + salary + " and the total is " + (super.salary+ bonus));

    }
}

public class Demo2 {
    public static void main(String[] args) {
        Manager meneger = new Manager("Husan",100,20);
        meneger.displayDitails();
        // System.out.println("The bonus is " + bonus + "and the total salary is " + salary);
        
    }
}
