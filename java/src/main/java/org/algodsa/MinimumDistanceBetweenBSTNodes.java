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

public class MinimumDistanceBetweenBSTNodes {
    // Variable to store the minimum difference between any two nodes
    int minDiff = Integer.MAX_VALUE;

    // Variable to keep track of the value of the previously visited node in inorder traversal
    Integer prev = null;

    /**
     * <h4><a href="https://leetcode.com/problems/minimum-distance-between-bst-nodes/description/">Minimum Distance Between BST Nodes</a></h4>
     * Finds the minimum difference between any two nodes in a Binary Search Tree (BST).<br>
     * The function performs an inorder traversal, comparing adjacent nodes to find the minimum difference.<br>
     * <br>
     * @param root the root of the binary search tree
     * @return the minimum difference between any two node values in the BST
     * <br>
     * Time Complexity: O(n), where n is the number of nodes in the tree. Each node is visited once.<br>
     * Space Complexity: O(h), where h is the height of the tree, due to recursion stack space.<br>
     */
    public int minDiffInBST(TreeNode root) {
        // Start the inorder traversal
        inorder(root);
        // Return the minimum difference found
        return minDiff;
    }

    /**
     * Helper method to perform an inorder traversal of the tree.<br>
     * During the traversal, it calculates the minimum difference between the current node value
     * and the previously visited node value (stored in `prev`).<br>
     * <br>
     * @param node the current node being visited in the traversal
     */
    public void inorder(TreeNode node) {
        // Base case: if the node is null, return (end recursion)
        if (node == null) return;

        // Traverse the left subtree
        inorder(node.left);

        // Process the current node by comparing its value with the previous node's value
        if (prev != null) {
            // Update minDiff with the minimum difference found so far
            minDiff = Math.min(minDiff, Math.abs(node.val - prev));
        }
        // Update prev to the current node's value for future comparisons
        prev = node.val;

        // Traverse the right subtree
        inorder(node.right);
    }
}
