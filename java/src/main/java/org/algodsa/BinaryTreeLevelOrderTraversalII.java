package main.java.org.algodsa;

import java.util.*;

/**
 * Binary Tree LevelOrder
 */
public class BinaryTreeLevelOrderTraversalII {
    /**
     * Constructor
     */
    public BinaryTreeLevelOrderTraversalII(){}

    /**
     * <h4><a href="https://leetcode.com/problems/binary-tree-level-order-traversal-ii/description/">Binary Tree Level Order Traversal II</a></h4>
     * Performs a level-order traversal of a binary tree and returns the node values
     * level-by-level from bottom to top.<br>
     * <br>
     * This method uses a queue to traverse the tree level by level, collecting the values
     * at each level and storing them in a list of lists. Finally, the result is reversed
     * so that levels are ordered from bottom to top.<br>
     * <br>
     * Time Complexity: O(n) - where n is the number of nodes in the tree. Each node is visited once.<br>
     * Space Complexity: O(n) - for storing the result list and the queue.<br>
     *
     * @param root the root node of the binary tree
     * @return a list of lists, where each inner list contains the values of nodes at that level, ordered from bottom to top
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        // Define the return variable
        List<List<Integer>> result = new ArrayList<>();

        // Safety check
        if (root == null) return result;

        // Declare a queue and add the root node
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        // Perform level-order traversal
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> subResult = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                if(node != null) {
                    subResult.add(node.val);
                    if (node.left != null) queue.add(node.left);
                    if (node.right != null) queue.add(node.right);
                }
            }

            result.add(subResult);
        }

        // Reverse the result to get bottom-to-top order
        Collections.reverse(result);
        return result;
    }
}
