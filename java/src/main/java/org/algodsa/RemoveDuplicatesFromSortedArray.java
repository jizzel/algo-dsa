package main.java.org.algodsa;

/**
 * Class to remove duplicates from a sorted array in-place, returning the new length of the array.
 */
public class RemoveDuplicatesFromSortedArray {
    /**
     * Constructor
     */
    public RemoveDuplicatesFromSortedArray(){}

    /**
     * <h4><a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/">26. Remove Duplicates from Sorted Array</a></h4>
     * <br>
     * Removes duplicates from the sorted array such that each element appears only once.
     * Modifies the array in-place and returns the new length of the array.
     * <br>
     * The relative order of the unique elements is preserved, but the elements after the new length do not matter.
     * <br>
     * Time Complexity: O(n), where n is the number of elements in the array.
     * Each element is visited once.
     * <br>
     * Space Complexity: O(1), as the operation modifies the array in place without requiring extra space.<br>
     * <br>
     * @param nums the sorted input array from which duplicates should be removed
     * @return the new length of the array after removing duplicates
     */
    public int removeDuplicates(int[] nums) {
        int j = 1;
        int prev = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != prev) {
                nums[j++] = nums[i];
                prev = nums[i];
            }
        }

        return j;
    }
}

