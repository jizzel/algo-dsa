package main.java.org.algodsa;

/**
 * Balanced Binary Tree
 */
public class BalancedBinaryTree {
    /**
     * Constructor
     */
    public BalancedBinaryTree(){}

    /**
     * <h4><a href="https://leetcode.com/problems/balanced-binary-tree/">Balanced Binary Tree</a></h4>
     * Determines if a binary tree is height-balanced.<br>
     * <br>
     * A binary tree is considered balanced if the heights of the two subtrees of
     * every node never differ by more than one. This method utilizes a helper function
     * to recursively calculate the height of each subtree and check the balance condition.<br>
     * <br>
     * Time Complexity: O(n) - where n is the number of nodes in the tree, as each node is visited once.<br>
     * Space Complexity: O(h) - where h is the height of the tree, due to the recursion stack.<br>
     * <br>
     * @param root the root node of the binary tree
     * @return true if the tree is balanced, false otherwise
     */
    public static boolean isBalanced(TreeNode root) {
        // If checkHeight returns -1, the tree is unbalanced
        return checkHeight(root) != -1;
    }

    /**
     * Helper method that calculates the height of a subtree and checks if it is balanced.<br>
     * <br>
     * The method returns -1 if the subtree is unbalanced; otherwise, it returns the height
     * of the subtree. If any subtree has a height difference greater than 1 between
     * its left and right children, the method will propagate -1 up to signal that the
     * entire tree is unbalanced.<br>
     * <br>
     * @param node the current node in the binary tree
     * @return the height of the subtree if balanced, or -1 if unbalanced
     */
    public static int checkHeight(TreeNode node) {
        // Base case: if the node is null, its height is 0
        if (node == null) return 0;

        // Recursively check the height of the left subtree
        int left = checkHeight(node.left);
        if (left == -1) return -1;  // If the left subtree is unbalanced, propagate -1

        // Recursively check the height of the right subtree
        int right = checkHeight(node.right);
        if (right == -1) return -1;  // If the right subtree is unbalanced, propagate -1

        // If the height difference between left and right subtrees is more than 1, return -1
        if (Math.abs(left - right) > 1) return -1;

        // Return the height of the current subtree
        return Math.max(left, right) + 1;
    }
}
