public class Student {
    String name;
    int age;
    double Gpa;
    boolean isEnrolled;

    Student(String name, int age, double Gpa) // <=Arguments
    {
        this.name = name; // <==Atributes
        this.age = age;
        this.Gpa = Gpa;
        this.isEnrolled = true;

    }

    void study(){

        System.out.println(this.name + " Studies");
    }
}
