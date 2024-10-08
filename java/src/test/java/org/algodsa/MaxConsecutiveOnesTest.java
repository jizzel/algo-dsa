package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.MaxConsecutiveOnes;
import org.junit.jupiter.api.Test;

public class MaxConsecutiveOnesTest {

    private final MaxConsecutiveOnes solution = new MaxConsecutiveOnes();

    @Test
    public void testFindMaxConsecutiveOnes_AllOnes() {
        int[] nums = {1, 1, 1, 1};
        int result = solution.findMaxConsecutiveOnes(nums);
        assertEquals(4, result, "All ones should return 4");
    }

    @Test
    public void testFindMaxConsecutiveOnes_MixedOnesAndZeros() {
        int[] nums = {1, 0, 1, 1, 0, 1};
        int result = solution.findMaxConsecutiveOnes(nums);
        assertEquals(2, result, "Maximum consecutive ones should be 2");
    }

    @Test
    public void testFindMaxConsecutiveOnes_OnlyZeros() {
        int[] nums = {0, 0, 0, 0};
        int result = solution.findMaxConsecutiveOnes(nums);
        assertEquals(0, result, "Only zeros should return 0");
    }

    @Test
    public void testFindMaxConsecutiveOnes_SingleOne() {
        int[] nums = {1};
        int result = solution.findMaxConsecutiveOnes(nums);
        assertEquals(1, result, "Single one should return 1");
    }

    @Test
    public void testFindMaxConsecutiveOnes_SingleZero() {
        int[] nums = {0};
        int result = solution.findMaxConsecutiveOnes(nums);
        assertEquals(0, result, "Single zero should return 0");
    }

    @Test
    public void testFindMaxConsecutiveOnes_EmptyArray() {
        int[] nums = {};
        int result = solution.findMaxConsecutiveOnes(nums);
        assertEquals(0, result, "Empty array should return 0");
    }

    @Test
    public void testFindMaxConsecutiveOnes_LongConsecutiveOnes() {
        int[] nums = {0, 1, 1, 1, 1, 0, 1, 1};
        int result = solution.findMaxConsecutiveOnes(nums);
        assertEquals(4, result, "Maximum consecutive ones should be 4");
    }
}
