package main.java.org.algodsa;

/**
 * The {@code LargestNumberAtLeastTwiceOfOthers} class provides a method to determine
 * whether the largest number in an array is at least twice as large as all other numbers.
 * If it is, the method returns the index of that largest number; otherwise, it returns -1.
 */
public class LargestNumberAtLeastTwiceOfOthers {

    /**
     * Default constructor for the LargestNumberAtLeastTwiceOfOthers class.
     * This constructor initializes the class without any specific setup.
     */
    public LargestNumberAtLeastTwiceOfOthers() {}

    /**
     * <h4><a href="https://leetcode.com/problems/largest-number-at-least-twice-of-others/">747. Largest Number At Least Twice of Others</a></h4>
     * Finds the index of the largest number that is at least twice as large as
     * every other number in the array.
     * <br><br>
     * Time Complexity: O(n)
     *  - One pass to find the max and second max values in the array.
     * <br>
     * Space Complexity: O(1)
     *  - Constant space used, no additional data structures.
     * <br><br>
     * @param nums the input array of integers
     * @return the index of the dominant number if it exists, otherwise -1
     */
    public int dominantIndex(int[] nums) {
        int max = -1;
        int secondMax = -1;
        int index = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
                index = i;
            } else if (nums[i] > secondMax) {
                secondMax = nums[i];
            }
        }

        return max >= 2 * secondMax ? index : -1;
    }
}
