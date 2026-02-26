// 1. Import Scanner class for taking input from user
import java.util.Scanner;

// 2. Create class StudentResult
public class StudentResult{

    // main method - program starts here
    public static void main(String[] args) {

        // Create Scanner object to read input
        Scanner input = new Scanner(System.in);

        // 3. Declare variables
        String sName;   // student name
        int sID;        // roll number
        int m1, m2, m3; // marks in three subjects

        // Take input from user
        System.out.print("Enter student name: ");
        sName = input.nextLine();   // reads full line of text

        System.out.print("Enter roll number: ");
        sID = input.nextInt();      // reads integer

        System.out.print("Enter marks for subject 1: ");
        m1 = input.nextInt();

        System.out.print("Enter marks for subject 2: ");
        m2 = input.nextInt();

        System.out.print("Enter marks for subject 3: ");
        m3 = input.nextInt();

        // 4. Calculate total and average
        int total = m1 + m2 + m3;
        double average = total / 3.0;   // use 3.0 for correct decimal average

        // 5. Print results
        System.out.println("\n--- Student Result ---");
        System.out.println("Name: " + sName);
        System.out.println("Roll Number: " + sID);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);

        // 6. Check pass or fail
        if (average >= 60) {
            System.out.println("Status: Passed");
        } else {
            System.out.println("Status: Failed");
        }

        // Close scanner
        input.close();
    }
}