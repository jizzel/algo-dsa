package main.java.org.algodsa;

import java.util.ArrayList;
import java.util.List;

/**
 * This class provides a method to generate all structurally unique BSTs (binary search trees)
 * that store values from 1 to n.
 */
public class UniqueBinarySearchTreesII {

    /**
     * Constructor for UniqueBinarySearchTreesII.
     */
    public UniqueBinarySearchTreesII() {}

    /**
     * <h4><a href="https://leetcode.com/problems/unique-binary-search-trees-ii/description/">95. Unique Binary Search Trees II</a></h4>
     * <br>
     * Generates all unique binary search trees (BSTs) that store values from 1 to n.
     * <br>
     * Time complexity: Catalan number-based complexity.
     * The time complexity is approximately O(4^n / sqrt(n)) due to the generation of Catalan numbers.
     * <br>
     * Space complexity: O(4^n / sqrt(n)) for the resulting list of trees and recursion stack.
     * The recursion depth and intermediate storage of trees contribute to this complexity.
     * <br>
     * @param n the number of nodes in the BSTs.
     * @return a list of all structurally unique BSTs storing values from 1 to n.
     */
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) return new ArrayList<>();
        return generateSubtrees(1, n);
    }

    /**
     * Recursively generates all unique BSTs for the given range [start, end].
     * <br>
     * @param start the starting value of the range.
     * @param end   the ending value of the range.
     * @return a list of unique BSTs for the given range.
     */
    private List<TreeNode> generateSubtrees(int start, int end) {
        List<TreeNode> trees = new ArrayList<>();
        if (start > end) {
            trees.add(null); // Base case: empty tree
            return trees;
        }

        // Iterate through all possible root values
        for (int i = start; i <= end; i++) {
            // Generate all possible left and right subtrees
            List<TreeNode> leftSubtree = generateSubtrees(start, i - 1);
            List<TreeNode> rightSubtree = generateSubtrees(i + 1, end);

            // Combine each left and right subtree with the current root
            for (TreeNode left : leftSubtree) {
                for (TreeNode right : rightSubtree) {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    trees.add(root);
                }
            }
        }

        return trees;
    }
}
