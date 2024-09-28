package test.java.org.algodsa;

import main.java.org.algodsa.DetectCapital;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetectCapitalTest {
    DetectCapital solution = new DetectCapital();

    @Test
    public void testDetectCapitalUse() {
        assertTrue(solution.detectCapitalUse("USA"));
        assertTrue(solution.detectCapitalUse("leetcode"));
        assertTrue(solution.detectCapitalUse("Google"));
        assertFalse(solution.detectCapitalUse("FlaG"));
    }

}