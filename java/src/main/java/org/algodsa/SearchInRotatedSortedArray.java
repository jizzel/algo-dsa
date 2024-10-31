package main.java.org.algodsa;

/**
 * This class provides a method to search for a target value in a rotated sorted array.
 */
public class SearchInRotatedSortedArray {
    /**
     * Constructor
     */
    public SearchInRotatedSortedArray(){}

    /**
     * <h4><a href="https://leetcode.com/problems/search-in-rotated-sorted-array/">33. Search in Rotated Sorted Array</a></h4>
     * <br>
     * Searches for a target value in a rotated sorted array and returns its index if found.
     * <br>
     * The array is sorted but rotated at some unknown pivot point. This method uses a modified binary
     * search to handle the rotated sections of the array.<br>
     * <br>
     * Time Complexity: O(log n), as it uses binary search.
     * Space Complexity: O(1), with only constant space used.<br>
     * <br>
     * @param nums the rotated sorted array in which to search for the target
     * @param target the value to search for in the array
     * @return the index of the target if found; otherwise, -1
     */
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (target == nums[mid]) return mid;

            // Determine which side is sorted
            if (nums[left] <= nums[mid]) {
                // Left side is sorted
                if (target >= nums[left] && target < nums[mid]) right = mid - 1;
                else left = mid + 1;
            } else {
                // Right side is sorted
                if (target > nums[mid] && target <= nums[right]) left = mid + 1;
                else right = mid - 1;
            }
        }
        return -1;
    }
}
