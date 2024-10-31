package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.SearchInRotatedSortedArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SearchInRotatedSortedArrayTest {

    private SearchInRotatedSortedArray solution;

    @BeforeEach
    public void setUp() {
        solution = new SearchInRotatedSortedArray();
    }

    @Test
    public void testTargetExists() {
        assertEquals(4, solution.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 0));
        assertEquals(1, solution.search(new int[] {5, 1, 3}, 1));
    }

    @Test
    public void testTargetAtBounds() {
        assertEquals(0, solution.search(new int[] {6, 7, 1, 2, 3, 4, 5}, 6));
        assertEquals(6, solution.search(new int[] {6, 7, 1, 2, 3, 4, 5}, 5));
    }

    @Test
    public void testTargetNotInArray() {
        assertEquals(-1, solution.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 3));
        assertEquals(-1, solution.search(new int[] {1, 2, 3, 4, 5}, 0));
    }

    @Test
    public void testSingleElement() {
        assertEquals(0, solution.search(new int[] {1}, 1));
        assertEquals(-1, solution.search(new int[] {1}, 2));
    }

    @Test
    public void testEmptyArray() {
        assertEquals(-1, solution.search(new int[] {}, 5));
    }
}
