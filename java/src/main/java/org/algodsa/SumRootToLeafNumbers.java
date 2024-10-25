package main.java.org.algodsa;

/**
 * Class to calculate the sum of all numbers formed from root to leaf paths in a binary tree.
 * Each path from the root to a leaf forms a number by appending each node's value from root to leaf.
 */
public class SumRootToLeafNumbers {
    /**
     * Constructor
     */
    public SumRootToLeafNumbers(){}

    /**
     * <h4><a href="https://leetcode.com/problems/sum-root-to-leaf-numbers/">129. Sum Root to Leaf Numbers</a></h4>
     * <br>
     * Calculates the sum of all root-to-leaf numbers in the binary tree.
     * Each path forms a number by appending each node's value as digits from root to leaf.<br>
     * <br>
     * Time Complexity: O(n), where n is the number of nodes in the tree, as each node is visited once.<br>
     * Space Complexity: O(h), where h is the height of the tree, due to recursive call stack space.<br>
     * <br>
     * @param root the root of the binary tree
     * @return the sum of all numbers formed from root to leaf paths
     */
    public int sumNumbers(TreeNode root) {
        return sumNumbers(root, 0);
    }

    /**
     * Recursive helper method to calculate the sum of all root-to-leaf numbers.
     * <br>
     * @param root the current node in the binary tree
     * @param num the number formed so far on the current path
     * @return the sum of all numbers formed from the current node to leaf nodes
     */
    private int sumNumbers(TreeNode root, int num) {
        if (root == null) return 0;

        num = num * 10 + root.val;

        // If it's a leaf node, return the current number
        if (root.left == null && root.right == null) return num;

        // Otherwise, recursively calculate the sum for both subtrees
        return sumNumbers(root.left, num) + sumNumbers(root.right, num);
    }
}
