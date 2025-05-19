package test.java.org.algodsa;

import main.java.org.algodsa.ContainsDuplicateII;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContainsDuplicateIITest {

    ContainsDuplicateII solution = new ContainsDuplicateII();

    @Test
    void testWithNearbyDuplicateWithinK() {
        int[] nums = {1, 2, 3, 1};
        assertTrue(solution.containsNearbyDuplicate(nums, 3));
        assertTrue(solution.containsNearbyDuplicateII(nums, 3));
    }

    @Test
    void testWithNoNearbyDuplicateBeyondK() {
        int[] nums = {1, 0, 1, 1};
        assertTrue(solution.containsNearbyDuplicate(nums, 1));
        assertTrue(solution.containsNearbyDuplicateII(nums, 1));
    }

    @Test
    void testWithNoDuplicates() {
        int[] nums = {1, 2, 3, 4, 5};
        assertFalse(solution.containsNearbyDuplicate(nums, 3));
        assertFalse(solution.containsNearbyDuplicateII(nums, 3));
    }

    @Test
    void testEdgeCaseKZero() {
        int[] nums = {1, 2, 3, 1};
        assertFalse(solution.containsNearbyDuplicate(nums, 0));
        assertFalse(solution.containsNearbyDuplicateII(nums, 0));
    }

    @Test
    void testAdjacentDuplicates() {
        int[] nums = {1, 1};
        assertTrue(solution.containsNearbyDuplicate(nums, 1));
        assertTrue(solution.containsNearbyDuplicateII(nums, 1));
    }

    @Test
    void testEmptyArray() {
        int[] nums = {};
        assertFalse(solution.containsNearbyDuplicate(nums, 1));
        assertFalse(solution.containsNearbyDuplicateII(nums, 1));
    }

    @Test
    void testSingleElementArray() {
        int[] nums = {5};
        assertFalse(solution.containsNearbyDuplicate(nums, 2));
        assertFalse(solution.containsNearbyDuplicateII(nums, 2));
    }

    @Test
    void testDuplicateExactlyAtKDistance() {
        int[] nums = {1, 2, 3, 1};
        assertTrue(solution.containsNearbyDuplicate(nums, 3));
        assertTrue(solution.containsNearbyDuplicateII(nums, 3));
    }

    @Test
    void testDuplicateJustOutsideKDistance() {
        int[] nums = {1, 2, 3, 4, 1};
        assertFalse(solution.containsNearbyDuplicate(nums, 3));
        assertFalse(solution.containsNearbyDuplicateII(nums, 3));
    }
}
