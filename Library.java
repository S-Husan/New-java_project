// Import Scanner class to read user input from keyboard
import java.util.Scanner;

// Book class represents a single book object
class Book {

    // Variables (attributes) that store book information
    String title;
    String author;
    int pages;

    // Constructor used to create a new Book object and initialize its values
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
}

// Library class that contains methods to work with books
class Library {

    // Method to display all books in the array
    public static void displayBooks(Book[] books) {

        // Loop through each book object in the array
        for (Book b : books) {

            // Print book information
            System.out.println("Title: " + b.title + ", Author: " + b.author + ", Pages: " + b.pages);
        }
    }

    // Method to find and display the book that has the maximum number of pages
    public static void maxPagesBook(Book[] books) {

        // Assume the first book has the maximum pages
        Book maxBook = books[0];

        // Loop through all books to find a book with more pages
        for (Book b : books) {

            // Compare pages
            if (b.pages > maxBook.pages) {

                // Update maxBook if a book with more pages is found
                maxBook = b;
            }
        }

        // Print the book with the maximum pages
        System.out.println("Book with maximum pages:");
        System.out.println("Title: " + maxBook.title + ", Author: " + maxBook.author + ", Pages: " + maxBook.pages);
    }

    // Method to search for a book by its title
    public static void searchByTitle(Book[] books, String title) {

        // Loop through all books
        for (Book b : books) {

            // Compare titles ignoring uppercase/lowercase differences
            if (b.title.equalsIgnoreCase(title)) {

                // If found, print book details
                System.out.println("Book found:");
                System.out.println("Title: " + b.title + ", Author: " + b.author + ", Pages: " + b.pages);
                return;
            }
        }

        // If no book was found
        System.out.println("Book not found!");
    }

    // Method to display all books written by a specific author
    public static void booksByAuthor(Book[] books, String author) {

        // Boolean variable to track if any book was found
        boolean notFound = true; 

        // Loop through all books
        for (Book b : books) {

            // Check if author name matches (case-insensitive)
            if (b.author.equalsIgnoreCase(author)) {

                // Print book information
                System.out.println("Book/s by " + author + ":");
                System.out.println("Title: " + b.title + ", Pages: " + b.pages);

                // Mark that at least one book was found
                notFound = false;
            }
        }

        // If no books by this author were found
        if (notFound)
            System.out.println("Book/s by " + author + " not found!");
    }

    // Main method where the program starts execution
    public static void main(String[] args) {

        // Create Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Ask the user how many books they want to enter
        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        // Create an array to store Book objects
        Book[] books = new Book[n];

        // Loop to input book details from the user
        for (int i = 0; i < n; i++) {

            System.out.println("Enter details for Book " + (i + 1));

            // Read book title
            System.out.print("Title: ");
            String title = sc.nextLine();

            // Read author name
            System.out.print("Author: ");
            String author = sc.nextLine();

            // Read number of pages
            System.out.print("Pages: ");
            int pages = sc.nextInt();
            sc.nextLine();

            // Create a Book object and store it in the array
            books[i] = new Book(title, author, pages);
        }

        // Display all books
        System.out.println("\nAll Books:");
        displayBooks(books);

        // Display the book with the maximum number of pages
        System.out.println();
        maxPagesBook(books);

        // Ask the user to search for a book by title
        System.out.println();
        System.out.print("Search for book by title: ");
        String searchTitle = sc.nextLine();
        searchByTitle(books, searchTitle);

        // Ask the user to search books by author
        System.out.println();
        System.out.print("Display books by author: ");
        String searchAuthor = sc.nextLine();
        booksByAuthor(books, searchAuthor);

        // Close the scanner to free resources
        sc.close();
    }
}