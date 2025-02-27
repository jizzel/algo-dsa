package main.java.org.algodsa;

/**
 * This class provides an implementation of the Insertion Sort algorithm.
 */
public class InsertionSort {

    /**
     * Default constructor.
     */
    public InsertionSort() {}

    /**
     * Sorts an array in ascending order using the Insertion Sort algorithm.
     * <br><br>
     * Time Complexity:
     * - Best Case (Already Sorted): O(n)
     * - Worst Case (Reversed Order): O(n^2)
     * - Average Case: O(n^2)
     * <br>
     * Space Complexity: O(1), since sorting is done in place.
     * <br>
     * @param arr the array to be sorted
     */
    public void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int currentIndex = i;
            while (currentIndex > 0 && arr[currentIndex - 1] > arr[currentIndex]) {
                // Swap elements
                int temp = arr[currentIndex];
                arr[currentIndex] = arr[currentIndex - 1];
                arr[currentIndex - 1] = temp;
                currentIndex--;
            }
        }
    }
}
