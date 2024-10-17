package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.HeightChecker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HeightCheckerTest {

    private HeightChecker solution;

    @BeforeEach
    public void setUp() {
        solution = new HeightChecker();
    }

    @Test
    public void testHeightChecker_AllInOrder() {
        int[] heights = {1, 2, 3, 4, 5};
        assertEquals(0, solution.heightChecker(heights)); // All heights are in correct order, no differences
    }

    @Test
    public void testHeightChecker_Shuffled() {
        int[] heights = {5, 1, 2, 3, 4};
        assertEquals(5, solution.heightChecker(heights)); // All elements are out of order, expect 5 differences
    }

    @Test
    public void testHeightChecker_OneChange() {
        int[] heights = {1, 2, 4, 3, 5};
        assertEquals(2, solution.heightChecker(heights)); // Elements 3 and 4 are swapped, expect 2 differences
    }

    @Test
    public void testHeightChecker_ContainsDuplicates() {
        int[] heights = {3, 1, 2, 2, 3};
        assertEquals(3, solution.heightChecker(heights)); // Only 1, 2, 2 are correctly placed, expect 3 differences
    }

    @Test
    public void testHeightChecker_AlreadySorted() {
        int[] heights = {1, 1, 1, 1};
        assertEquals(0, solution.heightChecker(heights)); // All elements are already sorted, expect 0 differences
    }

    @Test
    public void testHeightChecker_ReverseOrder() {
        int[] heights = {5, 4, 3, 2, 1};
        assertEquals(4, solution.heightChecker(heights)); // Fully reversed order, expect 4 differences
    }

    @Test
    public void testHeightChecker_SingleElement() {
        int[] heights = {7};
        assertEquals(0, solution.heightChecker(heights)); // Single element, no differences
    }

    @Test
    public void testHeightChecker_TwoElements() {
        int[] heights = {2, 1};
        assertEquals(2, solution.heightChecker(heights)); // Two elements, both are out of order, expect 2 differences
    }

    @Test
    public void testHeightChecker_EmptyArray() {
        int[] heights = {};
        assertEquals(0, solution.heightChecker(heights)); // Empty array, no differences
    }

    @Test
    public void testHeightChecker_SortedWithDuplicates() {
        int[] heights = {1, 1, 2, 2, 3, 3};
        assertEquals(0, solution.heightChecker(heights)); // Sorted with duplicates, expect 0 differences
    }
}
