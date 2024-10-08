package main.java.org.algodsa;

/**
 * Class to find the maximum number of consecutive 1s in a binary array.
 */
public class MaxConsecutiveOnes {
    /**
     * Constructor
     */
    public MaxConsecutiveOnes(){}

    /**
     * <h4><a href="https://leetcode.com/problems/max-consecutive-ones/">485. Max Consecutive Ones</a></h4>
     * <br>
     * Finds the maximum number of consecutive 1s in the given binary array.
     * <br>
     * Time Complexity: O(n), where n is the length of the array. We traverse the array once to count the consecutive 1s.
     * <br>
     * Space Complexity: O(1), since we are using only a constant amount of extra space for the counters.
     * <br>
     * @param nums an array of integers where each element is either 0 or 1
     * @return the maximum number of consecutive 1s in the array
     */
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currentCount = 0;

        // Iterate through the array and count consecutive 1s
        for (int num : nums) {
            if (num == 1) {
                currentCount++; // Increment current count of consecutive 1s
                maxCount = Math.max(maxCount, currentCount); // Update maxCount if needed
            } else {
                currentCount = 0; // Reset count if a 0 is found
            }
        }

        return maxCount;
    }
}

