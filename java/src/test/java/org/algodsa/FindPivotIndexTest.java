package test.java.org.algodsa;

import main.java.org.algodsa.FindPivotIndex;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FindPivotIndexTest {

    FindPivotIndex pivotIndexFinder = new FindPivotIndex();

    @Test
    void testPivotInMiddle() {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int result = pivotIndexFinder.pivotIndex(nums);
        assertEquals(3, result); // Pivot at index 3
    }

    @Test
    void testPivotAtStart() {
        int[] nums = {2, 1, -1};
        int result = pivotIndexFinder.pivotIndex(nums);
        assertEquals(0, result); // Pivot at index 0
    }

    @Test
    void testNoPivot() {
        int[] nums = {1, 2, 3};
        int result = pivotIndexFinder.pivotIndex(nums);
        assertEquals(-1, result); // No pivot
    }

    @Test
    void testSingleElement() {
        int[] nums = {10};
        int result = pivotIndexFinder.pivotIndex(nums);
        assertEquals(0, result); // Single element is trivially the pivot
    }

    @Test
    void testAllZeros() {
        int[] nums = {0, 0, 0, 0, 0};
        int result = pivotIndexFinder.pivotIndex(nums);
        assertEquals(0, result); // Any index could technically work, but first one is expected
    }

    @Test
    void testNegativeNumbers() {
        int[] nums = {-1, -1, -1, 0, 1, 1};
        int result = pivotIndexFinder.pivotIndex(nums);
        assertEquals(0, result);
    }

    @Test
    void testLargeNumbers() {
        int[] nums = {1000, -999, 0, -999, 1000};
        int result = pivotIndexFinder.pivotIndex(nums);
        assertEquals(2, result); // Pivot at index 2
    }
}
