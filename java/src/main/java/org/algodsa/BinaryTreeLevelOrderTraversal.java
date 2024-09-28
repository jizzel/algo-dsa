package main.java.org.algodsa;

import java.util.ArrayList;
import java.util.List;

/**
 * Binary Tree LevelOrder
 */
public class BinaryTreeLevelOrderTraversal {
    /**
     * Constructor
     */
    public BinaryTreeLevelOrderTraversal(){}

    /**
     * <h4><a href="https://leetcode.com/problems/binary-tree-level-order-traversal/description/">Binary Tree Level Order Traversal</a></h4>
     * Performs a level-order traversal (also known as breadth-first traversal) on a binary tree.<br>
     * <br>
     * Level-order traversal visits nodes level by level, from left to right. This method
     * constructs a list of lists where each inner list contains the values of nodes at a specific level
     * of the tree.<br>
     * <br>
     * The method uses two helper functions:<br>
     * 1. `getTreeHeight` to determine the height of the tree.<br>
     * 2. `getLevelOrder` to collect nodes at a specific level.<br>
     * <br>
     * Time Complexity: O(n) - where n is the number of nodes in the tree. Each node is visited once.<br>
     * Space Complexity: O(n) - for storing the result list and the recursion stack space.<br>
     * <br>
     * @param root the root node of the binary tree
     * @return a list of lists, where each inner list contains the values of nodes at that level
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        // Get the height of the tree
        int height = getTreeHeight(root);

        // Traverse each level
        for (int level = 0; level < height; level++) {
            List<Integer> levelNodes = new ArrayList<>();
            getLevelOrder(root, level, levelNodes);
            if (!levelNodes.isEmpty()) {
                result.add(levelNodes);
            }
        }

        return result;
    }

    /**
     * Helper method to collect nodes at a specific level.<br>
     * <br>
     * This method recursively traverses the tree to collect nodes at a given level.<br>
     * <br>
     * @param root the current node in the binary tree
     * @param stepsRemaining the remaining levels to traverse
     * @param list the list to which node values at the current level will be added
     */
    private void getLevelOrder(TreeNode root, int stepsRemaining, List<Integer> list) {
        if (root == null) return;

        if (stepsRemaining == 0) {
            list.add(root.val); // Add node value to list
            return;
        }

        // Recur for left and right children with decremented level
        getLevelOrder(root.left, stepsRemaining - 1, list);
        getLevelOrder(root.right, stepsRemaining - 1, list);
    }

    /**
     * Helper method to calculate the height of the tree.<br>
     * <br>
     * The height of a binary tree is the length of the longest path from the root to a leaf.<br>
     * <br>
     * @param root the root node of the binary tree
     * @return the height of the tree
     */
    private int getTreeHeight(TreeNode root) {
        if (root == null) return 0;

        // Get the height of left and right subtrees
        int lHeight = getTreeHeight(root.left);
        int rHeight = getTreeHeight(root.right);

        // The height of the tree is the maximum height of the subtrees plus one for the current node
        return Math.max(lHeight, rHeight) + 1;
    }
}
