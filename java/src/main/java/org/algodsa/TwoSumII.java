package main.java.org.algodsa;

/**
 * Two Sum II
 */
public class TwoSumII {

    /**
     * Constructor
     */
    public TwoSumII(){}

    /**
     * <h4><a href="https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/">Two Sum II - Input Array Is Sorted</a></h4>
     * Finds two numbers in a sorted array that add up to a specified target.<br>
     * <br>
     * This method returns the 1-based indices of the two numbers such that they add up to the target.<br>
     * It assumes that the input array is sorted in ascending order and has exactly one solution.<br>
     * <br>
     * @param numbers the sorted input array of integers
     * @param target the target sum we are looking for
     * @return an array of two integers representing the 1-based indices of the numbers that add up to the target
     * <br>
     * Time Complexity: O(n) - where n is the number of elements in the array.<br>
     * Space Complexity: O(1) - no extra space is used other than a few variables.<br>
     */
    public static int[] twoSumII(int[] numbers, int target) {
        // Declare an array to hold the result (though not necessary to initialize here)
        int[] ans = new int[2];

        // Initialize pointers
        int i = 0, j = numbers.length - 1;

        // Two-pointer technique to search for the solution
        while (i < j) {
            // If the sum of numbers at index i and j equals target
            if (numbers[i] + numbers[j] == target) {
                // Return the 1-based indices (hence i + 1 and j + 1)
                return new int[] {i + 1, j + 1};
            }

            // Calculate the complement to see if it's less than the current number at index j
            int complement = target - numbers[i];

            // If the complement is smaller, move the right pointer (j) leftward
            if (complement < numbers[j]) {
                j--;
            } else {
                // If the complement is larger or equal, move the left pointer (i) rightward
                i++;
            }
        }

        // Return ans in case no valid solution is found (though the problem assumes one solution exists)
        return ans;
    }
}
