package test.java.org.algodsa;

import main.java.org.algodsa.TwoSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    TwoSum solution = new TwoSum();

    @Test
    public void testTwoSum() {
        // Test case 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solution.twoSum(nums1, target1);
        assertNotNull(result1, "The result should not be null");
        assertArrayEquals(new int[]{0, 1}, result1, "Indices should match the two numbers that sum up to the target");

        // Test case 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = solution.twoSum(nums2, target2);
        assertNotNull(result2, "The result should not be null");
        assertArrayEquals(new int[]{1, 2}, result2, "Indices should match the two numbers that sum up to the target");

        // Test case 3
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = solution.twoSum(nums3, target3);
        assertNotNull(result3, "The result should not be null");
        assertArrayEquals(new int[]{0, 1}, result3, "Indices should match the two numbers that sum up to the target");
    }

}