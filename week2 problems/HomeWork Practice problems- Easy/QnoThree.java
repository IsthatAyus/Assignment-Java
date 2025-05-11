// 3. Even or Odd Checker . Write a Java program that checks if a number (taken as input) is even or odd using an if-else statement.
public class QnoThree {
    public static void main(String[] args) {
        int number = 10; // You can change this number to test with different values

        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}
