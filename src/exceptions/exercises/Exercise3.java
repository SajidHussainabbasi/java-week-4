package exceptions.exercises;

import java.util.Scanner;

/**
 * Exercise 3:
 * Ask the user to enter a number.
 * Convert the input from String to int using Integer.parseInt().
 * Catch NumberFormatException if the user enters invalid input.
 */
public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            String input = scanner.nextLine();

            // Convert String to int
            int number = Integer.parseInt(input);

            System.out.println("You entered: " + number);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}
