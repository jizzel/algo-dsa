package main.java.org.algodsa;

/**
 * Class to move all zeroes in an array to the end while maintaining the relative order of the non-zero elements.
 */
public class MoveZeroes {
    /**
     * Constructor
     */
    public MoveZeroes(){}

    /**
     * <h4><a href="https://leetcode.com/problems/move-zeroes/description/">283. Move Zeroes</a></h4>
     * <br>
     * Moves all zero elements to the end of the array while keeping the order of non-zero elements.<br>
     * The transformation is done in-place using a single pass.<br>
     * <br>
     * Time Complexity: O(n), where n is the length of the array. We traverse the array once.
     * <br>
     * Space Complexity: O(1), as no extra space is used apart from a few variables for tracking.
     * <br>
     * @param nums the input array of integers
     */
    public void moveZeroes(int[] nums) {
        int lastNonZero = 0;  // Tracks the position to place the next non-zero element

        // Single pass: Move non-zero elements to the front and shift zeros to the back
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != lastNonZero) {
                    nums[lastNonZero] = nums[i];  // Place non-zero at the correct position
                    nums[i] = 0;  // Set the current position to zero
                }
                lastNonZero++;  // Move to the next position for non-zero elements
            }
        }
    }
}
