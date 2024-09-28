package main.java.org.algodsa;

import java.util.ArrayList;
import java.util.List;

/**
 * Binary Tree Inorder
 */
public class BinaryTreeInorderTraversal {
    /**
     * Constructor
     */
    public BinaryTreeInorderTraversal(){}

    /**
     * <h4><a href="https://leetcode.com/problems/binary-tree-inorder-traversal/description/">Binary Tree Inorder Traversal</a></h4>
     * Performs an inorder traversal on a binary tree.<br>
     * <br>
     * In inorder traversal, the nodes are recursively visited in this order:<br>
     * 1. Traverse the left subtree.<br>
     * 2. Visit the current node.<br>
     * 3. Traverse the right subtree.<br>
     * <br>
     * The method uses a helper function `inorder` to recursively traverse the tree
     * and add the values of the nodes to a result list.<br>
     * <br>
     * Time Complexity: O(n) - where n is the number of nodes in the tree. Each node is visited once.<br>
     * Space Complexity: O(n) - for the result list. The recursion stack space is O(h), where h is the height of the tree.<br>
     * <br>
     * @param root the root node of the binary tree
     * @return a list of integers representing the values of the nodes in inorder
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        return inorder(root, result);
    }

    /**
     * Helper method
     * @param node TreeNode
     * @param res result
     * @return end
     */
    private List<Integer> inorder(TreeNode node, List<Integer> res) {
        if (node == null) return res;

        inorder(node.left, res);  // Traverse the left subtree
        res.add(node.val);        // Visit the current node
        inorder(node.right, res); // Traverse the right subtree

        return res;
    }
}
