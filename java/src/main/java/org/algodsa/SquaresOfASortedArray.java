package main.java.org.algodsa;

/**
 * Class to return the squares of each number in a sorted array, also sorted in non-decreasing order.
 */
public class SquaresOfASortedArray {
    /**
     * Constructor
     */
    public SquaresOfASortedArray(){}

    /**
     * <h4><a href="https://leetcode.com/problems/squares-of-a-sorted-array/description/">977. Squares of a Sorted Array</a></h4>
     * Returns a sorted array of the squares of the input array elements, where the input array is sorted in non-decreasing order.<br>
     * <br>
     * Time Complexity: O(n), where n is the number of elements in the input array. We iterate over the array once, comparing the squares from both ends.
     * <br>
     * Space Complexity: O(n), since we create a new array to store the results.
     * <br>
     * @param nums a sorted array of integers
     * @return an array of the squares of the input numbers, sorted in non-decreasing order
     */
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int l = 0, r = n - 1;
        int i = r;

        // Use two pointers to iterate from both ends of the array
        while (l <= r) {
            int leftSq = nums[l] * nums[l];
            int rightSq = nums[r] * nums[r];

            // Compare squares and insert the larger one at the end of the result array
            if (leftSq > rightSq) {
                result[i--] = leftSq;
                l++;
            } else {
                result[i--] = rightSq;
                r--;
            }
        }

        return result;
    }
}

