package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.SquaresOfASortedArray;
import org.junit.jupiter.api.Test;

public class SquaresOfASortedArrayTest {

    private final SquaresOfASortedArray solution = new SquaresOfASortedArray();

    @Test
    public void testSortedSquares_PositiveNumbers() {
        int[] nums = {1, 2, 3, 4};
        int[] expected = {1, 4, 9, 16};
        int[] result = solution.sortedSquares(nums);
        assertArrayEquals(expected, result, "The squares of sorted positive numbers should be correctly sorted.");
    }

    @Test
    public void testSortedSquares_NegativeNumbers() {
        int[] nums = {-4, -3, -2, -1};
        int[] expected = {1, 4, 9, 16};
        int[] result = solution.sortedSquares(nums);
        assertArrayEquals(expected, result, "The squares of sorted negative numbers should be correctly sorted.");
    }

    @Test
    public void testSortedSquares_MixedNumbers() {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] expected = {0, 1, 9, 16, 100};
        int[] result = solution.sortedSquares(nums);
        assertArrayEquals(expected, result, "The squares of mixed positive and negative numbers should be correctly sorted.");
    }

    @Test
    public void testSortedSquares_SingleElement() {
        int[] nums = {3};
        int[] expected = {9};
        int[] result = solution.sortedSquares(nums);
        assertArrayEquals(expected, result, "The square of a single element should return correctly.");
    }

    @Test
    public void testSortedSquares_TwoElements() {
        int[] nums = {-2, 2};
        int[] expected = {4, 4};
        int[] result = solution.sortedSquares(nums);
        assertArrayEquals(expected, result, "The squares of two elements, one negative and one positive, should be correctly sorted.");
    }

    @Test
    public void testSortedSquares_AllZeros() {
        int[] nums = {0, 0, 0};
        int[] expected = {0, 0, 0};
        int[] result = solution.sortedSquares(nums);
        assertArrayEquals(expected, result, "The squares of all zeros should return an array of zeros.");
    }

    @Test
    public void testSortedSquares_LargeArray() {
        int[] nums = {-10000, -9999, 9999, 10000};
        int[] expected = {99980001, 99980001, 100000000, 100000000};
        int[] result = solution.sortedSquares(nums);
        assertArrayEquals(expected, result, "The squares of large negative and positive numbers should be correctly sorted.");
    }
}
