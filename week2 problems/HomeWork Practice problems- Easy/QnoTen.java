//10. Create Multiple Objects. Create a class Car with attributes brand and year. Create two Car objects in the main method and display their details.

class Car{
    String brand;
    int year;

    // Constructor to initialize the Car object
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

public class QnoTen {
    public static void main(String[] args) {
        // Create two Car objects
        Car car1 = new Car("Toyota", 2020);
        Car car2 = new Car("Honda", 2021);

        // Display details of the first car
        System.out.println("Car 1 Details:");
        car1.displayDetails();

        // Display details of the second car
        System.out.println("\nCar 2 Details:");
        car2.displayDetails();
    }
}
