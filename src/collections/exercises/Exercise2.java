package collections.exercises;

import java.util.*;

/**
 TODO:
 1. Create two lists of integers:
 - list1: [1, 3, 5, 7, 9]
 - list2: [2, 3, 4, 5, 6]
 2. Combine both into a new list that contains all elements.
 3. Remove duplicates from the combined list.
 4. Sort the final list in ascending order.
 5. Print the final result.
 */
public class Exercise2 {
    public static void main(String[] args) {
        // 1. Create two lists
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6));

        // 2. Combine both lists
        List<Integer> combinedList = new ArrayList<>(list1);
        combinedList.addAll(list2);

        // 3. Remove duplicates using a LinkedHashSet to preserve order
        Set<Integer> set = new LinkedHashSet<>(combinedList);

        // 4. Convert back to list and sort
        List<Integer> finalList = new ArrayList<>(set);
        Collections.sort(finalList);

        // 5. Print the final result
        System.out.println("Final sorted list without duplicates: " + finalList);
    }
}
