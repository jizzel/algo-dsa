package main.java.org.algodsa;

import java.util.Arrays;

/**
 * This class provides a method to sort an array using the Merge Sort algorithm.
 */
public class SortAnArray {

    /**
     * Constructor
     */
    public SortAnArray() {}

    /**
     * <h4><a href="https://leetcode.com/problems/sort-an-array/">912. Sort an Array</a></h4>
     * <br>
     * Sorts an array of integers using the Merge Sort algorithm.
     * <br>
     * Time complexity: O(n log n)
     * Space complexity: O(n)
     * <br>
     * The time complexity is O(n log n) due to the recursive division of the array
     * and the merging of the subarrays. The space complexity is O(n) because of the
     * additional arrays created during the merge process.
     * <br>
     * @param nums the array of integers to be sorted.
     * @return the sorted array of integers.
     */
    public int[] sortArray(int[] nums) {
        if (nums.length < 2) return nums;

        int pivot = nums.length / 2;
        int[] left = sortArray(Arrays.copyOfRange(nums, 0, pivot));
        int[] right = sortArray(Arrays.copyOfRange(nums, pivot, nums.length));
        return merge(left, right);
    }

    /**
     * Merges two sorted arrays into a single sorted array.
     *
     * @param left the first sorted array.
     * @param right the second sorted array.
     * @return the merged sorted array.
     */
    private int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int leftCursor = 0, rightCursor = 0, mergedCursor = 0;

        while (leftCursor < left.length && rightCursor < right.length) {
            if (left[leftCursor] < right[rightCursor])
                merged[mergedCursor++] = left[leftCursor++];
            else
                merged[mergedCursor++] = right[rightCursor++];
        }

        while (leftCursor < left.length)
            merged[mergedCursor++] = left[leftCursor++];

        while (rightCursor < right.length)
            merged[mergedCursor++] = right[rightCursor++];

        return merged;
    }
}
