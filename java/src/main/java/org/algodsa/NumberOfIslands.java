package main.java.org.algodsa;

import java.util.LinkedList;
import java.util.Queue;

/**
 * This class provides a method to count the number of islands in a given grid.
 * An island is defined as a group of connected '1's (land) that are surrounded
 * by '0's (water), where connections are allowed horizontally or vertically.
 */
public class NumberOfIslands {

    /**
     * Default constructor for NumberOfIslands.
     */
    public NumberOfIslands() {}

    /**
     * <h4><a href="https://leetcode.com/problems/number-of-islands/">200. Number of Islands</a></h4>
     * <br>
     * Counts the number of islands in the given grid.
     * <br>
     * Time complexity: O(m * n)
     * Space complexity: O(m * n)
     * <br>
     * The time complexity is O(m * n) where m is the number of rows and n is the number of columns in the grid.
     * The space complexity is O(m * n) due to the recursion stack or BFS queue and the grid modification.
     * <br>
     * @param grid a 2D character array representing the map, where '1' represents land and '0' represents water
     * @return the number of islands in the grid
     */
    public int numIslands(char[][] grid) {
        int rLength = grid.length;
        int cLength = grid[0].length;
        int[][] directions = new int[][]{{0,1}, {1,0}, {0,-1}, {-1,0}};  // Possible movement directions
        int numOfIslands = 0;

        for (int i = 0; i < rLength; i++) {
            for (int j = 0; j < cLength; j++) {
                if (grid[i][j] == '1') {
                    numOfIslands++;
                    bfs(grid, i, j, directions);  // Perform BFS to mark the whole island
                }
            }
        }

        return numOfIslands;
    }

    /**
     * Helper method that performs Breadth-First Search (BFS) to mark all cells of an island as visited.
     *
     * @param grid       the grid of land ('1') and water ('0')
     * @param i          the row index of the starting cell
     * @param j          the column index of the starting cell
     * @param directions possible movement directions (up, down, left, right)
     */
    private void bfs(char[][] grid, int i, int j, int[][] directions) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});
        grid[i][j] = '0';  // Mark the starting cell as visited by setting it to '0'

        while (!queue.isEmpty()) {
            int[] cell = queue.poll();

            for (int[] direction : directions) {
                int newRow = cell[0] + direction[0];
                int newCol = cell[1] + direction[1];

                // Check if newRow and newCol are within bounds and if the cell is part of the island ('1')
                if (newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[0].length && grid[newRow][newCol] == '1') {
                    queue.offer(new int[]{newRow, newCol});
                    grid[newRow][newCol] = '0';  // Mark this cell as visited
                }
            }
        }
    }
}
