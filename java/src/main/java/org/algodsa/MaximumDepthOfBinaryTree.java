package main.java.org.algodsa;

/**
 * Maximum Depth of Binary Tree
 */
public class MaximumDepthOfBinaryTree {
    /**
     * Constructor
     */
    public MaximumDepthOfBinaryTree(){}

    /**
     * <h4><a href="https://leetcode.com/problems/maximum-depth-of-binary-tree/"> Maximum Depth of Binary Tree</a></h4>
     * Computes the maximum depth (or height) of a binary tree.<br>
     * <br>
     * The maximum depth is the number of nodes along the longest path
     * from the root node down to the farthest leaf node.<br>
     * <br>
     * Time Complexity: O(n) - where n is the number of nodes in the tree,
     * as each node is visited once.<br>
     * Space Complexity: O(h) - where h is the height of the tree,
     * due to the recursion stack.<br>
     * <br>
     * @param root the root node of the binary tree
     * @return the maximum depth of the tree
     */
    public int maxDepth(TreeNode root) {
        // Base case: if the node is null, the depth is 0
        if (root == null) return 0;

        // Recursively find the maximum depth of the left subtree
        int lmax = maxDepth(root.left);

        // Recursively find the maximum depth of the right subtree
        int rmax = maxDepth(root.right);

        // Return the greater depth between the left and right subtree plus 1 (for the current node)
        return Math.max(lmax, rmax) + 1;
    }

}
