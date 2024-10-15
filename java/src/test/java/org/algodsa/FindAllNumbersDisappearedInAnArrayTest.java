package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.FindAllNumbersDisappearedInAnArray;
import org.junit.jupiter.api.Test;
import java.util.*;

public class FindAllNumbersDisappearedInAnArrayTest {
    private final FindAllNumbersDisappearedInAnArray solution = new FindAllNumbersDisappearedInAnArray();

    @Test
    public void testFindDisappearedNumbers_NoMissingNumbers() {
        int[] nums = {1, 2, 3, 4, 5};
        List<Integer> result = solution.findDisappearedNumbers(nums);
        assertTrue(result.isEmpty());  // No missing numbers
    }

    @Test
    public void testFindDisappearedNumbers_OneMissingNumber() {
        int[] nums = {1, 2, 4, 4};
        List<Integer> result = solution.findDisappearedNumbers(nums);
        List<Integer> expected = Collections.singletonList(3);
        assertEquals(expected, result);  // Missing number is 3
    }

    @Test
    public void testFindDisappearedNumbers_MultipleMissingNumbers() {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> result = solution.findDisappearedNumbers(nums);
        List<Integer> expected = Arrays.asList(5, 6);  // Missing numbers are 5 and 6
        assertEquals(expected, result);
    }

    @Test
    public void testFindDisappearedNumbers_AllMissingNumbers() {
        int[] nums = {7, 7, 7, 7, 7, 7, 7};
        List<Integer> result = solution.findDisappearedNumbers(nums);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6);
        assertEquals(expected, result);  // All numbers from 1 to 6 are missing
    }

    @Test
    public void testFindDisappearedNumbers_EmptyArray() {
        int[] nums = {};
        List<Integer> result = solution.findDisappearedNumbers(nums);
        assertTrue(result.isEmpty());  // Empty array should return an empty list
    }

    @Test
    public void testFindDisappearedNumbers_SingleElementArray() {
        int[] nums = {1};
        List<Integer> result = solution.findDisappearedNumbers(nums);
        assertTrue(result.isEmpty());  // No missing number in a single element array
    }

    @Test
    public void testFindDisappearedNumbers_DuplicatesPresent() {
        int[] nums = {2, 2, 3, 3, 5, 5, 7, 7};
        List<Integer> result = solution.findDisappearedNumbers(nums);
        List<Integer> expected = Arrays.asList(1, 4, 6, 8);  // Missing numbers are 1, 4, 6, 8
        assertEquals(expected, result);
    }
}
