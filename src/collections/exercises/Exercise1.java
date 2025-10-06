package collections.exercises;

import java.util.*;

/**
 TODO:
 1. Create a List<String> words containing: "apple", "banana", "kiwi", "strawberry", "pear".
 2. Create a new List<String> longWords that only contains words from the first list with 5 or more letters.
 3. Print both lists.
 */
public class Exercise1 {
    public static void main(String[] args) {
        // 1. Create the original list
        List<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "kiwi", "strawberry", "pear"));

        // 2. Create a new list containing words with 5 or more letters
        List<String> longWords = new ArrayList<>();
        for (String word : words) {
            if (word.length() >= 5) {
                longWords.add(word);
            }
        }

        // 3. Print both lists
        System.out.println("Original list: " + words);
        System.out.println("Long words (5 or more letters): " + longWords);
    }
}

