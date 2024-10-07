package main.java.org.algodsa;

/**
 * Class to trim a Binary Search Tree (BST) such that all its elements lie within a given range [low, high].
 */
public class TrimABinarySearchTree {
    /**
     * Constructor
     */
    public TrimABinarySearchTree(){}

    /**
     * <h4><a href="https://leetcode.com/problems/trim-a-binary-search-tree/description/">669. Trim a Binary Search Tree</a></h4>
     * <br>
     * Trims the binary search tree so that all node values lie between the specified low and high bounds.<br>
     * Any node with a value less than the low bound is removed along with its left subtree, and any node
     * with a value greater than the high bound is removed along with its right subtree.<br>
     * <br>
     * Time Complexity: O(n), where n is the number of nodes in the tree. In the worst case, each node
     * is visited once to determine whether it should be included or removed.<br>
     * <br>
     * Space Complexity: O(h), where h is the height of the tree. This is the space used by the recursion stack.
     * In the worst case of a skewed tree, the height could be n.<br>
     * <br>
     * @param root the root of the binary search tree
     * @param low the lower bound of the value range to retain
     * @param high the upper bound of the value range to retain
     * @return the root of the trimmed binary search tree
     */
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null) return null;

        // If the current node's value is less than the low bound, trim the right subtree.
        if (root.val < low) return trimBST(root.right, low, high);

        // If the current node's value is greater than the high bound, trim the left subtree.
        if (root.val > high) return trimBST(root.left, low, high);

        // Otherwise, trim both left and right subtrees.
        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);

        return root;
    }
}

