package test.java.org.algodsa;

import main.java.org.algodsa.AddDigits;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AddDigitsTest {

    AddDigits adder = new AddDigits();

    @Test
    void testSingleDigit() {
        assertEquals(5, adder.addDigits(5));
        assertEquals(5, adder.addDigitsII(5));
    }

    @Test
    void testZeroInput() {
        assertEquals(0, adder.addDigits(0));
        assertEquals(0, adder.addDigitsII(0));
    }

    @Test
    void testDoubleDigits() {
        assertEquals(9, adder.addDigits(18));  // 1 + 8 = 9
        assertEquals(9, adder.addDigitsII(18));

        assertEquals(1, adder.addDigits(10));  // 1 + 0 = 1
        assertEquals(1, adder.addDigitsII(10));
    }

    @Test
    void testMultipleIterations() {
        assertEquals(6, adder.addDigits(12345)); // 1+2+3+4+5=15, 1+5=6
        assertEquals(6, adder.addDigitsII(12345));

        assertEquals(9, adder.addDigits(99)); // 9+9=18 → 1+8=9
        assertEquals(9, adder.addDigitsII(99));
    }

    @Test
    void testDigitalRootBoundary() {
        assertEquals(9, adder.addDigits(9));
        assertEquals(9, adder.addDigitsII(9));

        assertEquals(9, adder.addDigits(81)); // 8+1 = 9
        assertEquals(9, adder.addDigitsII(81));
    }

    @Test
    void testLargeNumber() {
        assertEquals(9, adder.addDigits(999999999)); // Many 9s, sum = 81 → 9
        assertEquals(9, adder.addDigitsII(999999999));
    }
}
