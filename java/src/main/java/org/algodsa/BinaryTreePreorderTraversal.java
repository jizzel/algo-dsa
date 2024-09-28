package main.java.org.algodsa;

import java.util.ArrayList;
import java.util.List;

/**
 * Binary Tree PreOrder
 */
public class BinaryTreePreorderTraversal {
    /**
     * Constructor
     */
    public BinaryTreePreorderTraversal(){}

    /**
     * <h4><a href="https://leetcode.com/problems/binary-tree-preorder-traversal/">Binary Tree Preorder Traversal</a></h4>
     * Performs a preorder traversal on a binary tree. <br>
     * <br>
     * In preorder traversal, the nodes are recursively visited in this order:<br>
     * 1. Visit the current node.<br>
     * 2. Traverse the left subtree.<br>
     * 3. Traverse the right subtree.<br>
     * <br>
     * The method uses a helper function `preOrder` to recursively traverse the tree
     * and add the values of the nodes to a result list.<br>
     * <br>
     * Time Complexity: O(n) - where n is the number of nodes in the tree. Each node is visited once.<br>
     * Space Complexity: O(n) - for the result list. The recursion stack space is O(h), where h is the height of the tree.<br>
     * <br>
     * @param root the root node of the binary tree
     * @return a list of integers representing the values of the nodes in preorder
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        return preOrder(root, result);
    }

    /**
     *  Helper method
     * @param node TreeNode
     * @param result result
     * @return end
     */
    private List<Integer> preOrder(TreeNode node, List<Integer> result) {
        if (node == null) return result;

        result.add(node.val);         // Visit the current node
        preOrder(node.left, result);  // Traverse the left subtree
        preOrder(node.right, result); // Traverse the right subtree

        return result;
    }
}
