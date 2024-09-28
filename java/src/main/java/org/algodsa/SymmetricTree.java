package main.java.org.algodsa;

/**
 * Symmetric Tree
 */
public class SymmetricTree {
    /**
     * Constructor
     */
    public SymmetricTree(){}

    /**
     * <h4><a href="https://leetcode.com/problems/symmetric-tree/description/">Symmetric Tree</a></h4>
     * Checks if the given binary tree is symmetric (i.e., a mirror of itself).<br>
     * <br>
     * A binary tree is symmetric if the left subtree is a mirror reflection of the right subtree.<br>
     * <br>
     * Time Complexity: O(n) - where n is the number of nodes in the tree, as each node is visited once.<br>
     * Space Complexity: O(h) - where h is the height of the tree, due to the recursion stack.<br>
     * <br>
     * @param root the root node of the binary tree
     * @return true if the tree is symmetric, false otherwise
     */
    public boolean isSymmetric(TreeNode root) {
        // If the tree is empty, it's symmetric by definition
        if (root == null) return true;

        // Check if the left and right subtrees are mirrors of each other
        return isMirror(root.left, root.right);
    }

    /**
     * Helper method to check if two trees are mirror images of each other.<br>
     * <br>
     * Two trees are mirrors if:<br>
     * 1. Their root values are the same.<br>
     * 2. The right subtree of one tree is a mirror of the left subtree of the other tree and vice versa.<br>
     * <br>
     * @param t1 the root of the first subtree
     * @param t2 the root of the second subtree
     * @return true if the subtrees are mirrors, false otherwise
     */
    private boolean isMirror(TreeNode t1, TreeNode t2) {
        // If both subtrees are null, they are mirrors
        if (t1 == null && t2 == null) return true;

        // If only one of the subtrees is null, they are not mirrors
        if (t1 == null || t2 == null) return false;

        // Check if the current nodes have the same value and
        // the left subtree of t1 is a mirror of the right subtree of t2,
        // and the right subtree of t1 is a mirror of the left subtree of t2
        return (t1.val == t2.val) && isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
    }
}
