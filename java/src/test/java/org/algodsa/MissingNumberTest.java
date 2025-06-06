package test.java.org.algodsa;

import main.java.org.algodsa.MissingNumber;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MissingNumberTest {

    MissingNumber solution = new MissingNumber();

    @Test
    void testExampleCases() {
        assertEquals(2, solution.missingNumber(new int[]{3, 0, 1}));
        assertEquals(8, solution.missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
        assertEquals(1, solution.missingNumber(new int[]{0}));
    }

    @Test
    void testMissingNumberII() {
        assertEquals(2, solution.missingNumberII(new int[]{3, 0, 1}));
        assertEquals(8, solution.missingNumberII(new int[]{9,6,4,2,3,5,7,0,1}));
        assertEquals(1, solution.missingNumberII(new int[]{0}));
    }

    @Test
    void testMissingNumberIII() {
        assertEquals(2, solution.missingNumberIII(new int[]{3, 0, 1}));
        assertEquals(8, solution.missingNumberIII(new int[]{9,6,4,2,3,5,7,0,1}));
        assertEquals(1, solution.missingNumberIII(new int[]{0}));
    }

    @Test
    void testEdgeCases() {
        assertEquals(0, solution.missingNumber(new int[]{1}));
        assertEquals(0, solution.missingNumberII(new int[]{1}));
        assertEquals(0, solution.missingNumberIII(new int[]{1}));

        assertEquals(1, solution.missingNumber(new int[]{0}));
        assertEquals(1, solution.missingNumberII(new int[]{0}));
        assertEquals(1, solution.missingNumberIII(new int[]{0}));
    }

    @Test
    void testNoMissingNumber() {
        assertEquals(4, solution.missingNumber(new int[]{0, 1, 2, 3}));
        assertEquals(4, solution.missingNumberII(new int[]{0, 1, 2, 3}));
        assertEquals(4, solution.missingNumberIII(new int[]{0, 1, 2, 3}));
    }
}
