package main.java.org.algodsa;

/**
 * This class provides a method to validate whether a given binary tree
 * is a valid Binary Search Tree (BST).
 */
public class ValidateBinarySearchTree {

    /**
     * Constructor
     */
    public ValidateBinarySearchTree() {}

    /**
     * <h4><a href="https://leetcode.com/problems/validate-binary-search-tree/">98. Validate Binary Search Tree</a></h4>
     * <br>
     * Determines if the given binary tree is a valid BST.
     * <br>
     * Time complexity: O(n)
     * Space complexity: O(h)
     * <br>
     * The time complexity is O(n) because each node is visited once.
     * The space complexity is O(h), where h is the height of the tree,
     * due to the recursive call stack.
     * <br>
     * @param root the root node of the binary tree to validate.
     * @return {@code true} if the binary tree is a valid BST, otherwise {@code false}.
     */
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    /**
     * Helper method to validate the binary tree recursively using a range.
     * <br>
     * @param root the current node being validated.
     * @param min the minimum allowable value for the current node (exclusive).
     * @param max the maximum allowable value for the current node (exclusive).
     * @return {@code true} if the subtree rooted at the current node is a valid BST, otherwise {@code false}.
     */
    private boolean isValidBST(TreeNode root, Integer min, Integer max) {
        if (root == null) return true;

        // Validate current node's value within the min and max bounds
        if ((min != null && root.val <= min) || (max != null && root.val >= max)) return false;

        // Recursively validate the left and right subtrees with updated bounds
        return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);
    }
}
