package main.java.org.algodsa;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Class that provides a method to compute the sum of the values of the deepest leaves in a binary tree.
 */
public class DeepestLeavesSum {
    /**
     * Constructor
     */
    public DeepestLeavesSum(){}

    /**
     * <h4><a href="https://leetcode.com/problems/deepest-leaves-sum/description/">1302. Deepest Leaves Sum</a></h4>
     * <br>
     * Computes the sum of the deepest leaves in the binary tree.
     * This method performs a level-order traversal (BFS) using a queue, resetting the sum at each level
     * and accumulating the values of the deepest level.<br>
     * <br>
     * Time Complexity: O(n), where n is the number of nodes in the tree. We visit each node exactly once.
     * <br>
     * Space Complexity: O(w), where w is the maximum width of the tree, which is the largest number of nodes at any level.
     * In the worst case, the space complexity could be O(n) if the tree is a complete binary tree.<br>
     * <br>
     * @param root the root of the binary tree
     * @return the sum of the values of the deepest leaves
     */
    public int deepestLeavesSum(TreeNode root) {
        if (root == null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int sum = 0;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            sum = 0; // Reset sum for each level
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                assert node != null;
                // Check if the node is a leaf
                if (node.left == null && node.right == null) {
                    sum += node.val;
                }
                // Add children to the queue for the next level
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
        }

        return sum;
    }

    // Alternative solution

    // initialize maximum depth count
    private int maxDepth = 0;
    // initialize sum
    private int sum = 0;

    /**
     * Alternative Solution
     * <br>
     * @param root TreeNode
     * @return sum
     */
    public int deepestLeavesSum2(TreeNode root) {
        if (root == null) return 0;

        dfs(root, 0);  // Start DFS from root at depth 0
        return sum;
    }

    // DFS helper method
    private void dfs(TreeNode node, int depth) {
        if (node == null) return;

        // If it's a leaf node
        if (node.left == null && node.right == null) {
            if (depth > maxDepth) {
                maxDepth = depth;
                sum = node.val;  // Reset sum for a deeper level
            } else if (depth == maxDepth) {
                sum += node.val;  // Accumulate sum if at the same deepest level
            }
        }

        // Continue DFS for left and right children
        dfs(node.left, depth + 1);
        dfs(node.right, depth + 1);
    }
}
