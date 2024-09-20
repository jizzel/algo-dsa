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
public class RangeSumOfBST {

    /**
     * Constructor
     */
    public RangeSumOfBST(){}
    /**
     * <h4><a href="https://leetcode.com/problems/range-sum-of-bst/description/">Range Sum of BST</a></h4>
     * This method calculates the sum of values of all nodes with a value in the range [low, high]
     * in a binary search tree (BST).<br>
     * <br>
     * The algorithm recursively explores the tree, adding the node's value to the sum if it is
     * within the given range and only traverses relevant branches.<br>
     * <br>
     * @param root the root of the binary search tree
     * @param low the lower bound of the range
     * @param high the upper bound of the range
     * @return the sum of all values in the range [low, high]
     */
    public int rangeSumBST(TreeNode root, int low, int high) {
        // Base case: if the current node is null, return 0
        if (root == null) return 0;

        int rangeSum = 0;

        // If the current node's value is within the range, add it to the sum
        if (root.val >= low && root.val <= high) rangeSum += root.val;

        // If the current node's value is greater than the lower bound, check the left subtree
        if (root.val > low) rangeSum += rangeSumBST(root.left, low, high);

        // If the current node's value is less than the upper bound, check the right subtree
        if (root.val < high) rangeSum += rangeSumBST(root.right, low, high);

        // Return the cumulative sum for this subtree
        return rangeSum;
    }
}

