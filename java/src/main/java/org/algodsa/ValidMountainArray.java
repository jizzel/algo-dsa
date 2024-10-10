package main.java.org.algodsa;

/**
 * Class to determine if an array forms a valid mountain array.
 */
public class ValidMountainArray {
    /**
     * Constructor
     */
    public ValidMountainArray(){}

    /**
     * <h4><a href="https://leetcode.com/problems/valid-mountain-array/">941. Valid Mountain Array</a></h4>
     * <br>
     * Determines whether the input array forms a valid mountain array. A mountain array must satisfy the following:<br>
     * - The array must have at least 3 elements.<br>
     * - There is exactly one peak element, where the values increase strictly before it and decrease strictly after it.<br>
     * <br>
     * The function iterates over the array to find the peak and ensures both the increasing and decreasing conditions are met.<br>
     * <br>
     * Time Complexity: O(n), where n is the number of elements in the array. We traverse the array twice:
     * once to find the peak and once to ensure it's strictly decreasing afterward.
     * <br>
     * Space Complexity: O(1), since no additional space is used except for a few integer variables.<br>
     * <br>
     * @param arr the input array of integers
     * @return true if the array forms a valid mountain array, false otherwise
     */
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;

        if (n < 3) return false; // Early exit if the array is too short

        int i = 1;

        // Climbing up: look for the peak
        while (i < n && arr[i] > arr[i - 1]) i++;

        // Check if the peak is valid (not the first or last element)
        if (i <= 1 || i >= n) return false;

        // Climbing down: ensure the array is decreasing after the peak
        while (i < n && arr[i] < arr[i - 1]) i++;

        // Return true if we've traversed the whole array, otherwise false
        return i == n;
    }
}