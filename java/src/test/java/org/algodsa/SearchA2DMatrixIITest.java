package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.SearchA2DMatrixII;
import org.junit.jupiter.api.Test;

public class SearchA2DMatrixIITest {

    @Test
    public void testTargetExistsInMatrix() {
        SearchA2DMatrixII searcher = new SearchA2DMatrixII();
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        assertTrue(searcher.searchMatrix(matrix, 5), "The target 5 exists in the matrix.");
    }

    @Test
    public void testTargetDoesNotExistInMatrix() {
        SearchA2DMatrixII searcher = new SearchA2DMatrixII();
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        assertFalse(searcher.searchMatrix(matrix, 20), "The target 20 does not exist in the matrix.");
    }

    @Test
    public void testTargetAtTopRightCorner() {
        SearchA2DMatrixII searcher = new SearchA2DMatrixII();
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        assertTrue(searcher.searchMatrix(matrix, 15), "The target 15 is at the top-right corner of the matrix.");
    }

    @Test
    public void testTargetAtBottomLeftCorner() {
        SearchA2DMatrixII searcher = new SearchA2DMatrixII();
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        assertTrue(searcher.searchMatrix(matrix, 18), "The target 18 is at the bottom-left corner of the matrix.");
    }

    @Test
    public void testTargetInSingleRowMatrix() {
        SearchA2DMatrixII searcher = new SearchA2DMatrixII();
        int[][] matrix = {{1, 3, 5, 7, 9}};
        assertTrue(searcher.searchMatrix(matrix, 5), "The target 5 exists in a single-row matrix.");
        assertFalse(searcher.searchMatrix(matrix, 6), "The target 6 does not exist in a single-row matrix.");
    }

    @Test
    public void testTargetInSingleColumnMatrix() {
        SearchA2DMatrixII searcher = new SearchA2DMatrixII();
        int[][] matrix = {
                {1},
                {3},
                {5},
                {7},
                {9}
        };
        assertTrue(searcher.searchMatrix(matrix, 7), "The target 7 exists in a single-column matrix.");
        assertFalse(searcher.searchMatrix(matrix, 6), "The target 6 does not exist in a single-column matrix.");
    }

    @Test
    public void testEmptyRowsMatrix() {
        SearchA2DMatrixII searcher = new SearchA2DMatrixII();
        int[][] matrix = {{}};
        assertFalse(searcher.searchMatrix(matrix, 5), "The target cannot exist in a matrix with empty rows.");
    }
}
