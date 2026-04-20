
// import java.util.Scanner;
// // import java.util.Arrays;

// public class Student_Management_System {

//     public static void main(String[] args) {

//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter number of students: ");
//         int n = scanner.nextInt();
//         scanner.nextLine();

//         student[] students = new student[n];

//         for (int i = 0; i < n; i++) {
//             System.out.println("Enter details for student" + (i + 1));

//             System.out.print("Name: ");
//             String Sname = scanner.nextLine();

//             System.out.print("Age: ");
//             int age = scanner.nextInt();

//             System.out.print("Gpa: ");
//             double gpa = scanner.nextDouble();

//             scanner.nextLine();
//             students[i] = new student(name, age, gpa);
//         }

//         System.out.println("\nAll Students:");

//         for (int i = 0; i < students.length; i++) {

//         }

//         // System.out.println("The number of studets is : " + n);

//         scanner.close();
//     }
// }




import java.util.Scanner; 
// Import Scanner class from Java library to read user input from keyboard

class Student {  
// Create a class called Student (a blueprint for student objects)

    String name;  
    // Variable to store the student's name

    int age;  
    // Variable to store the student's age

    double gpa;  
    // Variable to store the student's GPA (decimal number)

    Student(String name, int age, double gpa) {  
    // Constructor: used to create a Student object and set its values

        this.name = name;  
        // "this.name" refers to the object's name variable
        // It is assigned the value passed in the constructor

        this.age = age;  
        // Assign the age parameter to the object's age variable

        this.gpa = gpa;  
        // Assign the gpa parameter to the object's gpa variable
    }
}

public class StudentManagementSystem {  
// Main class where the program runs

    public static void main(String[] args) {  
    // Main method: the starting point of every Java program

        Scanner scanner = new Scanner(System.in);  
        // Create Scanner object to read input from the keyboard

        System.out.print("Enter number of students: ");  
        // Ask user to enter how many students will be stored

        int n = scanner.nextInt();  
        // Read the number entered by the user

        scanner.nextLine();  
        // Consume leftover newline from nextInt()

        Student[] students = new Student[n];  
        // Create an array that can store 'n' Student objects

        for(int i = 0; i < n; i++) {  
        // Loop runs 'n' times to input data for each student

            System.out.println("Enter details for student " + (i+1));  
            // Show which student we are entering

            System.out.print("Name: ");  
            // Ask user for student name

            String name = scanner.nextLine();  
            // Read the name entered by the user

            System.out.print("Age: ");  
            // Ask user for age

            int age = scanner.nextInt();  
            // Read the age

            System.out.print("GPA: ");  
            // Ask user for GPA

            double gpa = scanner.nextDouble();  
            // Read the GPA

            scanner.nextLine();  
            // Consume newline so nextLine() works correctly later

            students[i] = new Student(name, age, gpa);  
            // Create a Student object and store it in the array
        }

        System.out.println("\nAll Students:");  
        // Print header before displaying all students

        for(int i = 0; i < students.length; i++) {  
        // Loop through the array of students

            System.out.println("Name: " + students[i].name +
                               ", Age: " + students[i].age +
                               ", GPA: " + students[i].gpa);
            // Print each student's information
        }

        Student topStudent = students[0];  
        // Assume the first student has the highest GPA initially

        for(int i = 1; i < students.length; i++) {  
        // Loop starting from the second student

            if(students[i].gpa > topStudent.gpa) {  
            // If current student's GPA is greater

                topStudent = students[i];  
                // Update topStudent to this student
            }
        }

        System.out.println("\nStudent with highest GPA: " + topStudent.name +
                           " (" + topStudent.gpa + ")");
        // Print student who has the highest GPA

        System.out.print("\nSearch student by name: ");  
        // Ask user to input name to search

        String searchName = scanner.nextLine();  
        // Read the name to search

        boolean found = false;  
        // Boolean variable to track if student is found

        for(int i = 0; i < students.length; i++) {  
        // Loop through all students

            if(students[i].name.equalsIgnoreCase(searchName)) {  
            // Compare names ignoring uppercase/lowercase differences

                System.out.println("Student Found: " +
                        students[i].name + ", Age: " +
                        students[i].age + ", GPA: " +
                        students[i].gpa);
                // Display found student's information

                found = true;  
                // Mark that we found the student

                break;  
                // Stop searching after finding the student
            }
        }

        if(!found) {  
        // If the student was not found

            System.out.println("Student not found.");
            // Print message
        }

        scanner.close();    
        // Close scanner to free system resources
    }
}