package Oct.ex_141024.Task;

abstract class Book {
    abstract void getDetails(String title, String author, int price);
}

// Concrete class that extends Book
public class PrintMyBook extends Book {
    // Implementation of the abstract method to print book details
    @Override
    void getDetails(String title, String author, int price) {
        // Print the details of the book
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        // Create an instance of PrintMyBook using the abstract type Book
        Book book = new PrintMyBook();
        // Call the getDetails method with book information
        book.getDetails("Harry Potter", "J.K. Rowling", 100);
        book.getDetails("Power of positive Thinking", " ", 170);
    }
}


