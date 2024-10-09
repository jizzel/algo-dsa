package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.DuplicateZeros;
import org.junit.jupiter.api.Test;

public class DuplicateZerosTest {

    private final DuplicateZeros solution = new DuplicateZeros();

    @Test
    public void testDuplicateZeros_NoZeros() {
        int[] arr = {1, 2, 3, 4, 5};
        solution.duplicateZeros(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr, "The array should remain unchanged if there are no zeros.");
    }

    @Test
    public void testDuplicateZeros_WithZeros() {
        int[] arr = {1, 0, 2, 3, 0, 4, 5};
        solution.duplicateZeros(arr);
        assertArrayEquals(new int[]{1, 0, 0, 2, 3, 0, 0}, arr, "Zeros should be duplicated in the array.");
    }

    @Test
    public void testDuplicateZeros_EndsWithZero() {
        int[] arr = {0, 1, 2, 3};
        solution.duplicateZeros(arr);
        assertArrayEquals(new int[]{0, 0, 1, 2}, arr, "If a zero is at the start, it should be duplicated without affecting the rest of the array.");
    }

    @Test
    public void testDuplicateZeros_FullArrayWithZeros() {
        int[] arr = {0, 0, 0, 0, 0};
        solution.duplicateZeros(arr);
        assertArrayEquals(new int[]{0, 0, 0, 0, 0}, arr, "All zeros should remain zeros after duplication.");
    }

    @Test
    public void testDuplicateZeros_Mixed() {
        int[] arr = {1, 2, 0, 3, 0, 4, 5, 0};
        solution.duplicateZeros(arr);
        assertArrayEquals(new int[]{1, 2, 0, 0, 3, 0, 0, 4}, arr, "Duplicating zeros should push elements right, filling the array correctly.");
    }

    @Test
    public void testDuplicateZeros_SingleElementArray() {
        int[] arr = {0};
        solution.duplicateZeros(arr);
        assertArrayEquals(new int[]{0}, arr, "A single zero should remain a zero after duplication.");
    }

    @Test
    public void testDuplicateZeros_SingleNonZeroElement() {
        int[] arr = {1};
        solution.duplicateZeros(arr);
        assertArrayEquals(new int[]{1}, arr, "A single non-zero element should remain unchanged.");
    }
}
