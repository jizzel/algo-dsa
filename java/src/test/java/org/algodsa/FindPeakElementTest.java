package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.FindPeakElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FindPeakElementTest {

    private FindPeakElement solution;

    @BeforeEach
    public void setUp() {
        solution = new FindPeakElement();
    }

    @Test
    public void testSinglePeakInArray() {
        assertEquals(2, solution.findPeakElement(new int[] {1, 2, 3, 1}));
        assertEquals(1, solution.findPeakElement(new int[] {1, 3, 2, 1}));
        assertEquals(1, solution.findPeakElement2(new int[] {1, 3, 2, 1}));
    }

    @Test
    public void testMultiplePeaks() {
        int result = solution.findPeakElement(new int[] {1, 2, 1, 3, 5, 6, 4});
        assertTrue(result == 1 || result == 5);  // Both indexes 1 and 5 are peaks
    }

    @Test
    public void testArrayWithAllIncreasingValues() {
        assertEquals(4, solution.findPeakElement(new int[] {1, 2, 3, 4, 5}));  // Last element should be the peak
    }

    @Test
    public void testArrayWithAllDecreasingValues() {
        assertEquals(0, solution.findPeakElement(new int[] {5, 4, 3, 2, 1}));  // First element should be the peak
    }

    @Test
    public void testSingleElementArray() {
        assertEquals(0, solution.findPeakElement(new int[] {1}));
    }

    @Test
    public void testTwoElementArray() {
        assertEquals(0, solution.findPeakElement(new int[] {2, 1}));
        assertEquals(1, solution.findPeakElement(new int[] {1, 2}));
    }
}
