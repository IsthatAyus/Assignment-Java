//8. Simple Calculator (if-else).Write a Java program that asks the user to enter two numbers and an operator (+, -, *, /) and then calculates the result based on the operator using if-else statements.

import java.util.Scanner;

public class QnoEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        int result = 0; // Variable to store the result

        // Perform calculation based on the operator
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) { // Check for division by zero
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                scanner.close();
                return; // Exit the program
            }
        } else {
            System.out.println("Error: Invalid operator.");
            scanner.close();
            return; // Exit the program
        }

        // Display the result
        System.out.println("Result: " + result);

        scanner.close(); // Close the scanner
    }
}
