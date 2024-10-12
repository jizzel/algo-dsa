package main.java.org.algodsa;

/**
 * Class that provides a method to sort an array such that all even integers come before all odd integers.
 */
public class SortArrayByParity {
    /**
     * Constructor
     */
    public SortArrayByParity(){}

    /**
     * <h4><a href="https://leetcode.com/problems/sort-array-by-parity/description/">905. Sort Array By Parity</a></h4>
     * <br>
     * Sorts the input array so that all even integers appear before odd integers.
     * The method rearranges the elements in-place using a two-pointer approach.
     * <br>
     * Time Complexity: O(n), where n is the length of the array. We perform a single pass with two pointers.
     * <br>
     * Space Complexity: O(1), as the sorting is done in-place with no additional data structures.<br>
     * <br>
     * @param nums the input array of integers
     * @return the input array sorted by parity, with even numbers before odd numbers
     */
    public int[] sortArrayByParity(int[] nums) {
        int i = 0, j = nums.length - 1;

        while(i < j){
            if(nums[i] % 2 != 0 && nums[j] % 2 == 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            } else {
                if(nums[i] % 2 == 0) i++;
                if(nums[j] % 2 != 0) j--;
            }
        }
        return nums;
    }
}
