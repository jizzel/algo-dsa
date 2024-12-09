package main.java.org.algodsa;

/**
 * This class provides a method to search for a target value in a 2D matrix.
 * The matrix has the following properties:
 * - Each row is sorted in ascending order.
 * - Each column is sorted in ascending order.
 */
public class SearchA2DMatrixII {
    /**
     * Constructor
     */
    public SearchA2DMatrixII(){}

    /**
     * <h4><a href="https://leetcode.com/problems/search-a-2d-matrix-ii/">240. Search a 2D Matrix II</a></h4>
     * <br>
     * Searches for a target value in the given 2D matrix.
     * <br>
     * Time complexity: O(m + n)
     * Space complexity: O(1)
     * <br>
     * The time complexity is O(m + n) because in the worst case,
     * the algorithm traverses the matrix diagonally from the top-right
     * to the bottom-left corner. The space complexity is O(1) as no
     * additional data structures are used.
     * <br>
     * @param matrix the 2D matrix to search within.
     * @param target the value to search for.
     * @return {@code true} if the target is found, otherwise {@code false}.
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Start from the top-right corner
        int row = 0, col = cols - 1;

        while (row < rows && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                col--; // Move left
            } else {
                row++; // Move down
            }
        }

        return false; // Target not found
    }
}
