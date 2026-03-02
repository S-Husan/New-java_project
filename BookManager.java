class Book {
    String title;
    String author;
    int noOfPages;

    // Constructor
    Book(String t, String a, int n) {
        title = t;
        author = a;
        noOfPages = n;
    }
}

public class BookManager {

    // Method to display books
    static void dispBook(Book[] books) {
        if (books == null)
            return;

        for (Book book : books) {
            if (book != null) {
                System.out.println("Book title: " + book.title);
                System.out.println("Author: " + book.author);
                System.out.println("Number of pages: " + book.noOfPages);
                System.out.println("----------------------");
            }
        }
    }

    public static void main(String[] args) {

        Book[] books = {
            new Book("Java", "Gosling", 345),
            new Book("C", "Dennis", 456),
            new Book("C#", "Edward", 3566)
        };

        dispBook(books);
    }
}