/*10. Manual Car Showroom Inventory
Create a Car class with attributes: brand, model, price.
Create 5 different Car objects with different details.
Display the cars whose price is greater than 20,00,000 (use if statement). */

class Car {
    String brand;
    String model;
    double price;

    public Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayCarDetails() {
        if (price > 2000000) {
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Price: " + price);
            System.out.println();
        }
    }
}
public class QnoTen {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2500000);
        Car car2 = new Car("Honda", "Civic", 1800000);
        Car car3 = new Car("BMW", "X5", 8000000);
        Car car4 = new Car("Audi", "A6", 6000000);
        Car car5 = new Car("Ford", "Mustang", 3000000);

        car1.displayCarDetails();
        car2.displayCarDetails();
        car3.displayCarDetails();
        car4.displayCarDetails();
        car5.displayCarDetails();
    }
}
