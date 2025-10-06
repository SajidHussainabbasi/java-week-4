package exceptions.exercises;

/**
 * Exercise 1:
 * Ask the user to input two numbers.
 * Divides two numbers.
 * Catch ArithmeticException when dividing by zero.
 * Print a friendly error message like "Cannot divide by zero!".
 */

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Ask user for two numbers
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            // Perform division
            int result = num1 / num2;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter numeric values only.");
        } finally {
            scanner.close();
        }
    }
}



