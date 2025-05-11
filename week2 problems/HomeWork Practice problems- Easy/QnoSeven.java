//7. Class Initialization through Constructor.Create a class Book with attributes title and author. Initialize them using a constructor, and print the details using a method showBook().

public class QnoSeven {
    private String title;
    private String author;


    public QnoSeven(String title, String author) {
        this.title = title;
        this.author = author;
    }


    public void showBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public static void main(String[] args) {

        QnoSeven book = new QnoSeven("To Kill a Mockingbird", "Harper Lee");

        book.showBook();
    }
}
