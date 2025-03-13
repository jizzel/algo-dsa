package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.CountingSort;
import org.junit.jupiter.api.Test;

public class CountingSortTest {

    @Test
    public void testSortedArray() {
        CountingSort sorter = new CountingSort();
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        sorter.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testUnsortedArray() {
        CountingSort sorter = new CountingSort();
        int[] arr = {5, 3, 1, 4, 2};
        int[] expected = {1, 2, 3, 4, 5};
        sorter.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testArrayWithDuplicates() {
        CountingSort sorter = new CountingSort();
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        int[] expected = {1, 2, 2, 3, 3, 4, 8};
        sorter.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testArrayWithNegatives() {
        CountingSort sorter = new CountingSort();
        int[] arr = {-5, -1, -3, -2, -4};
        int[] expected = {-5, -4, -3, -2, -1};
        sorter.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testArrayWithMixedNumbers() {
        CountingSort sorter = new CountingSort();
        int[] arr = {3, -2, 4, 1, -5, 0};
        int[] expected = {-5, -2, 0, 1, 3, 4};
        sorter.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSingleElementArray() {
        CountingSort sorter = new CountingSort();
        int[] arr = {7};
        int[] expected = {7};
        sorter.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testEmptyArray() {
        CountingSort sorter = new CountingSort();
        int[] arr = {};
        int[] expected = {};
        sorter.sortA(arr);
        assertArrayEquals(expected, arr);
    }
}
