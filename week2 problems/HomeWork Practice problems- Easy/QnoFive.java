//5. Use of Logical Operators.Write a Java program to check if a person is eligible to vote. (The person must be 18 or older and a citizen.)

public class QnoFive {
    public static void main(String[] args) {
        int age = 20;
        boolean isCitizen = true;

        if (age >= 18 && isCitizen) {
            System.out.println("The person is eligible to vote.");
        } else {
            System.out.println("The person is not eligible to vote.");
        }
    }
}
