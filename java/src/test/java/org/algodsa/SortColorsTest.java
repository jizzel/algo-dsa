package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.SortColors;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SortColorsTest {

    private SortColors solution;

    @BeforeEach
    public void setUp() {
        solution = new SortColors();
    }

    @Test
    public void testSortColors_MixedColors() {
        int[] nums = {2, 0, 2, 1, 1, 0};
        solution.sortColors(nums);
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, nums);
    }

    @Test
    public void testSortColors_AllZeros() {
        int[] nums = {0, 0, 0, 0};
        solution.sortColors(nums);
        assertArrayEquals(new int[]{0, 0, 0, 0}, nums); // Already sorted with all zeros
    }

    @Test
    public void testSortColors_AllOnes() {
        int[] nums = {1, 1, 1, 1};
        solution.sortColors(nums);
        assertArrayEquals(new int[]{1, 1, 1, 1}, nums); // Already sorted with all ones
    }

    @Test
    public void testSortColors_AllTwos() {
        int[] nums = {2, 2, 2, 2};
        solution.sortColors(nums);
        assertArrayEquals(new int[]{2, 2, 2, 2}, nums); // Already sorted with all twos
    }

    @Test
    public void testSortColors_SortedArray() {
        int[] nums = {0, 1, 2};
        solution.sortColors(nums);
        assertArrayEquals(new int[]{0, 1, 2}, nums); // Already sorted array
    }

    @Test
    public void testSortColors_EmptyArray() {
        int[] nums = {};
        solution.sortColors(nums);
        assertArrayEquals(new int[]{}, nums); // Empty array, nothing to sort
    }

    @Test
    public void testSortColors_SingleElement() {
        int[] nums = {1};
        solution.sortColors(nums);
        assertArrayEquals(new int[]{1}, nums); // Single element, no sorting needed
    }
}
