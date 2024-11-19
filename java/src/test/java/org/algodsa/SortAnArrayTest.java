package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.SortAnArray;
import org.junit.jupiter.api.Test;

public class SortAnArrayTest {

    @Test
    public void testEmptyArray() {
        SortAnArray sorter = new SortAnArray();
        int[] nums = {};
        int[] sorted = sorter.sortArray(nums);
        assertArrayEquals(nums, sorted, "An empty array should remain unchanged.");
    }

    @Test
    public void testSingleElementArray() {
        SortAnArray sorter = new SortAnArray();
        int[] nums = {5};
        int[] sorted = sorter.sortArray(nums);
        assertArrayEquals(nums, sorted, "A single-element array should remain unchanged.");
    }

    @Test
    public void testAlreadySortedArray() {
        SortAnArray sorter = new SortAnArray();
        int[] nums = {1, 2, 3, 4, 5};
        int[] sorted = sorter.sortArray(nums);
        assertArrayEquals(nums, sorted, "An already sorted array should remain unchanged.");
    }

    @Test
    public void testReverseSortedArray() {
        SortAnArray sorter = new SortAnArray();
        int[] nums = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        int[] sorted = sorter.sortArray(nums);
        assertArrayEquals(expected, sorted, "A reverse-sorted array should be correctly sorted.");
    }

    @Test
    public void testUnsortedArrayWithDuplicates() {
        SortAnArray sorter = new SortAnArray();
        int[] nums = {3, 1, 2, 3, 4, 2};
        int[] expected = {1, 2, 2, 3, 3, 4};
        int[] sorted = sorter.sortArray(nums);
        assertArrayEquals(expected, sorted, "An unsorted array with duplicates should be correctly sorted.");
    }

    @Test
    public void testLargeArray() {
        SortAnArray sorter = new SortAnArray();
        int[] nums = {10, -1, 2, 5, 3, 0, -7, 8, 6};
        int[] expected = {-7, -1, 0, 2, 3, 5, 6, 8, 10};
        int[] sorted = sorter.sortArray(nums);
        assertArrayEquals(expected, sorted, "A large unsorted array should be correctly sorted.");
    }

    @Test
    public void testArrayWithNegativeNumbers() {
        SortAnArray sorter = new SortAnArray();
        int[] nums = {-3, -1, -4, 2, 0};
        int[] expected = {-4, -3, -1, 0, 2};
        int[] sorted = sorter.sortArray(nums);
        assertArrayEquals(expected, sorted, "An array with negative numbers should be correctly sorted.");
    }

    @Test
    public void testArrayWithAllEqualNumbers() {
        SortAnArray sorter = new SortAnArray();
        int[] nums = {5, 5, 5, 5, 5};
        int[] sorted = sorter.sortArray(nums);
        assertArrayEquals(nums, sorted, "An array with all equal numbers should remain unchanged.");
    }
}
