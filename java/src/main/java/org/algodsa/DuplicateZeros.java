package main.java.org.algodsa;

/**
 * Class to duplicate zeros in an array in-place, shifting the subsequent elements to the right.
 */
public class DuplicateZeros {
    /**
     * Constructor
     */
    public DuplicateZeros(){}

    /**
     * <h4><a href="https://leetcode.com/problems/duplicate-zeros/description/">089. Duplicate Zeros</a></h4>
     * <br>
     * Duplicates each occurrence of zero in the array, shifting subsequent elements to the right.
     * The modifications are made in-place and do not exceed the original array's length.<br>
     * <br>
     * Time Complexity: O(n), where n is the length of the array. Each element is processed at most twice.
     * <br>
     * Space Complexity: O(1). The algorithm modifies the array in-place, requiring no additional data structures.<br>
     * <br>
     * @param arr the input array where zeros are to be duplicated
     */
    public void duplicateZeros(int[] arr) {
        int possibleDups = 0;
        int n = arr.length - 1;

        // First pass: count possible duplicates of zeros
        for (int i = 0; i <= n - possibleDups; i++) {
            if (arr[i] == 0) {
                if (i == n - possibleDups) {
                    // Edge case: if we are at the last element
                    arr[n] = 0;
                    n--;
                    break;
                }
                possibleDups++; // Count the duplicate
            }
        }

        int left = n - possibleDups;

        // Second pass: fill the array from the end
        while (left >= 0) {
            arr[left + possibleDups] = arr[left];
            if (arr[left] == 0) {
                possibleDups--;
                arr[left + possibleDups] = 0; // Duplicate the zero
            }
            left--;
        }
    }
}

