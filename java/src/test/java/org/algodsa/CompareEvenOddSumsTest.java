package test.java.org.algodsa;

import main.java.org.algodsa.CompareEvenOddSums;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CompareEvenOddSumsTest {

    CompareEvenOddSums comparator = new CompareEvenOddSums();

    @Test
    void testEvenWins() {
        assertEquals("even", comparator.solution(new int[]{10, 2, 5, 3}));
    }

    @Test
    void testOddWins() {
        assertEquals("odd", comparator.solution(new int[]{1, 10, 2, 15}));
    }

    @Test
    void testEqual() {
        assertEquals("equal", comparator.solution(new int[]{1, 1, 4, 4}));
    }

    @Test
    void testEmptyArray() {
        assertEquals("equal", comparator.solution(new int[]{}));
    }

    @Test
    void testSingleElement() {
        assertEquals("even", comparator.solution(new int[]{7}));
    }
}
