package test.java.org.algodsa;

import main.java.org.algodsa.Miscellaneous;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiscellaneousTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void runningSum() {
    }

    @Test
    void isBalanced() {
    }

    @Test
    void checkHeight() {
    }

    @Test
    void isSymmetric() {
    }

    @Test
    void preorder() {
    }

    @Test
    void preorderReverse() {
    }

    @Test
    void testSearch() {

        // Test case 1: Target is in the array
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target1 = 5;
        assertEquals(4, Miscellaneous.searchBinary(nums1, target1), "Target 5 should be found at index 4");

        // Test case 2: Target is not in the array
        int[] nums2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target2 = 10;
        assertEquals(-1, Miscellaneous.searchBinary(nums2, target2), "Target 10 should not be found, return -1");

        // Test case 3: Edge case - empty array
        int[] nums3 = {};
        int target3 = 5;
        assertEquals(-1, Miscellaneous.searchBinary(nums3, target3), "Search in empty array should return -1");

        // Test case 4: Edge case - single element array, target found
        int[] nums4 = {5};
        int target4 = 5;
        assertEquals(0, Miscellaneous.searchBinary(nums4, target4), "Target 5 should be found at index 0");

        // Test case 5: Edge case - single element array, target not found
        int[] nums5 = {1};
        int target5 = 5;
        assertEquals(-1, Miscellaneous.searchBinary(nums5, target5), "Target 5 should not be found in single element array, return -1");
    }
}