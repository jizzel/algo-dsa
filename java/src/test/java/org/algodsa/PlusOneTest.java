package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.PlusOne;
import org.junit.jupiter.api.Test;

public class PlusOneTest {

    private final PlusOne solution = new PlusOne();

    @Test
    public void testPlusOne_SimpleIncrement() {
        int[] digits = {1, 2, 3};
        int[] expected = {1, 2, 4};
        assertArrayEquals(expected, solution.plusOne(digits), "Adding one to [1, 2, 3] should result in [1, 2, 4].");
    }

    @Test
    public void testPlusOne_WithCarry() {
        int[] digits = {1, 9, 9};
        int[] expected = {2, 0, 0};
        assertArrayEquals(expected, solution.plusOne(digits), "Adding one to [1, 9, 9] should result in [2, 0, 0].");
    }

    @Test
    public void testPlusOne_AllNines() {
        int[] digits = {9, 9, 9};
        int[] expected = {1, 0, 0, 0};
        assertArrayEquals(expected, solution.plusOne(digits), "Adding one to [9, 9, 9] should result in [1, 0, 0, 0].");
    }

    @Test
    public void testPlusOne_SingleDigit() {
        int[] digits = {5};
        int[] expected = {6};
        assertArrayEquals(expected, solution.plusOne(digits), "Adding one to [5] should result in [6].");
    }

    @Test
    public void testPlusOne_SingleNine() {
        int[] digits = {9};
        int[] expected = {1, 0};
        assertArrayEquals(expected, solution.plusOne(digits), "Adding one to [9] should result in [1, 0].");
    }

    @Test
    public void testPlusOne_LargeNumberWithCarry() {
        int[] digits = {2, 9, 9, 9};
        int[] expected = {3, 0, 0, 0};
        assertArrayEquals(expected, solution.plusOne(digits), "Adding one to [2, 9, 9, 9] should result in [3, 0, 0, 0].");
    }
}
