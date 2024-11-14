package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.PascalsTriangleII;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangleIITest {

    @Test
    public void testRowZero() {
        PascalsTriangleII solution = new PascalsTriangleII();
        List<Integer> expected = List.of(1);
        assertEquals(expected, solution.getRow(0), "Row 0 should be [1]");
    }

    @Test
    public void testRowOne() {
        PascalsTriangleII solution = new PascalsTriangleII();
        List<Integer> expected = Arrays.asList(1, 1);
        assertEquals(expected, solution.getRow(1), "Row 1 should be [1, 1]");
    }

    @Test
    public void testRowTwo() {
        PascalsTriangleII solution = new PascalsTriangleII();
        List<Integer> expected = Arrays.asList(1, 2, 1);
        assertEquals(expected, solution.getRow(2), "Row 2 should be [1, 2, 1]");
    }

    @Test
    public void testRowThree() {
        PascalsTriangleII solution = new PascalsTriangleII();
        List<Integer> expected = Arrays.asList(1, 3, 3, 1);
        assertEquals(expected, solution.getRow(3), "Row 3 should be [1, 3, 3, 1]");
        assertEquals(expected, solution.getRow2(3), "Row 3 should be [1, 3, 3, 1]");
    }

    @Test
    public void testRowFour() {
        PascalsTriangleII solution = new PascalsTriangleII();
        List<Integer> expected = Arrays.asList(1, 4, 6, 4, 1);
        assertEquals(expected, solution.getRow(4), "Row 4 should be [1, 4, 6, 4, 1]");
    }

    @Test
    public void testRowFive() {
        PascalsTriangleII solution = new PascalsTriangleII();
        List<Integer> expected = Arrays.asList(1, 5, 10, 10, 5, 1);
        assertEquals(expected, solution.getRow(5), "Row 5 should be [1, 5, 10, 10, 5, 1]");
    }
}