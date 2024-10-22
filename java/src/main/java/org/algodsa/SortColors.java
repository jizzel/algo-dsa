package main.java.org.algodsa;

/**
 * Class that provides a method to sort an array of colors represented by 0s, 1s, and 2s.
 * The sorting is done in-place using a variant of the Dutch National Flag algorithm.
 */
public class SortColors {
    /**
     * Constructor
     */
    public SortColors(){}

    /**
     * <h4><a href="https://leetcode.com/problems/sort-colors/description/">75. Sort Colors</a></h4>
     * <br>
     * Sorts an array consisting of 0s, 1s, and 2s in-place so that all 0s come first,
     * followed by all 1s, then all 2s.
     * <br>
     * Time Complexity: O(n), where n is the length of the input array. Each element is processed at most twice.<br>
     * Space Complexity: O(1), since the sorting is done in-place with constant extra memory.<br>
     * <br>
     * @param nums the input array of integers representing colors (0s, 1s, and 2s)
     */
    public void sortColors(int[] nums) {
        int a = 0, b = 0, c = nums.length - 1;

        while (b <= c) {
            if (nums[b] == 0) {
                swap(nums, a, b);
                a++;
                b++;
            } else if (nums[b] == 1) {
                b++;
            } else {
                swap(nums, b, c);
                c--;
            }
        }
    }

    /**
     * Swaps two elements in the array.
     * <br>
     * @param arr the array in which elements will be swapped
     * @param i the index of the first element
     * @param j the index of the second element
     */
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}