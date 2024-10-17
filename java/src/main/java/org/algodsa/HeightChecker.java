package main.java.org.algodsa;

import java.util.Arrays;

/**
 * Class that provides a method to check how many students are not standing in their expected positions
 * based on their heights after sorting.
 */
public class HeightChecker {

    /**
     * Constructor
     */
    public HeightChecker(){}

    /**
     * <h4><a href="https://leetcode.com/problems/height-checker/description/">1051. Height Checker</a></h4>
     * <br>
     * Returns the number of indices where the heights of students differ from their expected sorted positions.
     * <br>
     * Time Complexity: O(n log n), where n is the number of elements in the array. This is due to the sorting step.<br>
     * Space Complexity: O(n), because we use an additional array to store the sorted heights.<br>
     * <br>
     * @param heights the original array of student heights
     * @return the number of indices where the student's height doesn't match the expected sorted height
     */
    public int heightChecker(int[] heights) {
        int[] expected = Arrays.copyOf(heights, heights.length);
        Arrays.sort(expected); // ToDo: Custom
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) count++;
        }
        return count;
    }
}

