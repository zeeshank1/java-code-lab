//Java 8 program to find the first two maximum numbers from an integer array using Stream API:

import java.util.*;
import java.util.stream.Collectors;

public class FirstTwoMaxNumbers {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 9, 1, 6, 9, 2, 8};

        // Find the first 2 maximum numbers
        List<Integer> maxNumbers = Arrays.stream(numbers)
                .boxed() // Convert int to Integer
                .sorted(Comparator.reverseOrder()) // Sort in descending order
                .distinct() // Remove duplicates
                .limit(2) // Limit to the first 2 elements
                .collect(Collectors.toList()); // Collect as a List

        // Print the result
        System.out.println("First two max numbers: " + maxNumbers);
    }
}
/*
Explanation:
Arrays.stream(numbers): Converts the array to a stream.
boxed(): Converts the primitive int to its wrapper class Integer.
sorted(Comparator.reverseOrder()): Sorts the numbers in descending order.
distinct(): Removes duplicate numbers.
limit(2): Limits the stream to the first two elements.
collect(Collectors.toList()): Collects the result as a list.
*/
