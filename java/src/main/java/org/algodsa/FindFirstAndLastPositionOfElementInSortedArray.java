package main.java.org.algodsa;

/**
 * This class provides a method to find the first and last positions of a target element in a sorted array.
 */
public class FindFirstAndLastPositionOfElementInSortedArray {
    /**
     * Constructor
     */
    public FindFirstAndLastPositionOfElementInSortedArray(){}

    /**
     * <h4><a href="https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/">34. Find First and Last Position of Element in Sorted Array</a></h4>
     * <br>
     * Finds the starting and ending positions of the target element in a sorted array.
     * <br>
     * This method uses binary search to locate the first and last occurrences of the target.
     * It returns [-1, -1] if the target is not found in the array.<br>
     * <br>
     * Time Complexity: O(log n), as the binary search is used twice.
     * Space Complexity: O(1), only a constant amount of space is used.<br>
     * <br>
     * @param nums the sorted array in which to search for the target element
     * @param target the element to find the first and last positions of
     * @return an array with two elements: the first and last positions of the target in the array;
     *         returns [-1, -1] if the target is not found
     */
    public int[] searchRange(int[] nums, int target) {
        int first = findRangeStartOrEnd(nums, target, true);
        int last = findRangeStartOrEnd(nums, target, false);
        return new int[] {first, last};
    }

    /**
     * A helper method that finds either the starting or ending position of the target.
     * <br>
     * This method adjusts its search range based on whether it is searching for the first or last occurrence.
     * <br>
     * @param nums the sorted array in which to search
     * @param target the element to locate
     * @param first a boolean flag; if true, finds the first occurrence, otherwise finds the last occurrence
     * @return the index of the target's occurrence as specified by the `first` parameter;
     *         returns -1 if the target is not found
     */
    private int findRangeStartOrEnd(int[] nums, int target, boolean first) {
        int left = 0, right = nums.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                index = mid;
                if (first) right = mid - 1;  // Continue searching in the left half
                else left = mid + 1;  // Continue searching in the right half
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return index;
    }
}
