package test.java.org.algodsa;

import main.java.org.algodsa.PowerOfTwo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PowerOfTwoTest {

    PowerOfTwo powerOfTwo = new PowerOfTwo();

    @Test
    void testPositivePowersOfTwo() {
        int[] powers = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
        for (int n : powers) {
            assertTrue(powerOfTwo.isPowerOfTwo(n), "Failed for isPowerOfTwo(" + n + ")");
            assertTrue(powerOfTwo.isPowerOfTwoII(n), "Failed for isPowerOfTwoII(" + n + ")");
        }
    }

    @Test
    void testNonPowersOfTwo() {
        int[] nonPowers = {0, 3, 5, 6, 7, 9, 10, 12, 18, 20, 1000};
        for (int n : nonPowers) {
            assertFalse(powerOfTwo.isPowerOfTwo(n), "Failed for isPowerOfTwo(" + n + ")");
            assertFalse(powerOfTwo.isPowerOfTwoII(n), "Failed for isPowerOfTwoII(" + n + ")");
        }
    }

    @Test
    void testNegativeNumbers() {
        int[] negatives = {-1, -2, -4, -8, -16};
        for (int n : negatives) {
            assertFalse(powerOfTwo.isPowerOfTwo(n), "Failed for isPowerOfTwo(" + n + ")");
            assertFalse(powerOfTwo.isPowerOfTwoII(n), "Failed for isPowerOfTwoII(" + n + ")");
        }
    }

    @Test
    void testEdgeCaseOne() {
        assertTrue(powerOfTwo.isPowerOfTwo(1));
        assertTrue(powerOfTwo.isPowerOfTwoII(1));
    }

    @Test
    void testLargePowerOfTwo() {
        int n = 1 << 30; // 2^30
        assertTrue(powerOfTwo.isPowerOfTwo(n));
        assertTrue(powerOfTwo.isPowerOfTwoII(n));
    }
}
