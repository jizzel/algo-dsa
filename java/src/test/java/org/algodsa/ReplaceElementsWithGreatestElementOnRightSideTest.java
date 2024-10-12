package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.ReplaceElementsWithGreatestElementOnRightSide;
import org.junit.jupiter.api.Test;

public class ReplaceElementsWithGreatestElementOnRightSideTest {

    private final ReplaceElementsWithGreatestElementOnRightSide solution = new ReplaceElementsWithGreatestElementOnRightSide();

    @Test
    public void testReplaceElements_BasicCase() {
        int[] arr = {17, 18, 5, 4, 6, 1};
        int[] expected = {18, 6, 6, 6, 1, -1};
        assertArrayEquals(expected, solution.replaceElements(arr), "The array should be replaced with the greatest element on the right.");
    }

    @Test
    public void testReplaceElements_SingleElement() {
        int[] arr = {5};
        int[] expected = {-1};
        assertArrayEquals(expected, solution.replaceElements(arr), "A single element array should become [-1].");
    }

    @Test
    public void testReplaceElements_AllIncreasingOrder() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {5, 5, 5, 5, -1};
        assertArrayEquals(expected, solution.replaceElements(arr), "All elements should be replaced by the greatest element to the right.");
    }

    @Test
    public void testReplaceElements_AllDecreasingOrder() {
        int[] arr = {5, 4, 3, 2, 1};
        int[] expected = {4, 3, 2, 1, -1};
        assertArrayEquals(expected, solution.replaceElements(arr), "The array in decreasing order should replace elements with the next greatest.");
    }

    @Test
    public void testReplaceElements_AllEqualElements() {
        int[] arr = {7, 7, 7, 7};
        int[] expected = {7, 7, 7, -1};
        assertArrayEquals(expected, solution.replaceElements(arr), "All equal elements should replace with the same value until the last element.");
    }

    @Test
    public void testReplaceElements_LargeNumbers() {
        int[] arr = {100, 200, 300, 400};
        int[] expected = {400, 400, 400, -1};
        assertArrayEquals(expected, solution.replaceElements(arr), "The array with large numbers should replace elements with the largest number to the right.");
    }
}
