package collections.exercises;

import java.util.*;

/**
 TODO:
 1. Create a Set<Integer> randomNumbers and add 15 random integers between 1 and 20.
 2. Check if the set contains the number 10.
 3. Remove all numbers less than 5.
 4. Print the final set.
 */
public class Exercise4 {
    public static void main(String[] args) {
        Set<Integer> randomNumbers = new HashSet<>();
        Random rand = new Random();

        // 1. Add 15 random integers between 1 and 20
        while (randomNumbers.size() < 15) {
            int num = rand.nextInt(20) + 1; // Generates 1 to 20
            randomNumbers.add(num);
        }

        // 2. Check if the set contains 10
        if (randomNumbers.contains(10)) {
            System.out.println("The set contains 10.");
        } else {
            System.out.println("The set does not contain 10.");
        }

        // 3. Remove all numbers less than 5
        randomNumbers.removeIf(n -> n < 5);

        // 4. Print the final set
        System.out.println("Final set after removing numbers < 5: " + randomNumbers);
    }
}
