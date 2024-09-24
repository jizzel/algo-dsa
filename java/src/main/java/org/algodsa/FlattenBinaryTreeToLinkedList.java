package main.java.org.algodsa;

/**
 * This class provides a method to flatten a binary tree into a linked list in-place.
 * The flattened linked list follows the same order as a pre-order traversal of the tree.
 */
public class FlattenBinaryTreeToLinkedList {
    TreeNode prev = null;

    /**
     * Constructor
     */
    public FlattenBinaryTreeToLinkedList(){}

    /**
     * <h4><a href="https://leetcode.com/problems/flatten-binary-tree-to-linked-list/description/">Flatten Binary Tree to Linked List</a></h4>
     * Flattens the given binary tree into a linked list in-place.<br>
     * The method modifies the tree such that all left children are set to null and
     * all right children point to the next node in the pre-order traversal.<br>
     * <br>
     * @param root the root node of the binary tree to be flattened
     * <br>
     * Time Complexity: O(n), where n is the number of nodes in the binary tree.
     * Each node is visited exactly once.
     * <br>
     * Space Complexity: O(h), where h is the height of the binary tree,
     * due to the recursive stack space used during the traversal.
     */
    public void flatten(TreeNode root) {
        if (root == null) return;

        flatten(root.right);
        flatten(root.left);

        root.right = prev;
        root.left = null;
        prev = root;
    }
}
