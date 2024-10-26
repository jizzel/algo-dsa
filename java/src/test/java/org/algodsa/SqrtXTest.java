package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.SqrtX;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SqrtXTest {

    private SqrtX solution;

    @BeforeEach
    public void setUp() {
        solution = new SqrtX();
    }

    @Test
    public void testSmallNumbers() {
        assertEquals(0, solution.mySqrt(0)); // Square root of 0
        assertEquals(1, solution.mySqrt(1)); // Square root of 1
        assertEquals(1, solution.mySqrt(2)); // Square root of 2 should floor to 1
        assertEquals(1, solution.mySqrt(3)); // Square root of 3 should floor to 1
        assertEquals(2, solution.mySqrt(4)); // Square root of 4
    }

    @Test
    public void testPerfectSquares() {
        assertEquals(3, solution.mySqrt(9));   // Square root of 9
        assertEquals(10, solution.mySqrt(100)); // Square root of 100
        assertEquals(12, solution.mySqrt(144)); // Square root of 144
    }

    @Test
    public void testNonPerfectSquares() {
        assertEquals(4, solution.mySqrt(20));   // Square root of 20 should floor to 4
        assertEquals(5, solution.mySqrt(27));   // Square root of 27 should floor to 5
        assertEquals(31, solution.mySqrt(999)); // Square root of 999 should floor to 31
    }

    @Test
    public void testLargeNumbers() {
        assertEquals(31622, solution.mySqrt(1000000000)); // Large number test
        assertEquals(46340, solution.mySqrt(2147483647)); // Maximum 32-bit integer
    }
}
