package test.java.org.algodsa;

import main.java.org.algodsa.RepeatedSubstringPattern;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepeatedSubstringPatternTest {
    RepeatedSubstringPattern solution = new RepeatedSubstringPattern();

    @Test
    public void testRepeatedSubstringPattern() {
        assertTrue(solution.repeatedSubstringPattern("abab"));
        assertFalse(solution.repeatedSubstringPattern("aba"));
        assertTrue(solution.repeatedSubstringPattern("abcabcabcabc"));
    }

}