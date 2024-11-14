package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.Pow;
import org.junit.jupiter.api.Test;

public class PowTest {

    @Test
    public void testPositiveExponent() {
        Pow solution = new Pow();
        assertEquals(8.0, solution.myPow(2.0, 3), 0.00001, "2^3 should be 8.0");
        assertEquals(27.0, solution.myPow(3.0, 3), 0.00001, "3^3 should be 27.0");
    }

    @Test
    public void testZeroExponent() {
        Pow solution = new Pow();
        assertEquals(1.0, solution.myPow(2.0, 0), 0.00001, "Any number raised to 0 should be 1.0");
        assertEquals(1.0, solution.myPow(0.0, 0), 0.00001, "0^0 is often defined as 1 in programming contexts");
    }

    @Test
    public void testNegativeExponent() {
        Pow solution = new Pow();
        assertEquals(0.125, solution.myPow(2.0, -3), 0.00001, "2^-3 should be 0.125");
        assertEquals(0.01, solution.myPow(10.0, -2), 0.00001, "10^-2 should be 0.01");
    }

    @Test
    public void testLargeExponent() {
        Pow solution = new Pow();
        assertEquals(1024.0, solution.myPow(2.0, 10), 0.00001, "2^10 should be 1024.0");
        assertEquals(1.0, solution.myPow(1.0, 2147483647), 0.00001, "1^n should be 1.0 for any n");
    }

    @Test
    public void testFractionalBase() {
        Pow solution = new Pow();
        assertEquals(0.25, solution.myPow(0.5, 2), 0.00001, "0.5^2 should be 0.25");
        assertEquals(4.0, solution.myPow(0.5, -2), 0.00001, "0.5^-2 should be 4.0");
    }
}