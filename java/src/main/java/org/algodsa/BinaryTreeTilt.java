package main.java.org.algodsa;

/**
 * Binary Tree Tilt
 */
public class BinaryTreeTilt {
    /**
     * Constructor
     */
    public BinaryTreeTilt(){}

    /**
     * <h4><a href="https://leetcode.com/problems/binary-tree-tilt/">Binary Tree Tilt</a></h4>
     * Finds the tilt of a binary tree. The tilt of a tree node is the absolute difference
     * between the sum of all left subtree node values and the sum of all right subtree node values.<br>
     * The tilt of the whole tree is the sum of all node tilts.<br>
     * <br>
     * @param root the root of the binary tree
     * @return the total tilt of the binary tree
     * <br>
     * Time Complexity: O(n) - where n is the number of nodes in the tree.<br>
     * Space Complexity: O(n) - due to the recursive call stack.<br>
     */
    public int findTilt(TreeNode root) {
        int[] totalTilt = new int[1];  // Use an array to store the cumulative tilt across recursive calls
        postorderSum(root, totalTilt); // Calculate the sum of all subtrees and update the tilt
        return totalTilt[0];           // Return the cumulative tilt
    }

    /**
     * Helper method to perform a postorder traversal and calculate the sum of the subtree rooted at the given node.
     * At each node, the tilt is calculated and added to the total tilt.<br>
     * <br>
     * @param node the current node being processed
     * @param totalTilt the cumulative tilt being updated
     * @return the sum of all node values in the subtree rooted at the given node
     */
    private int postorderSum(TreeNode node, int[] totalTilt) {
        if (node == null) return 0;  // Base case: null node has sum 0

        // Recursively calculate the sum of the left and right subtrees
        int leftSum = postorderSum(node.left, totalTilt);
        int rightSum = postorderSum(node.right, totalTilt);

        // Tilt of the current node is the absolute difference between left and right subtree sums
        totalTilt[0] += Math.abs(leftSum - rightSum);

        // Return the sum of the current node's value plus its left and right subtree sums
        return node.val + leftSum + rightSum;
    }
}
