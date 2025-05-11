// 4. Simple Class with a Method.Create a class Student with two attributes: name and age. Create a method displayInfo() that prints the student's name and age. In the main method, create a Student object and call displayInfo().

public class QnoFour {
    String name;
    int age;


    public QnoFour(String name, int age) {
        this.name = name;
        this.age = age;
    }


    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {

        QnoFour student = new QnoFour("John Doe", 20);

        student.displayInfo();
    }
}
