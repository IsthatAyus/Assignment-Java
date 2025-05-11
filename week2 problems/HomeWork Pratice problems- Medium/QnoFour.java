/*4. Rectangle and Area Calculation
Create a class Rectangle with length and width.
Initialize using a constructor.
Create a method calculateArea() that returns the area.
Create 3 rectangles of different dimensions and display their areas. */

class Rectangle {
    private double length;
    private double width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }
}

public class QnoFour {
    public static void main(String[] args) {
        // Create 3 rectangles with different dimensions
        Rectangle rect1 = new Rectangle(5.0, 3.0);
        Rectangle rect2 = new Rectangle(7.5, 4.5);
        Rectangle rect3 = new Rectangle(10.0, 2.0);

        // Display their areas
        System.out.println("Area of Rectangle 1: " + rect1.calculateArea());
        System.out.println("Area of Rectangle 2: " + rect2.calculateArea());
        System.out.println("Area of Rectangle 3: " + rect3.calculateArea());
    }
}
