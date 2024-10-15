package main.java.org.algodsa;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that provides a method to find all numbers that are missing from an array where
 * numbers range from 1 to n (inclusive) and the array contains n elements.
 */
public class FindAllNumbersDisappearedInAnArray {
    /**
     * Constructor
     */
    public FindAllNumbersDisappearedInAnArray(){}

    /**
     * <h4><a href="https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/">448. Find All Numbers Disappeared in an Array</a></h4>
     * <br>
     * Finds all the numbers that are missing from an array.
     * This method performs a cyclic sort to rearrange numbers in their correct positions,
     * and then identifies which indices have missing numbers based on the final sorted state.<br>
     * <br>
     * Time Complexity: O(n), where n is the length of the array. We traverse the array twice:
     * first to sort it in place, and then to collect the missing numbers.
     * <br>
     * Space Complexity: O(1) (ignoring the result list), as we are sorting the array in place.
     * The result list will take O(k) space, where k is the number of missing numbers.<br>
     * <br>
     * @param nums an array of integers where numbers range from 1 to n (inclusive)
     * @return a list of integers that are missing in the array
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

        // Cyclic sort: Put each number in its right place
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                // Swap to correct position
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }

        // After sorting, collect the missing numbers
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                result.add(j + 1);
            }
        }

        return result;
    }

    /**
     * alternative solution
     * @param nums array
     * @return list
     */
    public List<Integer> findDisappearedNumbers2(int[] nums) {
        List<Integer> result = new ArrayList<>();

        // Marking the numbers as visited by negating the element at index `nums[i] - 1`
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        // Collecting the indices with positive values, which correspond to missing numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;
    }
}

