/*3. Student Grading (Switch Statement)
Create a Student class with name and marks.
Write a method calculateGrade() that assigns a grade (A, B, C, D, F) based on marks using a switch or if-else ladder.
Create 3 students and display their grades. */


class Student {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public char calculateGrade() {
        char grade;
        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 80) {
            grade = 'B';
        } else if (marks >= 70) {
            grade = 'C';
        } else if (marks >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }
}

public class QnoThree {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 85);
        Student student2 = new Student("Bob", 75);
        Student student3 = new Student("Charlie", 65);

        System.out.println("Grade for " + student1.name + ": " + student1.calculateGrade());
        System.out.println("Grade for " + student2.name + ": " + student2.calculateGrade());
        System.out.println("Grade for " + student3.name + ": " + student3.calculateGrade());
    }
}
