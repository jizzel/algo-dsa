package main.java.org.algodsa;

/**
 * A class that provides functionality to find the pivot index in an array.
 * The pivot index is the index where the sum of the numbers strictly to the left
 * is equal to the sum of the numbers strictly to the right.
 */
public class FindPivotIndex {

    /**
     * Default constructor.
     */
    public FindPivotIndex() {}

    /**
     * Finds the pivot index of the given array.
     * The pivot index is the index where the sum of the numbers on the left
     * is equal to the sum of the numbers on the right.
     *
     * Time Complexity: O(n), where n is the number of elements in the array.
     *   - We make two passes through the array: one to calculate the total sum and one to find the pivot.
     *
     * Space Complexity: O(1).
     *   - Only a few integer variables are used for tracking sums.
     *
     * @param nums the input array of integers.
     * @return the pivot index if it exists, otherwise -1.
     */
    public int pivotIndex(int[] nums) {
        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;
        int rightSum = totalSum;

        for (int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];

            if (leftSum == rightSum) return i;

            leftSum += nums[i];
        }

        return -1;
    }
}
