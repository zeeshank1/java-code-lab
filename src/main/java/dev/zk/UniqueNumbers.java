//Java 8 program using Stream API to find the unique numbers in an integer array:
import java.util.*;
import java.util.stream.Collectors;

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 4, 4, 5, 6, 6};

        // Convert the array to a List
        List<Integer> uniqueNumbers = Arrays.stream(numbers)
                .boxed() // Convert int to Integer
                .collect(Collectors.groupingBy(num -> num, Collectors.counting())) // Count occurrences
                .entrySet().stream() // Stream the entrySet
                .filter(entry -> entry.getValue() == 1) // Keep only elements with count == 1
                .map(Map.Entry::getKey) // Extract the unique numbers
                .collect(Collectors.toList()); // Collect as a List

        // Print unique numbers
        System.out.println("Unique numbers: " + uniqueNumbers);
    }
}
/**
Explanation:
Arrays.stream(numbers): Converts the array to a stream.
boxed(): Converts the primitive int to its wrapper class Integer to work with collections.
groupingBy(): Groups the elements by value and counts their occurrences.
entrySet().stream(): Streams the entries of the map.
filter(entry -> entry.getValue() == 1): Filters the entries with a count of 1 (unique numbers).
map(Map.Entry::getKey): Extracts the key (unique number).
collect(Collectors.toList()): Collects the results as a list.
*/
