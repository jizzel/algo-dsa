package main.java.org.algodsa;

import java.util.*;

/**
 * Kth Largest Sum In A Binary Tree
 */
public class KthLargestSumInABinaryTree {
    /**
     * Constructor
     */
    public KthLargestSumInABinaryTree(){}

    /**
     * <h4><a href="https://leetcode.com/problems/kth-largest-sum-in-a-binary-tree/description/">Kth Largest Sum in a Binary Tree</a></h4>
     * Returns the k-th largest level sum in a binary tree.<br>
     * <br>
     * This method performs a level-order traversal of the binary tree to compute the sum of
     * node values at each level. The sums are then sorted in descending order, and the
     * k-th largest sum is returned.<br>
     * <br>
     * Time Complexity: O(n log n) - where n is the number of levels in the tree, primarily due to sorting.<br>
     * Space Complexity: O(n) - for storing the sums of the levels.<br>
     * <br>
     * @param root the root node of the binary tree
     * @param k the position of the largest level sum to return (1-based index)
     * @return the k-th largest level sum, or -1 if k is out of bounds
     */
    public long kthLargestLevelSum(TreeNode root, int k) {
        // Declare a list to store the level sums
        List<Long> result = new ArrayList<>();

        // Perform level-order traversal and sum node values at each level
        doLevelOrder(root, result);

        // Sort the sums in descending order
        result.sort(Collections.reverseOrder());

        // Return the k-th largest sum if within bounds
        if (k > result.size()) return -1;

        return result.get(k - 1);
    }

    /**
     * Helper method to perform a level-order traversal and calculate the sum of node values at each level.<br>
     * <br>
     * This method uses a queue to traverse the tree level by level, summing the node values
     * at each level and storing the sum in the provided list.<br>
     * <br>
     * @param root the root node of the binary tree
     * @param array the list to store the sum of node values at each level
     */
    public void doLevelOrder(TreeNode root, List<Long> array) {
        if (root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        // Perform level-order traversal
        while (!queue.isEmpty()) {
            int size = queue.size();
            long sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node != null) {
                    sum += node.val;

                    if (node.left != null) queue.add(node.left);
                    if (node.right != null) queue.add(node.right);
                }
            }
            array.add(sum);
        }
    }
}
