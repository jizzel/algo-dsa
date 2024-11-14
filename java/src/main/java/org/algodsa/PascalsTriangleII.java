package main.java.org.algodsa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class provides a method to generate a specific row of Pascal's Triangle.
 */
public class PascalsTriangleII {

    /**
     * Constructor
     */
    public PascalsTriangleII() {}

    /**
     * <h4><a href="https://leetcode.com/problems/pascals-triangle-ii/description/">119. Pascal's Triangle II</a></h4>
     * <br>
     * Generates the given row of Pascal's Triangle.
     * <br>
     * Time complexity: O(rowIndex^2)
     * Space complexity: O(rowIndex)
     * <br>
     * The time complexity is O(rowIndex^2) because we perform nested updates within the loop,
     * iterating through previous row values to compute the current row. The space complexity is O(rowIndex)
     * as we store only the specified row.<br>
     * <br>
     * @param rowIndex the index of the row in Pascal's Triangle (0-based).
     * @return a list of integers representing the row at rowIndex.
     */
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();

        // Initialize the row with 1's (the beginning and end of each row in Pascal's Triangle is always 1).
        for (int i = 0; i <= rowIndex; i++) {
            row.add(1);
        }

        // Calculate the values for the row using the properties of Pascal's Triangle
        for (int i = 1; i < rowIndex; i++) {
            for (int j = i; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }

        return row;
    }

    private final Map<String, Integer> memo = new HashMap<>();

    /**
     * Alternative solution: Recursion with Memoization
     * <br>
     * @param rowIndex integer
     * @return List
     */
    public List<Integer> getRow2(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            row.add(getElement(rowIndex, i));
        }
        return row;
    }

    /**
     * Helper method
     * <br>
     * @param row integer
     * @param col integer
     * @return integer
     */
    private int getElement(int row, int col) {
        // Base case: The first and last elements in each row are always 1
        if (col == 0 || col == row) {
            return 1;
        }

        // Memoization key
        String key = row + "," + col;

        // Check if the value has already been computed
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        // Recursive case with memoization
        int result = getElement(row - 1, col - 1) + getElement(row - 1, col);

        // Store the result in the map
        memo.put(key, result);

        return result;
    }
}