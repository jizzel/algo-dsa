package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.FindNumbersWithEvenNumberOfDigits;
import org.junit.jupiter.api.Test;

public class FindNumbersWithEvenNumberOfDigitsTest {

    private final FindNumbersWithEvenNumberOfDigits solution = new FindNumbersWithEvenNumberOfDigits();

    @Test
    public void testFindNumbers_EvenDigitNumbers() {
        int[] nums = {12, 345, 2, 6, 7896};
        int result = solution.findNumbers(nums);
        assertEquals(2, result, "There should be 2 numbers with an even number of digits");
    }

    @Test
    public void testFindNumbers_AllEvenDigitNumbers() {
        int[] nums = {44, 88, 2000, 100000};
        int result = solution.findNumbers(nums);
        assertEquals(4, result, "All numbers have an even number of digits");
    }

    @Test
    public void testFindNumbers_AllOddDigitNumbers() {
        int[] nums = {1, 345, 12345, 7, 9};
        int result = solution.findNumbers(nums);
        assertEquals(0, result, "There should be no numbers with an even number of digits");
    }

    @Test
    public void testFindNumbers_MixedDigitNumbers() {
        int[] nums = {100, 1000, 1, 10, 10000};
        int result = solution.findNumbers(nums);
        assertEquals(2, result, "There should be 2 numbers with an even number of digits");
    }

    @Test
    public void testFindNumbers_SingleNumber() {
        int[] nums = {22};
        int result = solution.findNumbers(nums);
        assertEquals(1, result, "Single number with even digits should return 1");
    }

    @Test
    public void testFindNumbers_EmptyArray() {
        int[] nums = {};
        int result = solution.findNumbers(nums);
        assertEquals(0, result, "Empty array should return 0");
    }
}
