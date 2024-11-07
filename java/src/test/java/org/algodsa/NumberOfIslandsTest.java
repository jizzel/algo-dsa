package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.NumberOfIslands;
import org.junit.jupiter.api.Test;

public class NumberOfIslandsTest {

    @Test
    public void testNumIslandsSingleIsland() {
        NumberOfIslands solver = new NumberOfIslands();
        char[][] grid = {
                {'1', '1', '0', '0'},
                {'1', '1', '0', '0'},
                {'0', '0', '1', '0'},
                {'0', '0', '0', '1'}
        };
        assertEquals(3, solver.numIslands(grid), "Should find 3 distinct islands in the grid.");
    }

    @Test
    public void testNumIslandsAllWater() {
        NumberOfIslands solver = new NumberOfIslands();
        char[][] grid = {
                {'0', '0', '0'},
                {'0', '0', '0'},
                {'0', '0', '0'}
        };
        assertEquals(0, solver.numIslands(grid), "Should find 0 islands in an all-water grid.");
    }

    @Test
    public void testNumIslandsAllLand() {
        NumberOfIslands solver = new NumberOfIslands();
        char[][] grid = {
                {'1', '1', '1'},
                {'1', '1', '1'},
                {'1', '1', '1'}
        };
        assertEquals(1, solver.numIslands(grid), "Should find 1 island in an all-land grid.");
    }

    @Test
    public void testNumIslandsComplexGrid() {
        NumberOfIslands solver = new NumberOfIslands();
        char[][] grid = {
                {'1', '0', '1', '0'},
                {'0', '1', '0', '1'},
                {'1', '0', '1', '0'},
                {'0', '1', '0', '1'}
        };
        assertEquals(8, solver.numIslands(grid), "Should find 8 islands in a grid with alternating land and water.");
    }

    @Test
    public void testNumIslandsSingleCellIsland() {
        NumberOfIslands solver = new NumberOfIslands();
        char[][] grid = {
                {'0', '0', '0'},
                {'0', '1', '0'},
                {'0', '0', '0'}
        };
        assertEquals(1, solver.numIslands(grid), "Should find 1 island with a single land cell.");
    }

    @Test
    public void testNumIslandsIrregularShape() {
        NumberOfIslands solver = new NumberOfIslands();
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '1', '1'},
                {'0', '0', '0', '1', '1'},
                {'0', '1', '0', '0', '0'}
        };
        assertEquals(3, solver.numIslands(grid), "Should find 3 distinct islands in an irregular grid shape.");
    }
}
