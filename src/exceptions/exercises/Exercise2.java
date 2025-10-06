package exceptions.exercises;

import java.util.Scanner;

/**
 * Exercise 2:
 * Create an int array with 5 elements.
 * Ask the user for an index to access.
 * Catch ArrayIndexOutOfBoundsException if the index is invalid.
 * Print an appropriate message instead of crashing.
 */
public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array with 5 elements
        int[] numbers = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter an index (0–4): ");
            int index = scanner.nextInt();

            // Attempt to access the array element
            System.out.println("Value at index " + index + ": " + numbers[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index! Please enter a number between 0 and 4.");
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter an integer value.");
        } finally {
            scanner.close();
        }
    }
}