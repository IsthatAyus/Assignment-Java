/*7. Product Discount Calculator
Create a class Product with productName, price, and discountPercentage.
Write a method calculateFinalPrice() which returns price after discount.
Create 3 different products and print their final prices. */

class Product {
    private String productName;
    private double price;
    private double discountPercentage;

    public Product(String productName, double price, double discountPercentage) {
        this.productName = productName;
        this.price = price;
        this.discountPercentage = discountPercentage;
    }

    public double calculateFinalPrice() {
        return price - (price * discountPercentage / 100);
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }
}
public class QnoSeven {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1000.00, 10);
        Product product2 = new Product("Smartphone", 500.00, 15);
        Product product3 = new Product("Tablet", 300.00, 5);

        System.out.println("Final price of " + product1.getProductName() + ": $" + product1.calculateFinalPrice());
        System.out.println("Final price of " + product2.getProductName() + ": $" + product2.calculateFinalPrice());
        System.out.println("Final price of " + product3.getProductName() + ": $" + product3.calculateFinalPrice());
    }
}
