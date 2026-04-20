interface Payment {
    void pay(double amount);
}

class UpiPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

class CardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Card");
    }
}

abstract class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
    }

    abstract double getDiscount(); // moved here so it's polymorphic
}

class Student extends Person {
    Student(String name) {
        super(name);
    }

    @Override
    public double getDiscount() {
        return 0.20; // 20% discount
    }
}

class Faculty extends Person {
    Faculty(String name) {
        super(name);
    }

    @Override
    public double getDiscount() {
        return 0.10; // 10% discount
    }
}

public class MainLessons {

    // Applies discount and delegates payment to whichever Payment method is passed
    static void processPayment(Person person, Payment paymentMethod, double originalAmount) {
        person.display();
        double discount = person.getDiscount();
        double finalAmount = originalAmount * (1 - discount);
        System.out.println("Discount applied: " + (discount * 100) + "%");
        paymentMethod.pay(finalAmount);
        System.out.println("---");
    }

    public static void main(String[] args) {
        Student alice  = new Student("Alice");
        Faculty bob    = new Faculty("Bob");

        Payment upi  = new UpiPayment();
        Payment card = new CardPayment();

        processPayment(alice, upi,  1000); // Student pays via UPI
        processPayment(bob,   card, 1000); // Faculty pays via Card
    }
}