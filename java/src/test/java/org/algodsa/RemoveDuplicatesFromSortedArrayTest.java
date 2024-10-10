package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.RemoveDuplicatesFromSortedArray;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesFromSortedArrayTest {

    private final RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();

    @Test
    public void testRemoveDuplicates_AllUnique() {
        int[] nums = {1, 2, 3, 4, 5};
        int newLength = solution.removeDuplicates(nums);
        assertEquals(5, newLength, "All elements are unique, so array length should remain 5.");
        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, java.util.Arrays.copyOf(nums, newLength), "Array should remain unchanged.");
    }

    @Test
    public void testRemoveDuplicates_AllDuplicates() {
        int[] nums = {2, 2, 2, 2, 2};
        int newLength = solution.removeDuplicates(nums);
        assertEquals(1, newLength, "Only one unique element should remain.");
        assertArrayEquals(new int[] {2}, java.util.Arrays.copyOf(nums, newLength), "Array should contain only one '2'.");
    }

    @Test
    public void testRemoveDuplicates_SomeDuplicates() {
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        int newLength = solution.removeDuplicates(nums);
        assertEquals(5, newLength, "There are 5 unique elements in the array.");
        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, java.util.Arrays.copyOf(nums, newLength), "Array should only contain unique elements.");
    }

    @Test
    public void testRemoveDuplicates_SingleElement() {
        int[] nums = {7};
        int newLength = solution.removeDuplicates(nums);
        assertEquals(1, newLength, "Single element array should remain unchanged.");
        assertArrayEquals(new int[] {7}, java.util.Arrays.copyOf(nums, newLength), "Array should contain the single element.");
    }

    @Test
    public void testRemoveDuplicates_LongArray() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int newLength = solution.removeDuplicates(nums);
        assertEquals(5, newLength, "There are 5 unique elements in the array.");
        assertArrayEquals(new int[] {0, 1, 2, 3, 4}, java.util.Arrays.copyOf(nums, newLength), "Array should contain unique elements.");
    }
}
