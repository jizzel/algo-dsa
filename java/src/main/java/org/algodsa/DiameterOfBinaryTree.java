package main.java.org.algodsa;

/**
 * Diameter of Binary Tree
 */
public class DiameterOfBinaryTree {
    // variable for calculating the diameter of a tree in the subsequent method
    static int diameter = 0;

    /**
     * Constructor
     */
    public DiameterOfBinaryTree(){}

    /**
     * <h4><a href="https://leetcode.com/problems/diameter-of-binary-tree/">Diameter of Binary Tree</a></h4>
     * Computes the diameter of a binary tree. The diameter is defined as the longest path
     * between any two nodes in the tree, which may or may not pass through the root.<br>
     * <br>
     * The diameter is the maximum sum of the heights of the left and right subtrees for any node.<br>
     * <br>
     * @param root the root of the binary tree
     * @return the diameter of the binary tree
     * <br>
     * Time Complexity: O(n) - where n is the number of nodes, since we need to visit each node once.<br>
     * Space Complexity: O(h) - where h is the height of the tree, due to the recursive call stack.<br>
     */

    public int diameterOfBinaryTree(TreeNode root) {
        // Calculate the height of the tree, while updating the diameter
        height(root);
        return diameter;
    }

    /**
     * Helper function to compute the height of the tree.<br>
     * While computing the height, it also updates the diameter.<br>
     *
     * @param node the current node in the binary tree
     * @return the height of the current subtree
     */
    public int height(TreeNode node) {
        // Base case: if the node is null, its height is 0
        if (node == null) return 0;

        // Recursively calculate the height of the left and right subtrees
        int left = height(node.left);
        int right = height(node.right);

        // Update the diameter if the current path (left + right) is larger than the previously known diameter
        diameter = Math.max(diameter, left + right);

        // Return the height of the current node (1 + maximum height of its children)
        return Math.max(left, right) + 1;
    }
}
