/*6. Employee Bonus Calculation
Create a class Employee with name, salary, and yearsOfExperience.
Write a method calculateBonus():

If experience > 5 years, bonus = 20% of salary

Otherwise, bonus = 10% of salary
Display the bonus amount for each employee. */
class Employee {
    private String name;
    private double salary;
    private int yearsOfExperience;

    public Employee(String name, double salary, int yearsOfExperience) {
        this.name = name;
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;
    }

    public double calculateBonus() {
        if (yearsOfExperience > 5) {
            return salary * 0.20; // 20% bonus
        } else {
            return salary * 0.10; // 10% bonus
        }
    }

    public void displayBonus() {
        System.out.println("Employee: " + name + ", Bonus: " + calculateBonus());
    }
}

public class QnoSix {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 50000, 6);
        Employee emp2 = new Employee("Bob", 40000, 3);

        emp1.displayBonus();
        emp2.displayBonus();
    }
}
