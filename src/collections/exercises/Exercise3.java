package collections.exercises;

import java.util.*;

/**
 TODO:
 1. Create two sets of strings:
 - setA = ["Java", "Python", "C++", "Go"]
 - setB = ["JavaScript", "Python", "Ruby", "Go"]
 2. Find and print:
 - Languages that exist in both sets
 - Languages unique to setA
 - Languages unique to setB
 */
public class Exercise3 {
    public static void main(String[] args) {
        // 1. Create the sets
        Set<String> setA = new HashSet<>(Arrays.asList("Java", "Python", "C++", "Go"));
        Set<String> setB = new HashSet<>(Arrays.asList("JavaScript", "Python", "Ruby", "Go"));

        // 2a. Languages that exist in both sets (intersection)
        Set<String> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);

        // 2b. Languages unique to setA (set difference)
        Set<String> uniqueToA = new HashSet<>(setA);
        uniqueToA.removeAll(setB);

        // 2c. Languages unique to setB (set difference)
        Set<String> uniqueToB = new HashSet<>(setB);
        uniqueToB.removeAll(setA);

        // Print results
        System.out.println("Languages in both sets: " + intersection);
        System.out.println("Languages unique to setA: " + uniqueToA);
        System.out.println("Languages unique to setB: " + uniqueToB);
    }
}
