package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.RemoveElement;
import org.junit.jupiter.api.Test;

public class RemoveElementTest {

    private final RemoveElement solution = new RemoveElement();

    @Test
    public void testRemoveElement_ValPresentMultipleTimes() {
        int[] nums = {3, 2, 2, 3};
        int newLength = solution.removeElement(nums, 3);
        assertEquals(2, newLength, "Array should have 2 elements after removal.");
        assertArrayEquals(new int[] {2, 2}, java.util.Arrays.copyOf(nums, newLength), "Array should contain only non-3 elements.");
    }

    @Test
    public void testRemoveElement_ValNotPresent() {
        int[] nums = {1, 2, 3, 4};
        int newLength = solution.removeElement(nums, 5);
        assertEquals(4, newLength, "Array length should remain the same if value is not present.");
        assertArrayEquals(new int[] {1, 2, 3, 4}, java.util.Arrays.copyOf(nums, newLength), "Array should remain unchanged.");
    }

    @Test
    public void testRemoveElement_EmptyArray() {
        int[] nums = {};
        int newLength = solution.removeElement(nums, 1);
        assertEquals(0, newLength, "Empty array should remain empty.");
    }

    @Test
    public void testRemoveElement_AllElementsMatch() {
        int[] nums = {7, 7, 7};
        int newLength = solution.removeElement(nums, 7);
        assertEquals(0, newLength, "Array should be empty after removing all elements.");
    }

    @Test
    public void testRemoveElement_NoElementsMatch() {
        int[] nums = {1, 2, 3};
        int newLength = solution.removeElement(nums, 4);
        assertEquals(3, newLength, "Array should remain the same length if no elements match.");
        assertArrayEquals(new int[] {1, 2, 3}, java.util.Arrays.copyOf(nums, newLength), "Array should remain unchanged.");
    }

    @Test
    public void testRemoveElement_SingleElement() {
        int[] nums = {1};
        int newLength = solution.removeElement(nums, 1);
        assertEquals(0, newLength, "Array should be empty after removing the single element.");
    }

    @Test
    public void testRemoveElement_MixedElements() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int newLength = solution.removeElement(nums, 2);
        assertEquals(5, newLength, "Array should have 5 elements after removal.");
        assertArrayEquals(new int[] {0, 1, 3, 0, 4}, java.util.Arrays.copyOf(nums, newLength), "Array should contain non-2 elements.");
    }
}
