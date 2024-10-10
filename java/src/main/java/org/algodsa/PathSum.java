package main.java.org.algodsa;

/**
 * Class to determine if a binary tree has a root-to-leaf path that sums to a specified value.
 */
public class PathSum {
    /**
     * Constructor
     */
    public PathSum(){}

    /**
     * <h4><a href="https://leetcode.com/problems/path-sum/description/">112. Path Sum</a></h4>
     * <br>
     * Determines if the binary tree has a root-to-leaf path such that the sum of the values along the path
     * equals the given target sum.<br>
     * <br>
     * Time Complexity: O(n), where n is the number of nodes in the binary tree.
     * Each node is visited once to calculate the sum.
     * <br>
     * Space Complexity: O(h), where h is the height of the binary tree.
     * In the worst case (unbalanced tree), the recursion depth can go up to h.<br>
     * <br>
     * @param root the root node of the binary tree
     * @param targetSum the target sum to check for a path
     * @return true if there is a root-to-leaf path with the sum equal to targetSum, false otherwise
     */
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        // If the node is a leaf, check if the current sum equals the target sum
        if (root.left == null && root.right == null) return root.val == targetSum;

        // Recursively check left and right subtrees
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}

