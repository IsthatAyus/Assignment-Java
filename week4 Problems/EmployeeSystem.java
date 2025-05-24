class Employee{

    public String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        if (id >= 0) {
            this.id = id;
        } else {
            System.out.println("ID must be positive.");
        }
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative.");
        }
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        if (bonus >= 0) {
            this.bonus = bonus;
        } else {
            System.out.println("Bonus cannot be negative.");
        }
    }

    @Override
    public double getSalary() {
        return super.getSalary() + (super.getSalary() * bonus / 100);
    }
}

class Developer extends Employee {
    private int overtimeHours;
    private double ratePerHour;

    public Developer(String name, int id, double salary, double ratePerHour, int overtimeHours) {
        super(name, id, salary);
        this.ratePerHour = ratePerHour;
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + (overtimeHours * ratePerHour);
    }
}

public class EmployeeSystem {
    public static void main(String[] args) {
        Manager manager = new Manager("John Doe", 123, 50000, 10);
        Developer developer = new Developer("Jane Doe", 456, 40000, 20, 8);
        System.out.println("Manager salary: " + manager.getSalary());
        System.out.println("Developer salary: " + developer.getSalary());
    }
}
