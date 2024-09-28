package main.java.org.algodsa;

/**
 * Running Sum of 1d Array
 */
public class RunningSumOf1dArray {
    /**
     * Constructor
     */
    public RunningSumOf1dArray(){}

    /**
     * <h4><a href="https://leetcode.com/problems/running-sum-of-1d-array/">Running Sum of 1d Array (Linear Search)</a></h4>
     * Computes the running sum of an array of integers. <br>
     * <br>
     * The running sum of a given array is an array where each element at index `i` is the sum of all elements
     * from the start of the array up to index `i`. The original array is modified in-place to store the running sum.<br>
     * <br>
     * This method iteratively updates each element in the input array by adding the value of the previous element,
     * effectively transforming the array into its running sum form.<br>
     * <br>
     * Time Complexity: O(n) - where n is the number of elements in the array. The method processes each element exactly once.<br>
     * Space Complexity: O(1) - the transformation is done in place with no additional memory usage beyond the input array.<br>
     * <br>
     * Algorithm:<br>
     * 1. Iterate over the array starting from the second element (index 1).<br>
     * 2. For each element at index `i`, add the value of the previous element (`nums[i-1]`) to the current element (`nums[i]`).<br>
     * 3. After the loop completes, the array `nums` will be transformed into its running sum.<br>
     * 4. Return the modified array.<br>
     * <br>
     * Example:<br>
     * - Input: nums = [1, 2, 3, 4]<br>
     * - Output: [1, 3, 6, 10]<br>
     *
     * @param nums the array of integers for which the running sum is to be computed
     * @return the same array modified to contain the running sum
     */
    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
}
