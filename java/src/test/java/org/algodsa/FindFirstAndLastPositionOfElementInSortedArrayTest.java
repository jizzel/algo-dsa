package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.FindFirstAndLastPositionOfElementInSortedArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FindFirstAndLastPositionOfElementInSortedArrayTest {

    private FindFirstAndLastPositionOfElementInSortedArray solution;

    @BeforeEach
    public void setUp() {
        solution = new FindFirstAndLastPositionOfElementInSortedArray();
    }

    @Test
    public void testTargetExistsOnce() {
        assertArrayEquals(new int[] {3, 3}, solution.searchRange(new int[] {1, 2, 3, 4, 5}, 4));
    }

    @Test
    public void testTargetExistsMultipleTimes() {
        assertArrayEquals(new int[] {1, 3}, solution.searchRange(new int[] {5, 7, 7, 7, 8, 10}, 7));
        assertArrayEquals(new int[] {0, 4}, solution.searchRange(new int[] {2, 2, 2, 2, 2, 3, 4}, 2));
    }

    @Test
    public void testTargetAtArrayEdges() {
        assertArrayEquals(new int[] {0, 0}, solution.searchRange(new int[] {5, 6, 7, 8, 9}, 5));
        assertArrayEquals(new int[] {4, 4}, solution.searchRange(new int[] {1, 2, 3, 4, 5}, 5));
    }

    @Test
    public void testTargetNotInArray() {
        assertArrayEquals(new int[] {-1, -1}, solution.searchRange(new int[] {1, 2, 3, 4, 6, 7, 8}, 5));
    }

    @Test
    public void testEmptyArray() {
        assertArrayEquals(new int[] {-1, -1}, solution.searchRange(new int[] {}, 5));
    }
}
