package main.java.org.algodsa;

/**
 * Binary Search
 */
public class BinarySearch {
    /**
     * Constructor
     */
    public BinarySearch(){}

    /**
     * <h4><a href="https://leetcode.com/problems/binary-search/">Binary Search</a></h4>
     * Performs binary search on a sorted array to find the target value.<br>
     * <br>
     * Time Complexity: O(log n) - where n is the number of elements in the array.<br>
     * Space Complexity: O(1) - uses constant space.<br>
     * <br>
     * @param nums the sorted array of integers
     * @param target the value to search for
     * @return the index of the target if found, otherwise -1
     */
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        // Loop until the search interval becomes empty
        while (low <= high) {
            // Find the middle index, avoiding overflow by using (low + (high - low) / 2)
            int mid = low + (high - low) / 2;  // Alternatively: (low + high) >>> 1;

            // If the middle element is the target, return its index
            if (nums[mid] == target) {
                return mid;
            }

            // If the target is greater than the middle element, search in the right half
            if (target > nums[mid]) {
                low = mid + 1;
            } else {
                // If the target is smaller, search in the left half
                high = mid - 1;
            }
        }

        // If the target is not found, return -1
        return -1;
    }
}
