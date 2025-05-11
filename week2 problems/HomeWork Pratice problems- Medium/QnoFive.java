/* 5. Movie Details Manager
Create a Movie class with attributes: name, language, rating (out of 5).
Create a method displayMovieDetails().
In main(), create 4 Movie objects and call displayMovieDetails(). */

class Movie {
    private String name;
    private String language;
    private double rating;

    public Movie(String name, String language, double rating) {
        this.name = name;
        this.language = language;
        this.rating = rating;
    }

    public void displayMovieDetails() {
        System.out.println("Movie Name: " + name);
        System.out.println("Language: " + language);
        System.out.println("Rating: " + rating + "/5");
        System.out.println();
    }
}
public class QnoFive {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Inception", "English", 4.8);
        Movie movie2 = new Movie("Parasite", "Korean", 4.6);
        Movie movie3 = new Movie("Amélie", "French", 4.5);
        Movie movie4 = new Movie("Spirited Away", "Japanese", 4.7);

        movie1.displayMovieDetails();
        movie2.displayMovieDetails();
        movie3.displayMovieDetails();
        movie4.displayMovieDetails();
    }

}
