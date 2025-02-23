//write a program to find first 2 max number from an in array using java 5

import java.util.Arrays;

public class FirstTwoMaxNumbersJava5 {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 9, 1, 6, 9, 2, 8};

        // Check if the array has at least two elements
        if (numbers.length < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        // Initialize max1 and max2 to the smallest possible value
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        // Iterate through the array
        for (int num : numbers) {
            if (num > max1) {
                max2 = max1; // Update max2 before updating max1
                max1 = num;
            } else if (num > max2 && num != max1) {
                max2 = num; // Update max2 if it's smaller than max1 but greater than current max2
            }
        }

        // Check if max2 was updated (in case all elements are equal)
        if (max2 == Integer.MIN_VALUE) {
            System.out.println("No second maximum number found.");
        } else {
            System.out.println("First maximum number: " + max1);
            System.out.println("Second maximum number: " + max2);
        }
    }
}
