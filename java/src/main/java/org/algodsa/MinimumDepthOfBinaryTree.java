package main.java.org.algodsa;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Minimum Depth of Binary Tree
 */
public class MinimumDepthOfBinaryTree {
    /**
     * Constructor
     */
    public MinimumDepthOfBinaryTree(){}

    /**
     * <h4><a href="https://leetcode.com/problems/minimum-depth-of-binary-tree/">Minimum Depth of Binary Tree</a></h4><br>
     * Finds the minimum depth of a binary tree.<br>
     * <br>
     * The minimum depth is defined as the number of nodes along the shortest path
     * from the root node down to the nearest leaf node. A leaf node is a node with no children.<br>
     * <br>
     * @param root the root node of the binary tree
     * @return the minimum depth of the binary tree
     * <br>
     * Time Complexity: O(n) - where n is the number of nodes in the tree. Each node is visited once. <br>
     * Space Complexity: O(n) - for the queue used in the breadth-first search.<br>
     */
    public static int minDepth(TreeNode root) {
        // If the tree is empty, the depth is 0
        if (root == null) return 0;

        // Queue for BFS traversal
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int minDepth = 0;

        // Perform a breadth-first search (BFS) to find the minimum depth
        while (!queue.isEmpty()) {
            int size = queue.size();
            minDepth++;
            for (int i = 0; i < size; i++) {
                // Get the current node from the queue
                TreeNode node = queue.poll();

                // If this node is a leaf node (no children), return the current depth
                assert node != null;
                if (node.left == null && node.right == null) return minDepth;

                // Add the left and right children to the queue for further exploration
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
        }

        return minDepth;
    }
}
