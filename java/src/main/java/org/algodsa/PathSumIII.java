package main.java.org.algodsa;

import java.util.HashMap;
import java.util.Map;

/**
 * This class provides a method to find the number of paths in a binary tree that sum up to a given target.
 * A path is defined as any sequence of nodes from some starting node to any node in the tree along the parent-child connections.
 */
public class PathSumIII {
    int countSum = 0;
    /**
     * Constructor
     */
    public PathSumIII(){}

    /**
     * <h4><a href="https://leetcode.com/problems/path-sum-iii/description/">437. Path Sum III</a></h4>
     * <br>
     * Counts the number of paths in the binary tree that sum up to the specified target sum.
     * <br>
     * Time complexity: O(n^2)
     * Space complexity: O(h)
     * <br>
     * The time complexity is O(n^2) in the worst case because, for each node, we may traverse all nodes in its subtree.
     * However, in a balanced tree, the average time complexity would be closer to O(n log n).
     * The space complexity is O(h), where h is the height of the tree, due to the recursive call stack.<br>
     * <br>
     * @param root the root of the binary tree
     * @param targetSum the target sum to find paths for
     * @return the number of paths that sum up to the target
     */
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return countSum;

        getCountSum(root, targetSum, 0L);
        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);

        return countSum;
    }

    /**
     * Helper method to recursively calculate the number of paths from the current node that sum to the target.
     * <br>
     * Time complexity: O(n) per call
     * Space complexity: O(h)
     * <br>
     * @param root the current node being evaluated
     * @param target the target sum to find paths for
     * @param sum the cumulative sum along the current path
     */
    private void getCountSum(TreeNode root, int target, long sum) {
        if (root == null) return;

        sum += root.val;

        if (sum == target) countSum++;

        getCountSum(root.left, target, sum);
        getCountSum(root.right, target, sum);
    }

    /**
     * A more efficient approach<br>
     * <br>
     * Finds the number of paths that sum up to the specified target sum.
     * This method uses a prefix sum technique with a HashMap to optimize the search for paths.
     * <br>
     * Time complexity: O(n)
     * Space complexity: O(n)
     *
     * The time complexity is O(n) because each node in the tree is visited once.
     * The space complexity is O(n) due to the HashMap used for storing cumulative sums and the call stack in recursion.
     *
     * @param root the root node of the binary tree
     * @param targetSum the target sum to find paths for
     * @return the number of paths that sum up to the target
     */
    public int pathSum2(TreeNode root, int targetSum) {
        // A map to store the cumulative sum up to all nodes along the path
        Map<Long, Integer> prefixSumMap = new HashMap<>();
        // Add base case for when the cumulative sum equals targetSum from the root
        prefixSumMap.put(0L, 1);
        // Start DFS from the root with targetSum converted to long
        return dfs(root, 0L, targetSum, prefixSumMap);
    }

    /**
     * Performs DFS to calculate the number of valid paths ending at each node.
     * Uses a HashMap to store the cumulative sum up to the current node, enabling fast lookups for target paths.
     *
     * Time complexity: O(n)
     * Space complexity: O(n)
     *
     * @param node the current node in the DFS traversal
     * @param currSum the cumulative sum up to this node
     * @param targetSum the target sum for the paths
     * @param prefixSumMap a map storing the frequency of cumulative sums along the current path
     * @return the number of valid paths found from this node
     */
    private int dfs(TreeNode node, long currSum, long targetSum, Map<Long, Integer> prefixSumMap) {
        if (node == null) {
            return 0;
        }

        // Update the current cumulative sum
        currSum += node.val;
        // Calculate the number of valid paths that end at this node
        int numPathsToCurr = prefixSumMap.getOrDefault(currSum - targetSum, 0);

        // Update the prefixSumMap with the current cumulative sum
        prefixSumMap.put(currSum, prefixSumMap.getOrDefault(currSum, 0) + 1);

        // Explore paths for left and right children
        int result = numPathsToCurr +
                dfs(node.left, currSum, targetSum, prefixSumMap) +
                dfs(node.right, currSum, targetSum, prefixSumMap);

        // Backtrack to ensure the current path does not affect other paths
        prefixSumMap.put(currSum, prefixSumMap.get(currSum) - 1);

        return result;
    }
}
