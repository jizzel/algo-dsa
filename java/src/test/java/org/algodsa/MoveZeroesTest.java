package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.MoveZeroes;
import org.junit.jupiter.api.Test;

public class MoveZeroesTest {

    private final MoveZeroes solution = new MoveZeroes();

    @Test
    public void testMoveZeroes_BasicCase() {
        int[] nums = {0, 1, 0, 3, 12};
        int[] expected = {1, 3, 12, 0, 0};
        solution.moveZeroes(nums);
        assertArrayEquals(expected, nums, "The zeroes should be moved to the end of the array.");
    }

    @Test
    public void testMoveZeroes_AllZeroes() {
        int[] nums = {0, 0, 0, 0};
        int[] expected = {0, 0, 0, 0};
        solution.moveZeroes(nums);
        assertArrayEquals(expected, nums, "The array with all zeroes should remain unchanged.");
    }

    @Test
    public void testMoveZeroes_NoZeroes() {
        int[] nums = {1, 2, 3, 4};
        int[] expected = {1, 2, 3, 4};
        solution.moveZeroes(nums);
        assertArrayEquals(expected, nums, "The array with no zeroes should remain unchanged.");
    }

    @Test
    public void testMoveZeroes_LeadingZeroes() {
        int[] nums = {0, 0, 1, 2, 3};
        int[] expected = {1, 2, 3, 0, 0};
        solution.moveZeroes(nums);
        assertArrayEquals(expected, nums, "Leading zeroes should be moved to the end.");
    }

    @Test
    public void testMoveZeroes_TrailingZeroes() {
        int[] nums = {1, 2, 3, 0, 0};
        int[] expected = {1, 2, 3, 0, 0};
        solution.moveZeroes(nums);
        assertArrayEquals(expected, nums, "Trailing zeroes should remain at the end.");
    }

    @Test
    public void testMoveZeroes_MixedCase() {
        int[] nums = {0, 1, 0, 3, 12, 0, 5};
        int[] expected = {1, 3, 12, 5, 0, 0, 0};
        solution.moveZeroes(nums);
        assertArrayEquals(expected, nums, "Zeroes in a mixed array should be moved to the end.");
    }
}
