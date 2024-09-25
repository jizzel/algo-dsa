package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.NumberComplement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NumberComplementTest {
    private NumberComplement solution;

    @BeforeEach
    public void setUp() {
        solution = new NumberComplement();
    }

    @Test
    public void testFindComplement_Example1() {
        // Test case 1: Example 1
        int num = 5; // Binary: 101, Complement: 010 -> 2
        int expected = 2;
        int result = solution.findComplement(num);
        assertEquals(expected, result, "Complement of 5 should be 2");
    }

    @Test
    public void testFindComplement_Example2() {
        // Test case 2: Example 2
        int num = 1; // Binary: 1, Complement: 0 -> 0
        int expected = 0;
        int result = solution.findComplement(num);
        assertEquals(expected, result, "Complement of 1 should be 0");
    }

    @Test
    public void testFindComplement_LargerNumber() {
        // Test case 3: A larger number
        int num = 10; // Binary: 1010, Complement: 0101 -> 5
        int expected = 5;
        int result = solution.findComplement(num);
        assertEquals(expected, result, "Complement of 10 should be 5");
    }

    @Test
    public void testFindComplement_AllOnes() {
        // Test case 4: A number with all 1's in binary
        int num = 7; // Binary: 111, Complement: 000 -> 0
        int expected = 0;
        int result = solution.findComplement(num);
        assertEquals(expected, result, "Complement of 7 should be 0");
    }

    @Test
    public void testFindComplement_PowerOfTwoMinusOne() {
        // Test case 5: A number that is a power of two minus one
        int num = 15; // Binary: 1111, Complement: 0000 -> 0
        int expected = 0;
        int result = solution.findComplement(num);
        assertEquals(expected, result, "Complement of 15 should be 0");
    }

    @Test
    public void testFindComplement_SingleBit() {
        // Test case 6: Single bit number
        int num = 2; // Binary: 10, Complement: 01 -> 1
        int expected = 1;
        int result = solution.findComplement(num);
        assertEquals(expected, result, "Complement of 2 should be 1");
    }

    @Test
    public void testFindComplement_MaxInt() {
        // Test case 7: Maximum possible integer value
        int num = Integer.MAX_VALUE; // Binary: 111...111 (31 1's), Complement: 000...000 -> 0
        int expected = 0;
        int result = solution.findComplement(num);
        assertEquals(expected, result, "Complement of Integer.MAX_VALUE should be 0");
    }
}