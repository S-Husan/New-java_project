//  Data Types, Variables, Constants & Operators
// class Prep1 {
//     public static void main(String[] args) {
//         // int = whole numbers (no decimals)
//         int age = 18;

//         // double = numbers with decimals
//         double price = 9.99;

//         // char = single character (use single quotes)
//         char grade = 'A';

//         // boolean = true or false only
//         boolean isStudent = true;

//         // String = words/sentences (use double quotes)
//         String name = "Alice";

//         System.out.println(name + " is " + age + " years old");
//         // Output: Alice is 18 years old

//         String n = "Husan";
//         int a = 18;
//         boolean Student = true;
//         System.out.println(
//                 "The name of the student is: " + n + " and the age is: " + a + " he is a " + Student + " student");

//         final String pa = "Naruto";
//         System.out.println(pa);
//         int aa = 10;
//         int ba = 3;
// System.out.println( aa +ba);
//         // Shorthand operators
//         a++; // a = a + 1 (now a is 11)
//         a--; // a = a - 1 (back to 10)
//         a += 5; // a = a + 5 (now a is 15)
//     }
// }

///////////////////////////////////////////////////////////////////////////////////////////
//===========================================================================================
//////////////////////////////////////////////////////////////////////////////////////////

// Input & Output
import java.util.Scanner;
import java.util.Arrays;

// class Prep1 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter your name:");
//         String name = scanner.nextLine();

//         System.out.println("So your name is " + name);
//         String answer = scanner.nextLine();
//         System.out.println( "if "+ answer+" then good");
//         scanner.close();

//     }
// }

///////////////////////////////////////////////////////////////////////////////////////////
//===========================================================================================
/////////////////////////////////////////////////////////////////////////////////////////

// If, If-Else, If-Else-If

// class Prep1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter your score: ");
//         int score = sc.nextInt();
//         char grade;
//         if (score >= 90){
//             grade ='A';
//         }else if (score >= 80){
//             grade = 'B';
//         }
//         else if(score >= 70){
//             grade = 'C';
//         }else{
//             grade = 'F';
//         }

//         System.out.println("Your grade is " + grade);
//         sc.close();
//     }

// }

///////////////////////////////////////////////////////////////////////////////////////////
//===========================================================================================
/////////////////////////////////////////////////////////////////////////////////////

// 🔄 Loops — for, while, do-while

// class Prep1 {
// public static void main(String[] args) {
// // Scanner sc = new Scanner(System.in);

// // for(int i = 1; i < 11; i++) {
// // System.out.println("Count " + i);
// // }

// // int sum = 0;
// // // Sum of first 10 numbers
// // for (int i = 1; i <=10; i++){
// // sum = sum + i;
// // }
// // System.out.println(sum);
// }
// }

// while loop

// class Prep1 {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);

// int number = 1;
// while(number <= 5){
//     System.out.println(number);
//     number ++;
// }
/////////////////////////////////////////////////////////////
// Real use: keep asking until valid input
// int guess = 0;
// while(guess != 7){
//     System.out.println("Guess number 1-10" );
//     guess = sc.nextInt();

// }
// System.out.println("Correct");

// sc.close();

/////////////////////////////////////////////////////////////

// do-while loop

// int count = 1;
// do {
//     System.out.println("Count" + count);
//     count++;
// }while(count <= 3);
// // int choice;

//     }
// }

///////////////////////////////////////////////////////////////////////////////////////////
//===========================================================================================
//////////////////////////////////////////////////////////////////////////

class Prep1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Creating arrays
        // int[] scores = new int[5]; // 5 empty slots [0,0,0,0,0]
        // int[] number = new int[3];
        // number[0]= 1;
        // number[1]= 12;
        // number[2]= 13;

        // // Putting values in (index starts at 0!)
        // scores[0] = 85; // first locker
        // scores[1] = 92;
        // scores[2] = 78;
        // scores[3] = 95;
        // scores[4] = 88; // last locker (index 4, not 5!)
        // int[] o = new int[2];
        // o[0]= 1;
        // o[1]= 2;

        // // Shortcut: initialize directly
        // int[] marks = { 85, 92, 78, 95, 88 };
        // // int[] num = {1,2,34,5};/
        // // Accessing values
        // System.out.println(marks[0]); // 85
        // System.out.println(marks.length); // 5 (total number of lockers)

        // // Traversing (visiting each locker) with for loop
        // for (int i = 0; i < marks.length; i++) {
        // System.out.println("marks[" + i + "] = " + marks[i]);
        // }

        // // Enhanced for loop (for-each) - simpler!
        // for (int mark : marks) {
        // System.out.println(mark);
        // }

        // String[] fruits = { "Apple", "orange" };
        // int numofruits = fruits.length;
        // System.out.println("there are " + numofruits + " fruits");
        // System.out.println("They are " + fruits[0] + " and " + fruits[1]);

        // for (int i = 0; i < fruits.length; i++) {
        // System.out.print(fruits[i] + " ");
        // }

        // for (String fruit : fruits) {
        // System.out.println(fruit);
        // }

        // 2d arrays
        // // 2D array = An array where each element is an array
        // Useful for storing a matrix of data
        // String[][] groceries = { { "apple", "orange", "banana" },
        // { "potato", "onion", "carrot" },
        // { "chicken", "pork", "beef", "fish" } };

        // groceries [0][2]= "lss";

        // for (String[] foods : groceries) {
        // for (String food : foods) {
        // System.out.print(food + " ");

        // }
        // System.out.println();
        // }

        // sc.close();

        char[][] telephone = { 
                { '1', '2', '3' },
                { '4', '5', '6' },
                { '*', '0', '#' } };
        for(char[] row: telephone){
            for(char number : row){
                System.out.print(number + " ");
            }
            System.out.println();

        }


    }

}