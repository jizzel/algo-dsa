package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.CalculateDigitSumOfAString;
import org.junit.jupiter.api.Test;

public class CalculateDigitSumOfAStringTest {

    private final CalculateDigitSumOfAString calculator = new CalculateDigitSumOfAString();

    @Test
    public void testDigitSum_Example1() {
        // Test case 1: Example input
        String s = "1111122222";  // Groups of 3 -> sum "333344" -> sum "77"
        int k = 3;
        String expected = "132";
        String result = calculator.digitSum(s, k);
        assertEquals(expected, result, "For input '1111122222' with k=3, the digit sum should be '77'");
    }

    @Test
    public void testDigitSum_AlreadySmallEnough() {
        // Test case 2: Input already small enough
        String s = "123";  // Already length <= k, so no change
        int k = 3;
        String expected = "123";
        String result = calculator.digitSum(s, k);
        assertEquals(expected, result, "For input '123' with k=3, the result should be '123'");
    }

    @Test
    public void testDigitSum_SingleCharacter() {
        // Test case 3: Single character input
        String s = "5";  // Single digit, no grouping necessary
        int k = 2;
        String expected = "5";
        String result = calculator.digitSum(s, k);
        assertEquals(expected, result, "For input '5' with k=2, the result should be '5'");
    }

    @Test
    public void testDigitSum_MultipleIterations() {
        // Test case 4: Multiple iterations of grouping
        String s = "987654321";  // First sum: "24" -> sum "6"
        int k = 2;
        String expected = "36";
        String result = calculator.digitSum(s, k);
        assertEquals(expected, result, "For input '987654321' with k=2, the digit sum should be '36'");
    }

    @Test
    public void testDigitSum_LargeInput() {
        // Test case 5: Large input with multiple rounds of digit sum calculation
        String s = "12345678987654321";  // The sum will repeat several times
        int k = 4;
        String expected = "981";  // Example expected result, based on the actual summation process
        String result = calculator.digitSum(s, k);
        assertEquals(expected, result, "For input '12345678987654321' with k=4, the digit sum should be '981'");
    }

    @Test
    public void testDigitSum_SmallK() {
        // Test case 6: Very small k, should group all characters
        String s = "123456";
        int k = 2;
        String expected = "12";  // Summing digits individually
        String result = calculator.digitSum(s, k);
        assertEquals(expected, result, "For input '123456' with k=2, the digit sum should be '12'");
    }
}