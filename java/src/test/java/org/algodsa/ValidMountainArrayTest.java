package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.ValidMountainArray;
import org.junit.jupiter.api.Test;

public class ValidMountainArrayTest {

    private final ValidMountainArray solution = new ValidMountainArray();

    @Test
    public void testValidMountainArray_ValidMountain() {
        int[] arr = {0, 3, 2, 1};
        assertTrue(solution.validMountainArray(arr), "Array should be a valid mountain array.");
    }

    @Test
    public void testValidMountainArray_TooShort() {
        int[] arr = {2, 1};
        assertFalse(solution.validMountainArray(arr), "Array with fewer than 3 elements cannot be a valid mountain array.");
    }

    @Test
    public void testValidMountainArray_NoDescendingPart() {
        int[] arr = {0, 2, 3, 4};
        assertFalse(solution.validMountainArray(arr), "Array without a descending part after peak should not be a valid mountain array.");
    }

    @Test
    public void testValidMountainArray_NoAscendingPart() {
        int[] arr = {4, 3, 2, 1};
        assertFalse(solution.validMountainArray(arr), "Array with only a descending part should not be a valid mountain array.");
    }

    @Test
    public void testValidMountainArray_PeakAtStart() {
        int[] arr = {5, 4, 3, 2};
        assertFalse(solution.validMountainArray(arr), "Array with peak at the start should not be a valid mountain array.");
    }

    @Test
    public void testValidMountainArray_PeakAtEnd() {
        int[] arr = {2, 3, 4, 5};
        assertFalse(solution.validMountainArray(arr), "Array with peak at the end should not be a valid mountain array.");
    }

    @Test
    public void testValidMountainArray_ValidLongMountain() {
        int[] arr = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        assertTrue(solution.validMountainArray(arr), "Array should be a valid mountain array with a long sequence.");
    }

    @Test
    public void testValidMountainArray_FlatPeak() {
        int[] arr = {1, 3, 3, 2};
        assertFalse(solution.validMountainArray(arr), "Array with a flat peak should not be a valid mountain array.");
    }
}
