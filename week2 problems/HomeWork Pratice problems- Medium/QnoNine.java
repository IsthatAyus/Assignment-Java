/*9. Constants Usage Example
Create a Circle class with an attribute radius.
Use a final constant PI = 3.14159.
Write a method calculateCircumference() and calculateArea() using PI.
Create two Circle objects and display their area and circumference. */

class Circle {
    private double radius;
    private final double PI = 3.14159;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateCircumference() {
        return 2 * PI * radius;
    }

    public double calculateArea() {
        return PI * radius * radius;
    }
}
public class QnoNine {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(3.0);

        System.out.println("Circumference of Circle 1: " + circle1.calculateCircumference());
        System.out.println("Area of Circle 1: " + circle1.calculateArea());
        System.out.println("Circumference of Circle 2: " + circle2.calculateCircumference());
        System.out.println("Area of Circle 2: " + circle2.calculateArea());
    }
}
