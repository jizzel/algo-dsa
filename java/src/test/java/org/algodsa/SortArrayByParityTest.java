package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.SortArrayByParity;
import org.junit.jupiter.api.Test;

public class SortArrayByParityTest {

    private final SortArrayByParity solution = new SortArrayByParity();

    @Test
    public void testSortArrayByParity_BasicCase() {
        int[] nums = {3, 1, 2, 4};
        int[] expected = {4, 2, 1, 3}; // Any valid permutation where even numbers come first
        int[] result = solution.sortArrayByParity(nums);
        assertTrue(isEvenBeforeOdd(result), "Even numbers should appear before odd numbers.");
    }

    @Test
    public void testSortArrayByParity_AllEven() {
        int[] nums = {2, 4, 6, 8};
        int[] expected = {2, 4, 6, 8};
        int[] result = solution.sortArrayByParity(nums);
        assertArrayEquals(expected, result, "The array with all even numbers should remain unchanged.");
    }

    @Test
    public void testSortArrayByParity_AllOdd() {
        int[] nums = {1, 3, 5, 7};
        int[] expected = {1, 3, 5, 7};
        int[] result = solution.sortArrayByParity(nums);
        assertArrayEquals(expected, result, "The array with all odd numbers should remain unchanged.");
    }

    @Test
    public void testSortArrayByParity_MixedWithSingleElement() {
        int[] nums = {1};
        int[] expected = {1};
        int[] result = solution.sortArrayByParity(nums);
        assertArrayEquals(expected, result, "A single-element array should remain unchanged.");
    }

    @Test
    public void testSortArrayByParity_MixedWithZero() {
        int[] nums = {0, 1, 2, 3};
        int[] expected = {0, 2, 1, 3}; // Valid permutation with even numbers first
        int[] result = solution.sortArrayByParity(nums);
        assertTrue(isEvenBeforeOdd(result), "Zero is an even number and should appear before odd numbers.");
    }

    // Helper method to check if all even numbers appear before odd numbers
    private boolean isEvenBeforeOdd(int[] nums) {
        boolean foundOdd = false;
        for (int num : nums) {
            if (num % 2 != 0) foundOdd = true;
            if (foundOdd && num % 2 == 0) return false; // Even number appears after odd number
        }
        return true;
    }
}
