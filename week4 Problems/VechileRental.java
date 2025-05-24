class Vechile{
    int days;
    int plateNumber;
    double baseRate;

    public Vechile(int plateNumber, double baseRate, int days) {
        this.days = days;
        this.plateNumber = plateNumber;
        this.baseRate = baseRate;
    }

    public void calculateRental(){
        System.out.println("Calculating rental for bike with plate number: " + plateNumber);
    }

    public void calculateRental(int days) {
        double totalCost = baseRate * days;
        System.out.println("Total rental cost for " + days + " days: $" + totalCost);
    }
}

class Car extends Vechile {
    public Car(int plateNumber, double baseRate, int days) {
        super(plateNumber, baseRate, days);
    }

    @Override
    public void calculateRental(int days) {
        double totalCost = baseRate * days;
        System.out.println("Total rental cost of Car for " + days + " days: $" + totalCost);
    }
}

class Truck extends Vechile {
    int loadfee;
    public Truck(int plateNumber, double baseRate, int days, int loadfee) {
        super(plateNumber, baseRate, days);
        this.loadfee = loadfee;
    }

    @Override
    public void calculateRental(int days) {
        double totalCost = baseRate * days + loadfee;
        System.out.println("Total rental cost of truck for " + days + " days: $" + totalCost);
    }
}

class Bike extends Vechile {
    public Bike(int plateNumber, double baseRate, int days) {
        super(plateNumber, baseRate, days);
    }

    @Override
    public void calculateRental() {
        double totalCost = baseRate;
        System.out.println("Total rental cost of bike for " + days + " days: $" + totalCost);
    }
}

public class VechileRental {
    public static void main(String[] args) {
        Vechile car = new Car(1234, 50.0, 3);
        car.calculateRental(3);

        Vechile truck = new Truck(5678, 70.0, 2, 20);
        truck.calculateRental(2);

        Vechile bike = new Bike(9101, 15.0, 1);
        bike.calculateRental();
    }
}
