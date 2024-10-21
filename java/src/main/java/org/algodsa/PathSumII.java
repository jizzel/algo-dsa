package main.java.org.algodsa;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that provides a method to find all root-to-leaf paths in a binary tree
 * where the sum of the node values in each path equals the given target sum.
 */
public class PathSumII {
    /**
     * Constructor
     */
    public PathSumII(){}
    // Stores the resulting list of paths that satisfy the target sum
    List<List<Integer>> result;

    /**
     * <h4><a href="https://leetcode.com/problems/path-sum-ii/description/">113. Path Sum II</a></h4>
     * Finds all paths in the tree where the sum of node values equals the target sum.
     * Each path is a list of integers, and the result is a list of such paths.<br>
     * <br>
     * Time Complexity: O(n), where n is the number of nodes in the tree, since we visit every node once.<br>
     * Space Complexity: O(h), where h is the height of the tree, which represents the space used by the recursion stack.<br>
     * <br>
     * @param root the root node of the binary tree
     * @param targetSum the target sum to be matched along the root-to-leaf paths
     * @return a list of paths where the sum of node values equals the target sum
     */
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        result = new ArrayList<>();

        findSum(root, targetSum, new ArrayList<>());

        return result;
    }

    /** <br>
     * A recursive helper function to find all paths from the current node to the leaves
     * where the sum of node values equals the target sum.
     * <br>
     * @param node the current node being processed
     * @param targetSum the remaining sum to match
     * @param path the current path from the root to the current node
     */
    private void findSum(TreeNode node, int targetSum, List<Integer> path){
        if (node == null) return;

        path.add(node.val);

        if (node.left == null && node.right == null) {  // Check if it's a leaf node
            if (node.val == targetSum) {
                result.add(new ArrayList<>(path));  // Add the valid path to the result
            }
        } else {
            findSum(node.left, targetSum - node.val, path);  // Recur for the left subtree
            findSum(node.right, targetSum - node.val, path); // Recur for the right subtree
        }

        path.remove(path.size() - 1);  // Backtrack to explore other paths
    }
}
