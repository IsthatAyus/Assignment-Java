// 9. Positive, Negative or Zero. Write a Java program that takes a number and prints whether the number is positive, negative, or zero.

public class QnoNine {
    public static void main(String[] args) {
        int number = 23;

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
