import java.util.Scanner;
// public class revision 
// {

// Primitive = simple value stored directly in memory (stack)
// Reference = memory address (stack) that points to the (heap)

public static void main(String[] args) {

    // System.out.println("x");
    // JAVA START
    // int age = 50;

    // int year = 2025;
    // int quantity = 1;

    // double price = 19.99;
    // double gpa = 3.5;
    // double temperature = -12.5;

    // char grade = 'A';
    // char symbol = '!';
    // char currency = '$';

    // boolean isStudent = false;
    // boolean forSale = false;
    // boolean isOnline = true;

    /////////////////////////////////////////////////////////////////////////////////

    // User input in Java
    // Scanner scanner = new Scanner(System.in);
    // scanner.close();
    // System.out.println("Enter a number");

    // scanner.close();
    // }

    // Scanner => Name of utility (class name at the top that we imported)
    // scanner = name of an object we will be working with
    // "new"does two things:====> 1) Allocates memory for the object.
    // \\==> 2) Calls the constructor of the class
    // This creates a real object in memory

    // Meaning in words:Create a new Scanner object that
    // reads data from standard input (keyboard) and store its reference in variable
    // scanner.
    //

    // Scanner scanner = new Scanner(System.in);

    // a.close();

    /////////////////////////////////////////////////////////////////////////////////
    // Arethmatic operators
    // int x =10 ;
    // int y =2 ;
    // // int z = x + y ;
    // // int z = x - y ;
    // // int z = x * y ;
    // // int z = x / y ;
    // // int z = x % 20 ;
    // System.out.println(z);

    ///////////////////////////////////////////////////////////////////////////////////
    // Augmented Assignment Operators
    // int x =10 ;
    // int y =2 ;

    // x += y; // <==> x + x =y
    // x -= y; // <==> x - x =y
    // x *= y; // <==> x * x =y

    // double a = 10;
    // double b = 2;
    // a /= b ;// <==> a = a / b;
    // a %= b;
    // System.out.println(a);

    ////////////////////////////////////////////////////////////////////////////////////
    // Increment and Decrement Operators
    // int x = 1;
    // x += 1; // we can Increment that x by one by doing ++ for example x++;
    // x = x -1 ;// we can decrement that x by -1 by doung -- for example x--;

    ////////////////////////////////////////////////////////////////////////////////////
    // ORDER OF OPERATIONS [P-E-M-D-A-S] ===> Parentheses,
    // \Exponents, Multiplication/Division, Addition/Subtraction)

    // double result = 3 + 4 * (7-5 ) / 2.0;
    // System.out.println(result);

    // System.out.println();

    //////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////

    // We need to import scanner to take an input

    // SHOPING CARD PROGRAM

    // Scanner first_input = new Scanner(System.in);

    // System.out.print("Enter you name:");
    // String name = first_input.next();
    // here "name" decloration and "first_input.nextLine();" is assigniment
    // nextLine(); methof of our fisrt_input object reads characters with spaces
    // String name = first_input.nextLine();
    // next(); WE USE when WE NEED TO GET INPUT WITHOUT SPACES
    // To take integer input we use next ==>
    // System.out.print("Enter your age:");
    // int age = first_input.nextInt();

    // To take an double type input use next ==>

    // System.out.print("What is your gpa: ");
    // double gpa = first_input.nextDouble();

    // To take a boolean type input use next ==>
    // System.out.print("Are u a student ? ");
    // boolean isStudent = first_input.nextBoolean();

    // // Answers
    // System.out.println("Hello " + name );
    // System.out.println("You are " + age + " years old");
    // System.out.println("You Gpa is:" + gpa );
    // if (isStudent){
    // System.out.println("You are enrolled as a Student");
    // }
    // else{
    // System.out.println("You are not enrolled as a student");
    // }
    // first_input.close();

    ////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////

    //// Common issues if we accept first int or double then String u will get
    /// an error

    // Scanner scanner = new Scanner(System.in);

    // System.out.print("Age?");
    // int age = scanner.nextInt();
    // // to avoid an error commented above u need to use next ==>
    // scanner.nextLine(); idk why
    // scanner.nextLine();

    // System.out.println("Enter ur favorite colour");
    // String color = scanner.nextLine();

    // System.out.println("Yu are " + age + " years old");
    // System.out.println("You like the color " + color);

    ///////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////

    // Calculate area of a rectangle

    // double width = 0;
    // double height = 0;
    // double area = 0;

    // Scanner scanner = new Scanner(System.in);

    // System.out.print("Enter the width: ");
    // width = scanner.nextDouble();

    // System.out.print("Enter the height: ");
    // height = scanner.nextDouble();

    // area = width * height;

    // System.out.println("The area is " + area +" cm²");

    // scanner.close();

    ////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////
    // Shopping card programm

    // Scanner scanner = new Scanner(System.in);

    // String item;
    // double price;
    // int quantity;
    // char currency = '$';
    // double total;

    // System.out.print("What item whould u like to buy?: ");
    // item = scanner.nextLine();

    // System.out.print("What is price for each? :");
    // price = scanner.nextDouble();

    // System.out.println("How many whould u like? :");
    // quantity = scanner.nextInt();

    // // System.out.print(quantity);

    // total = price * quantity;
    // System.out.println("\nYou have bought "+ quantity +" "+ item+"/s" );
    // System.out.println("Your total is "+ currency+total);

    // scanner.close();

    // Prictise
    Scanner scanner = new Scanner(System.in);
    String Laptop_model;
    double price;
    int quantity;
    char currency = '$';
    double total;
    String color;

    System.out.print("What machine whould u like to buy? :");
    Laptop_model = scanner.nextLine();
    
    System.out.print("What colour u want? :");
    color = scanner.nextLine();

    System.out.print("What is price for this? :");
    price = scanner.nextDouble();
    
    System.out.print("How many of them u need to buy? :");
    quantity = scanner.nextInt();


    total = price* quantity;


    System.out.println("Total price is " + currency +total);
    System.out.println("You bought "+ color +" "+ Laptop_model + ",and the quantity of laptop/s is " + quantity + " Congarts!!!" );
    scanner.close();

}
