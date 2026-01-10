package L100.OOP.Class_Interactions.Aggregation.Java;

import java.util.ArrayList;
import java.util.List;

class Book {
    String title;

    Book(String title) {
        this.title = title;
    }
}

class Library {
    private String name;
    public List<Book> books; // Aggregation (weak ownership)

    Library(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }

    void showBooks() {
        if (books == null || books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (Book b : books) {
                System.out.println("Book: " + b.title);
            }
        }

    }
}

public class Main {
    /*
     * Scenario - Books(part) exist even after library(whole) is destroyed
     * public static void main(String[] args) {
     * 
     * Book b1 = new Book("Clean Code");
     * Book b2 = new Book("Design Patterns");
     * 
     * Library library = new Library(
     * "City Library",
     * List.of(b1, b2));
     * 
     * System.out.println("Before destroying the library");
     * library.showBooks();
     * 
     * // Destroy library
     * library = null;
     * 
     * // Books still exist
     * System.out.println("After destroying the library - Books still exist");
     * System.out.println(b1.title + " still exists");
     * System.out.println(b2.title + " still exists");
     * }
     */

    /*
     * Scenario - Library(part) exist even after books(whole) is destroyed
     * public static void main(String[] args) {
     * Book b1 = new Book("Java Basics");
     * Book b2 = new Book("OOP Concepts");
     * 
     * // Use ArrayList instead of List.of()
     * List<Book> bookList = new ArrayList<>();
     * bookList.add(b1);
     * bookList.add(b2);
     * 
     * Library library = new Library("City Library", bookList);
     * 
     * System.out.println("Before deleting a book:");
     * library.showBooks();
     * 
     * // Delete a part (Book)
     * library.books.remove(b1);
     * b1 = null; // Book reference removed
     * 
     * System.out.println("\nAfter deleting a book:");
     * library.showBooks();
     * 
     * // Library still exists
     * System.out.println("\nLibrary still exists even after book deletion");
     * }
     */

    // Scenario - Library(part) exist even after all books(whole) is destroyed
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics");
        Book b2 = new Book("OOP Concepts");

        List<Book> bookList = new ArrayList<>();
        bookList.add(b1);
        bookList.add(b2);

        Library library = new Library("City Library", bookList);
        library.showBooks();

        // Remove all books
        bookList.clear(); // or set bookList = null
        library.showBooks(); // Library still exists

    }
}
