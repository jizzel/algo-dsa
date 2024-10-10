package main.java.org.algodsa;

/**
 * Class to remove all instances of a specified value from an array and return the new length of the array.
 */
public class RemoveElement {
    /**
     * Constructor
     */
    public RemoveElement(){}

    /**
     * <h4><a href="https://leetcode.com/problems/remove-element/">27. Remove Element</a></h4>
     * <br>
     * Removes all occurrences of the specified value from the input array, modifies the array in-place, and returns
     * the new length of the modified array.
     * The relative order of the elements may be changed, but the elements after the new length do not matter.<br>
     * <br>
     * Time Complexity: O(n), where n is the number of elements in the array.
     * Each element is visited once.
     * <br>
     * Space Complexity: O(1), as the operation modifies the array in place without requiring extra space.<br>
     * <br>
     * @param nums the input array from which the value should be removed
     * @param val the value to be removed from the array
     * @return the new length of the array after removing all instances of val
     */
    public int removeElement(int[] nums, int val) {
        int j = 0;
        for (int num : nums) {
            if (num != val) {
                nums[j++] = num;
            }
        }
        return j;
    }
}

