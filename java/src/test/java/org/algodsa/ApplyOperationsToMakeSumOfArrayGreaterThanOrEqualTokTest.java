package test.java.org.algodsa;

import main.java.org.algodsa.ApplyOperationsToMakeSumOfArrayGreaterThanOrEqualTok;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ApplyOperationsToMakeSumOfArrayGreaterThanOrEqualTokTest {

    ApplyOperationsToMakeSumOfArrayGreaterThanOrEqualTok solver = new ApplyOperationsToMakeSumOfArrayGreaterThanOrEqualTok();

    @Test
    void testSmallInputs() {
        assertEquals(0, solver.minOperations(1));
        assertEquals(1, solver.minOperations(2));
        assertEquals(2, solver.minOperations(4));
    }

    @Test
    void testMinOperationsVsMinOperationsII() {
        for (int k = 1; k <= 10000; k++) {
            assertEquals(
                    solver.minOperations(k),
                    solver.minOperationsII(k),
                    "Mismatch at k = " + k
            );
        }
    }

    @Test
    void testLargeInput() {
        int k = 1_000_000;
        int result = solver.minOperations(k);
        int resultII = solver.minOperationsII(k);
        assertEquals(result, resultII);
        assertTrue(result > 0);
    }

    @Test
    void testEdgeCaseOne() {
        assertEquals(0, solver.minOperations(1));
        assertEquals(0, solver.minOperationsII(1));
    }
}
