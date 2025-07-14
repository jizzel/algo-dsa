package test.java.org.algodsa;

import main.java.org.algodsa.LargestNumberAtLeastTwiceOfOthers;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LargestNumberAtLeastTwiceOfOthersTest {

    LargestNumberAtLeastTwiceOfOthers solution = new LargestNumberAtLeastTwiceOfOthers();

    @Test
    void testDominantIndex_ValidCases() {
        assertEquals(1, solution.dominantIndex(new int[]{3, 6, 1, 0}));
        assertEquals(0, solution.dominantIndex(new int[]{10, 2, 5, 1}));
        assertEquals(0, solution.dominantIndex(new int[]{1}));
        assertEquals(1, solution.dominantIndex(new int[]{0, 1, 0, 0}));
    }

    @Test
    void testDominantIndex_InvalidCases() {
        assertEquals(-1, solution.dominantIndex(new int[]{1, 2, 3, 4}));
        assertEquals(-1, solution.dominantIndex(new int[]{0, 0, 3, 2}));
    }

    @Test
    void testDominantIndex_TieCases() {
        assertEquals(-1, solution.dominantIndex(new int[]{2, 2, 2, 2}));
    }

    @Test
    void testDominantIndex_EdgeCases() {
        assertEquals(0, solution.dominantIndex(new int[]{2}));
        assertEquals(0, solution.dominantIndex(new int[]{0}));
    }
}
