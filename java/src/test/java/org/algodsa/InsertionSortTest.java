package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.InsertionSort;
import org.junit.jupiter.api.Test;

public class InsertionSortTest {

    @Test
    public void testSortedArray() {
        InsertionSort sorter = new InsertionSort();
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        sorter.insertionSort(arr);
        assertArrayEquals(expected, arr, "Already sorted array should remain unchanged");
    }

    @Test
    public void testReverseSortedArray() {
        InsertionSort sorter = new InsertionSort();
        int[] arr = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        sorter.insertionSort(arr);
        assertArrayEquals(expected, arr, "Reversed array should be sorted");
    }

    @Test
    public void testUnsortedArray() {
        InsertionSort sorter = new InsertionSort();
        int[] arr = {8, 4, 2, 9, 1};
        int[] expected = {1, 2, 4, 8, 9};
        sorter.insertionSort(arr);
        assertArrayEquals(expected, arr, "Unsorted array should be correctly sorted");
    }

    @Test
    public void testArrayWithDuplicates() {
        InsertionSort sorter = new InsertionSort();
        int[] arr = {4, 2, 4, 1, 3, 2};
        int[] expected = {1, 2, 2, 3, 4, 4};
        sorter.insertionSort(arr);
        assertArrayEquals(expected, arr, "Array with duplicates should be sorted correctly");
    }

    @Test
    public void testSingleElementArray() {
        InsertionSort sorter = new InsertionSort();
        int[] arr = {7};
        int[] expected = {7};
        sorter.insertionSort(arr);
        assertArrayEquals(expected, arr, "Single-element array should remain unchanged");
    }

    @Test
    public void testEmptyArray() {
        InsertionSort sorter = new InsertionSort();
        int[] arr = {};
        int[] expected = {};
        sorter.insertionSort(arr);
        assertArrayEquals(expected, arr, "Empty array should remain unchanged");
    }

    @Test
    public void testLargeNumbers() {
        InsertionSort sorter = new InsertionSort();
        int[] arr = {1000000, -1000000, 500, 0, 999999};
        int[] expected = {-1000000, 0, 500, 999999, 1000000};
        sorter.insertionSort(arr);
        assertArrayEquals(expected, arr, "Array with large numbers should be sorted correctly");
    }
}
