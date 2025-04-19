package test.java.org.algodsa;

import main.java.org.algodsa.BirdNest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BirdNestTest {

    BirdNest birdNest = new BirdNest();

    @Test
    void testBasicCaseFromMiddle() {
        int[] forest = {0, 0, 10, 0, 0, 25, 0, 30, 0, 50, 0};
        int bird = 4;
        int[] result = birdNest.buildNest(forest, bird);
        int sum = sumOfSticks(forest, result);
        assertTrue(sum >= 100);
    }

    @Test
    void testStartFromLeftEdge() {
        int[] forest = {0, 20, 20, 20, 20, 20, 20};
        int bird = 0;
        int[] result = birdNest.buildNest(forest, bird);
        int sum = sumOfSticks(forest, result);
        assertTrue(sum >= 100);
    }

    @Test
    void testStartFromRightEdge() {
        int[] forest = {20, 20, 20, 20, 20, 20, 0};
        int bird = 6;
        int[] result = birdNest.buildNest(forest, bird);
        int sum = sumOfSticks(forest, result);
        assertTrue(sum >= 100);
    }

    @Test
    void testOnlyOneStickOfLength100Nearby() {
        int[] forest = {0, 0, 100, 0, 0, 0};
        int bird = 1;
        int[] result = birdNest.buildNest(forest, bird);
        assertEquals(1, result.length);
        assertEquals(100, forest[result[0]]);
    }

    @Test
    void testAlternatingValuesAndStartMiddle() {
        int[] forest = {0, 10, 0, 10, 0, 10, 0, 10, 0, 40, 30};
        int bird = 5;
        int[] result = birdNest.buildNest(forest, bird);
        int sum = sumOfSticks(forest, result);
        assertTrue(sum >= 100);
    }

    @Test
    void testAllOnes() {
        int[] forest = new int[150];
        for (int i = 0; i < forest.length; i++) {
            forest[i] = 1;
        }
        int bird = 75;
        int[] result = birdNest.buildNest(forest, bird);
        int sum = sumOfSticks(forest, result);
        assertTrue(sum >= 100);
        assertTrue(result.length >= 100); // Since each stick is 1
    }

    private int sumOfSticks(int[] forest, int[] indices) {
        int sum = 0;
        for (int index : indices) {
            sum += forest[index];
        }
        return sum;
    }
}
