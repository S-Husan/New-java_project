import java.util.Scanner;

public class Sr {
    public static void main(String[] args) {

        Sr_constructor_marks Student1 = new Sr_constructor_marks("Math", 80, 3.4, 90);
        Sr_constructor_marks Student2 = new Sr_constructor_marks("Physics", 10, 1.2, 50);
        Sr_constructor_marks Student3 = new Sr_constructor_marks("Chemistry", 60, 2.8, 70);
        Sr_constructor_marks Student4 = new Sr_constructor_marks("Biology", 100, 4.0, 95);

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {

            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            if (i == 0) {
                System.out.println(name + " : " + Student1.Math + " - Score " + Student1.score + ", gpa " + Student1.gpa
                        + ", Average " + Student1.average);
            }

            if (i == 1) {
                System.out.println(name + " : " + Student2.Math + " - Score " + Student2.score + ", gpa " + Student2.gpa
                        + ", Average " + Student2.average);
            }

            if (i == 2) {
                System.out.println(name + " : " + Student3.Math + " - Score " + Student3.score + ", gpa " + Student3.gpa
                        + ", Average " + Student3.average);
            }

            if (i == 3) {
                System.out.println(name + " : " + Student4.Math + " - Score " + Student4.score + ", gpa " + Student4.gpa
                        + ", Average " + Student4.average);
            }
        }
        
        sc.close();
    }
}