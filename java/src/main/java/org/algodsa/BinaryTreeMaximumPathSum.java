package main.java.org.algodsa;

/**
 * This class provides a solution to find the maximum path sum in a binary tree.
 * A path is defined as any sequence of nodes from some starting node to any node
 * in the tree along the parent-child connections. The path must contain at least
 * one node and does not need to go through the root.
 */
public class BinaryTreeMaximumPathSum {
    int maxPathSum;

    /**
     * Constructor
     */
    public BinaryTreeMaximumPathSum(){}

    /**
     * <h4><a href="https://leetcode.com/problems/binary-tree-maximum-path-sum/description/">124. Binary Tree Maximum Path Sum</a></h4>
     * Calculates the maximum path sum of a binary tree.
     * <br>
     * Time complexity: O(n)
     * Space complexity: O(h)
     * <br>
     * The time complexity is O(n), where n is the number of nodes in the tree. We visit each node once.
     * The space complexity is O(h), where h is the height of the tree, due to recursion stack.<br>
     * <br>
     * @param root the root node of the binary tree
     * @return the maximum path sum
     */
    public int maxPathSum(TreeNode root) {
        maxPathSum = root.val;  // Initialize with the root value to handle negative values in the tree
        getPathSum(root);
        return maxPathSum;
    }

    /**
     * Helper method to recursively calculate the maximum path sum of each subtree.
     * Updates the global maxPathSum if a higher path sum is found.
     *
     * @param node the current node being processed
     * @return the maximum path sum including the current node and one of its subtrees
     */
    private int getPathSum(TreeNode node) {
        if (node == null) return 0;

        // Compute the maximum path sum for the left and right subtrees
        int left = Math.max(0, getPathSum(node.left));
        int right = Math.max(0, getPathSum(node.right));

        // Update maxPathSum with the maximum sum of the current path
        maxPathSum = Math.max(maxPathSum, node.val + left + right);

        // Return the maximum path sum that includes the current node and one of its children
        return node.val + Math.max(left, right);
    }
}
