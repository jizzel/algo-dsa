package test.java.org.algodsa;

import main.java.org.algodsa.Miscellaneous;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MiscellaneousTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void runningSum() {
    }

    @Test
    void isBalanced() {
    }

    @Test
    void checkHeight() {
    }

    @Test
    void isSymmetric() {
    }

    @Test
    void preorder() {
    }

    @Test
    void preorderReverse() {
    }

    @Test
    void testSearch() {

        // Test case 1: Target is in the array
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target1 = 5;
        assertEquals(4, Miscellaneous.searchBinary(nums1, target1), "Target 5 should be found at index 4");

        // Test case 2: Target is not in the array
        int[] nums2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target2 = 10;
        assertEquals(-1, Miscellaneous.searchBinary(nums2, target2), "Target 10 should not be found, return -1");

        // Test case 3: Edge case - empty array
        int[] nums3 = {};
        int target3 = 5;
        assertEquals(-1, Miscellaneous.searchBinary(nums3, target3), "Search in empty array should return -1");

        // Test case 4: Edge case - single element array, target found
        int[] nums4 = {5};
        int target4 = 5;
        assertEquals(0, Miscellaneous.searchBinary(nums4, target4), "Target 5 should be found at index 0");

        // Test case 5: Edge case - single element array, target not found
        int[] nums5 = {1};
        int target5 = 5;
        assertEquals(-1, Miscellaneous.searchBinary(nums5, target5), "Target 5 should not be found in single element array, return -1");
    }

    @Test
    void testPrintPyramid() {
        // Redirect System.out to capture the printed output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Test with different pyramid sizes
        Miscellaneous.printPyramid(1);
        String expectedOutput1 = "*\n";
        assertEquals(expectedOutput1, outContent.toString(), "Pyramid of size 1 failed.");

        // Clear the output stream
        outContent.reset();

        Miscellaneous.printPyramid(2);
        String expectedOutput2 = " *\n***\n";
        assertEquals(expectedOutput2, outContent.toString(), "Pyramid of size 2 failed.");

        // Clear the output stream
        outContent.reset();

        Miscellaneous.printPyramid(3);
        String expectedOutput3 = "  *\n ***\n*****\n";
        assertEquals(expectedOutput3, outContent.toString(), "Pyramid of size 3 failed.");

        // Clear the output stream
        outContent.reset();

        Miscellaneous.printPyramid(4);
        String expectedOutput4 = "   *\n  ***\n *****\n*******\n";
        assertEquals(expectedOutput4, outContent.toString(), "Pyramid of size 4 failed.");

        // Reset System.out back to its original state
        System.setOut(System.out);
    }

    @Test
    public void testTwoSum() {
        // Test case 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = Miscellaneous.twoSum(nums1, target1);
        assertNotNull(result1, "The result should not be null");
        assertArrayEquals(new int[]{0, 1}, result1, "Indices should match the two numbers that sum up to the target");

        // Test case 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = Miscellaneous.twoSum(nums2, target2);
        assertNotNull(result2, "The result should not be null");
        assertArrayEquals(new int[]{1, 2}, result2, "Indices should match the two numbers that sum up to the target");

        // Test case 3
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = Miscellaneous.twoSum(nums3, target3);
        assertNotNull(result3, "The result should not be null");
        assertArrayEquals(new int[]{0, 1}, result3, "Indices should match the two numbers that sum up to the target");
    }
}