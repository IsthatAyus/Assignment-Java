class SmartDevice{
    protected String brand;
    protected String model;

    public SmartDevice(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void turnOn() {
        System.out.println(brand + " " + model + " is turning on.");
    }

    public void turnOff() {
        System.out.println(brand + " " + model + " is turning off.");
    }
}

class SmartPhone extends SmartDevice {
    public SmartPhone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void turnOn() {
        System.out.println(brand + " " + model + " is opening.");
    }

    @Override
    public void turnOff() {
        System.out.println(brand + " " + model + " is closing.");
    }
}

class SmartWatch extends SmartDevice {
    public SmartWatch(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void turnOn() {
        System.out.println(brand + " " + model + " is starting.");
    }

    @Override
    public void turnOff() {
        System.out.println(brand + " " + model + " is stopping.");
    }
}

public class SmartDevices{
    public static void main(String[] args) {
        SmartDevice phone = new SmartPhone("Huwaei", "Honor 200");
        SmartDevice watch = new SmartWatch("Vivo", "Series 3");

        phone.turnOn();
        phone.turnOff();

        watch.turnOn();
        watch.turnOff();
    }
}
