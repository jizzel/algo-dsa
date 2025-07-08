package test.java.org.algodsa;

import main.java.org.algodsa.UglyNumber;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UglyNumberTest {

    UglyNumber solution = new UglyNumber();

    @Test
    void testUglyNumbers() {
        assertTrue(solution.isUgly(1));    // 1 is considered an ugly number
        assertTrue(solution.isUgly(6));    // 2 * 3
        assertTrue(solution.isUgly(8));    // 2 * 2 * 2
        assertTrue(solution.isUgly(30));   // 2 * 3 * 5
        assertTrue(solution.isUgly(60));   // 2^2 * 3 * 5
    }

    @Test
    void testNonUglyNumbers() {
        assertFalse(solution.isUgly(14));  // 2 * 7 → 7 is not allowed
        assertFalse(solution.isUgly(121)); // 11 * 11
        assertFalse(solution.isUgly(0));   // not positive
        assertFalse(solution.isUgly(-6));  // negative number
        assertFalse(solution.isUgly(7));   // prime and not 2, 3, or 5
        assertTrue(solution.isUgly(1));
    }

    @Test
    void testLargeUglyNumber() {
        assertTrue(solution.isUgly(2 * 2 * 3 * 5 * 5 * 3)); // = 900
    }
}
