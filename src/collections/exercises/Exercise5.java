package collections.exercises;

import java.util.*;

/**
 TODO:
 1. Create a List<String> words = ["apple", "banana", "apple", "orange", "banana", "apple"].
 2. Use a Map<String, Integer> to count how many times each word appears.
 3. Print the word counts (e.g., apple → 3, banana → 2, orange → 1).
 */
public class Exercise5 {
    public void run() {
        // 1. Create the list of words
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        // 2. Count occurrences using a HashMap
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        // 3. Print the word counts
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        new Exercise5().run();
    }
}
