// 1. Book Library (Manual Objects). Create a Book class with attributes: title, author, ISBN. In the main() method, create 5 different Book objects manually and display their details using a method showDetails().

class Book {
    String title;
    String author;
    String ISBN;

    // Constructor
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    // Method to display book details
    public void showDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println();
    }
}

public class QnoOne {
    public static void main(String[] args) {
        // Creating 5 different Book objects
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0-06-112008-4");
        Book book2 = new Book("1984", "George Orwell", "978-0-452-28423-4");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0-7432-7356-5");
        Book book4 = new Book("The Catcher in the Rye", "J.D. Salinger", "978-0-06-081624-7");
        Book book5 = new Book("Pride and Prejudice", "Jane Austen", "978-0-06-112008-4");

        // Displaying book details
        book1.showDetails();
        book2.showDetails();
        book3.showDetails();
        book4.showDetails();
        book5.showDetails();
    }
}
