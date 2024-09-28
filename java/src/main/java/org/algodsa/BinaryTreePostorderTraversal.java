package main.java.org.algodsa;

import java.util.ArrayList;
import java.util.List;

/**
 * Binary Tree PostOrder
 */
public class BinaryTreePostorderTraversal {
    /**
     * Constructor
     */
    public BinaryTreePostorderTraversal(){}

    /**
     * <h4><a href="https://leetcode.com/problems/binary-tree-postorder-traversal/description/">Binary Tree Postorder Traversal</a></h4>
     * Performs a postorder traversal on a binary tree.<br>
     * <br>
     * In postorder traversal, the nodes are recursively visited in this order:<br>
     * 1. Traverse the left subtree.<br>
     * 2. Traverse the right subtree.<br>
     * 3. Visit the current node.<br>
     * <br>
     * The method uses a helper function `postOrder` to recursively traverse the tree
     * and add the values of the nodes to a result list.<br>
     * <br>
     * Time Complexity: O(n) - where n is the number of nodes in the tree. Each node is visited once.
     * Space Complexity: O(n) - for the result list. The recursion stack space is O(h), where h is the height of the tree.
     *
     * @param root the root node of the binary tree
     * @return a list of integers representing the values of the nodes in postorder
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        return postOrder(root, result);
    }

    /**
     * Helper method
     * @param node TreeNode
     * @param result result
     * @return end
     */
    private List<Integer> postOrder(TreeNode node, List<Integer> result) {
        if (node == null) return result;

        postOrder(node.left, result);  // Traverse the left subtree
        postOrder(node.right, result); // Traverse the right subtree
        result.add(node.val);          // Visit the current node

        return result;
    }
}
