package main.java.org.algodsa;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

public class MinimumAbsoluteDifferenceInBST {
    // Variable to store the minimum absolute difference
    int minDiff = Integer.MAX_VALUE;

    // Variable to store the value of the previously visited node during inorder traversal
    Integer prev = null;

    /**
     * Constructor
     */
    public MinimumAbsoluteDifferenceInBST(){}

    /**
     * <h4><a href="https://leetcode.com/problems/minimum-absolute-difference-in-bst/description/">Minimum Absolute Difference in BST</a></h4>
     * Finds the minimum absolute difference between any two node values in a Binary Search Tree (BST).<br>
     * The function performs an inorder traversal to compare adjacent nodes in sorted order (property of BST).<br>
     * <br>
     * @param root the root of the binary search tree
     * @return the minimum absolute difference between the values of any two nodes
     * <br>
     * Time Complexity: O(n), where n is the number of nodes in the tree. Each node is visited once.<br>
     * Space Complexity: O(h), where h is the height of the tree. This is the space used by the recursive call stack.<br>
     */
    public int getMinimumDifference(TreeNode root) {
        inorder(root);  // Start the inorder traversal
        return minDiff; // Return the minimum difference found
    }

    /**
     * Performs an inorder traversal of the tree. During the traversal, it calculates the minimum absolute
     * difference between the current node value and the value of the previously visited node (stored in `prev`).<br>
     * <br>
     * @param node the current node being visited in the traversal
     */
    public void inorder(TreeNode node) {
        // Base case: if the current node is null, return
        if (node == null) return;

        // Traverse the left subtree
        inorder(node.left);

        // Process the current node
        if (prev != null) {
            // Calculate the absolute difference between the current node and the previous node
            minDiff = Math.min(minDiff, Math.abs(prev - node.val));
        }
        // Update prev to be the current node's value
        prev = node.val;

        // Traverse the right subtree
        inorder(node.right);
    }
}

