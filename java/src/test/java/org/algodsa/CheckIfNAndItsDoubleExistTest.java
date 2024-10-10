package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.CheckIfNAndItsDoubleExist;
import org.junit.jupiter.api.Test;

public class CheckIfNAndItsDoubleExistTest {

    private final CheckIfNAndItsDoubleExist solution = new CheckIfNAndItsDoubleExist();

    @Test
    public void testCheckIfExist_FoundDouble() {
        int[] arr = {10, 2, 5, 3};
        assertTrue(solution.checkIfExist(arr), "There should be a pair where one element is double the other (5 and 10).");
    }

    @Test
    public void testCheckIfExist_FoundHalf() {
        int[] arr = {7, 1, 14, 11};
        assertTrue(solution.checkIfExist(arr), "There should be a pair where one element is half the other (7 and 14).");
    }

    @Test
    public void testCheckIfExist_NoDoubleOrHalf() {
        int[] arr = {3, 1, 7, 11};
        assertFalse(solution.checkIfExist(arr), "There should be no pair where one element is double or half the other.");
    }

    @Test
    public void testCheckIfExist_AllZeros() {
        int[] arr = {0, 0};
        assertTrue(solution.checkIfExist(arr), "Two zeros should count as one being double the other.");
    }

    @Test
    public void testCheckIfExist_EmptyArray() {
        int[] arr = {};
        assertFalse(solution.checkIfExist(arr), "An empty array should return false.");
    }

    @Test
    public void testCheckIfExist_SingleElement() {
        int[] arr = {10};
        assertFalse(solution.checkIfExist(arr), "A single element array should return false.");
    }

    @Test
    public void testCheckIfExist_LargeArray() {
        int[] arr = {20, 4, 8, 10, 40, 2, 16};
        assertTrue(solution.checkIfExist(arr), "There should be multiple pairs where one element is double the other.");
    }
}
