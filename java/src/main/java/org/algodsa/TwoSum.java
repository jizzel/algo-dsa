package main.java.org.algodsa;

import java.util.HashMap;
import java.util.Map;

/**
 * Two Sum
 */
public class TwoSum {
    /**
     * Constructor
     */
    public TwoSum(){}

    /**
     * <h4><a href="https://leetcode.com/problems/two-sum/description/">Two Sum</a></h4>
     * Finds two numbers in the input array that add up to a specified target.<br>
     * <br>
     * This method returns the indices of the two numbers such that they add up to the target.<br>
     * It assumes that each input has exactly one solution, and no element can be used twice.<br>
     * <br>
     * @param nums the input array of integers
     * @param target the target sum we are looking for
     * @return an array of two integers representing the indices of the numbers that add up to the target,
     *         or null if no solution is found.
     * <br>
     * Time Complexity: O(n) - where n is the number of elements in the array. We traverse the array once.<br>
     * Space Complexity: O(n) - the HashMap can contain up to n elements in the worst case.<br>
     */
    public int[] twoSum(int[] nums, int target) {
        // HashMap to store the numbers and their indices
        Map<Integer, Integer> map = new HashMap<>();

        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement by subtracting the current element from the target
            int complement = target - nums[i];

            // If the complement is already in the map, we found the solution
            if (map.containsKey(complement)) {
                // Return the indices of the complement and the current element
                return new int[] { map.get(complement), i };
            }

            // Otherwise, add the current element to the map with its index
            map.put(nums[i], i);
        }

        // If no solution is found, return null
        return null;
    }
}
