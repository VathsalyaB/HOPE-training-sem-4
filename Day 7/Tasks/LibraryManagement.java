import java.util.*;
class Book{
    int bookId;
    String title;
    String author;
    boolean isIssued;

    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    void displayBook() {
        System.out.println(bookId + " | " + title + " | " + author + " | Issued: " + isIssued);
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    // Add book
    void addBook(Book b) {
        books.add(b);
    }

    // Show all books
    void showBooks() {
        for (Book b : books) {
            b.displayBook();
        }
    }

    // Issue book
    void issueBook(int bookId) {
        for (Book b : books) {
            if (b.bookId == bookId) {
                if (!b.isIssued) {
                    b.isIssued = true;
                    System.out.println("Book issued successfully!");
                } else {
                    System.out.println("Book already issued!");
                }
                return;
            }
        }
        System.out.println("Book not found!");
    }

    // Return book
    void returnBook(int bookId) {
        for (Book b : books) {
            if (b.bookId == bookId) {
                if (b.isIssued) {
                    b.isIssued = false;
                    System.out.println("Book returned successfully!");
                } else {
                    System.out.println("Book was not issued!");
                }
                return;
            }
        }
        System.out.println("Book not found!");
    }
}

// Main Class
public class LibraryManagement {
    public static void main(String[] args) {
        Library lib = new Library();

        // Adding books
        lib.addBook(new Book(1, "Java Basics", "James Gosling"));
        lib.addBook(new Book(2, "Python Guide", "Guido van Rossum"));

        // Show books
        System.out.println("All Books:");
        lib.showBooks();

        // Issue book
        lib.issueBook(1);

        // Show updated list
        System.out.println("\nAfter issuing:");
        lib.showBooks();

        // Return book
        lib.returnBook(1);

        System.out.println("\nAfter returning:");
        lib.showBooks();
    }
}