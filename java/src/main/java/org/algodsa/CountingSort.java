package main.java.org.algodsa;

import java.util.Arrays;

/**
 * This class implements the Counting Sort algorithm for sorting an array of integers.
 */
public class CountingSort {

    /**
     * Default constructor.
     */
    public CountingSort() {}

    /**
     * Performs counting sort on the given array (unstable version).
     * <br><br>
     * Time Complexity: O(n + k), where n is the number of elements and k is the range of values.
     * Space Complexity: O(k), due to the extra count array.
     * <br><br>
     * @param A the array to be sorted (modified in place)
     */
    public void sortA(int[] A) {
        if (A.length == 0) return;

        int shift = Arrays.stream(A).min().getAsInt();
        int maxA = Arrays.stream(A).max().getAsInt() - shift;
        int[] counts = new int[maxA + 1];

        // Step 1: Count occurrences
        for (int num : A) {
            counts[num - shift]++;
        }

        // Step 2: Overwrite original array using counts
        int index = 0;
        for (int i = 0; i < counts.length; i++) {
            while (counts[i] > 0) {
                A[index++] = i + shift;
                counts[i]--;
            }
        }
    }

    /**
     * Performs counting sort on the given array using a stable approach.
     * <br><br>
     * Time Complexity: O(n + k), where n is the number of elements and k is the range of values.
     * Space Complexity: O(n + k), since an extra array of size n is used for stable sorting.
     * <br><br>
     * @param arr the array to be sorted (modified in place)
     */
    public void sort(int[] arr) {
        if (arr.length == 0) return;

        int shift = Arrays.stream(arr).min().getAsInt();
        int K = Arrays.stream(arr).max().getAsInt() - shift;
        int[] counts = new int[K + 1];

        // Step 1: Count occurrences
        for (int elem : arr) {
            counts[elem - shift]++;
        }

        // Step 2: Convert counts array to starting indices
        int startingIndex = 0;
        for (int i = 0; i <= K; i++) {
            int count = counts[i];
            counts[i] = startingIndex;
            startingIndex += count;
        }

        // Step 3: Place elements in sorted order using the counts array
        int[] sortedArray = new int[arr.length];
        for (int elem : arr) {
            sortedArray[counts[elem - shift]] = elem;
            counts[elem - shift]++;
        }

        // Step 4: Copy sorted array back to original array
        System.arraycopy(sortedArray, 0, arr, 0, arr.length);
    }
}
