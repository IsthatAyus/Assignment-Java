class Product{
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayDetails(){
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: $" + price);
    }
}

class Electronics extends Product {
    int warrantyPeriod;

    public Electronics(String name, double price, int warrantyPeriod) {
        super(name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Warranty Period: " + warrantyPeriod + " months");
    }
}

class Clothing extends Product {
    String size;
    String material;
    public Clothing(String name, double price, String size, String material) {
        super(name, price);
        this.size = size;
        this.material = material;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Size: " + size);
        System.out.println("Material: " + material);
    }
}

class Grocery extends Product {
    String expirationDate;

    public Grocery(String name, double price, String expirationDate) {
        super(name, price);
        this.expirationDate = expirationDate;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Expiration Date: " + expirationDate);
    }
}

public class ProductCatalog {
    public static void main(String[] args) {
        Product laptop = new Electronics("mobile", 252, 12);
        Product shirt = new Clothing("Hoddie", 29.99, "XL", "Cotton");
        Product milk = new Grocery("Milk", 2.49, "2025-08-24");

        laptop.displayDetails();
        System.out.println();
        shirt.displayDetails();
        System.out.println();
        milk.displayDetails();
    }
}
