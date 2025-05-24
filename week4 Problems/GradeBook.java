class Student{
    private String name;
    private int rollNumber;
    private double[] marks;

    public Student(String name, int rollNumber, double[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public double calculateAverage() {
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }
    public String getName() {
        return name;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public double[] getMarks() {
        return marks;
    }
}

class GraduateStudent extends Student {
    private String thesisTitle;

    public GraduateStudent(String name, int rollNumber, double[] marks, String thesisTitle) {
        super(name, rollNumber, marks);
        this.thesisTitle = thesisTitle;
    }

    public String getThesisTitle() {
        return thesisTitle;
    }

    public void printThesisTitle() {
        System.out.println("Thesis Title: " + thesisTitle);
    }
}

public class GradeBook {
    public static void main(String[] args) {
        double[] marks = {85.5, 90.0, 78.5};
        GraduateStudent gradStudent = new GraduateStudent("Alice", 101, marks, "AI in Education");

        System.out.println("Name: " + gradStudent.getName());
        System.out.println("Roll Number: " + gradStudent.getRollNumber());
        System.out.println("Average Marks: " + gradStudent.calculateAverage());
        gradStudent.printThesisTitle();
    }
}
