package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import main.java.org.algodsa.BinaryTreeMaximumPathSum;
import main.java.org.algodsa.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeMaximumPathSumTest {

    private final BinaryTreeMaximumPathSum pathSumCalculator = new BinaryTreeMaximumPathSum();

    private TreeNode createTree(Integer... values) {
        // Helper to create a binary tree from an array of Integer values using level-order.
        if (values.length == 0 || values[0] == null) return null;
        TreeNode root = new TreeNode(values[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (!queue.isEmpty() && i < values.length) {
            TreeNode current = queue.poll();
            if (values[i] != null) {
                current.left = new TreeNode(values[i]);
                queue.add(current.left);
            }
            i++;
            if (i < values.length && values[i] != null) {
                current.right = new TreeNode(values[i]);
                queue.add(current.right);
            }
            i++;
        }
        return root;
    }

    @Test
    public void testMaxPathSumSingleNode() {
        TreeNode root = new TreeNode(5);
        assertEquals(5, pathSumCalculator.maxPathSum(root), "Single node tree should return the node's value as the max path sum");
    }

    @Test
    public void testMaxPathSumNegativeNodes() {
        TreeNode root = createTree(-10, 9, 20, null, null, 15, 7);
        assert root != null;
        assertEquals(42, pathSumCalculator.maxPathSum(root), "Should handle trees with negative nodes and compute correct max path sum");
    }

    @Test
    public void testMaxPathSumMixedValues() {
        TreeNode root = createTree(2, -1);
        assert root != null;
        assertEquals(2, pathSumCalculator.maxPathSum(root), "Should compute max path sum with mixed positive and negative values");
    }

    @Test
    public void testMaxPathSumOnlyNegativeValues() {
        TreeNode root = createTree(-3, -2, -4);
        assert root != null;
        assertEquals(-2, pathSumCalculator.maxPathSum(root), "Should return highest single node value in case all are negative");
    }

    @Test
    public void testMaxPathSumLargerTree() {
        TreeNode root = createTree(1, 2, 3, 4, 5, 6, 7);
        assert root != null;
        assertEquals(18, pathSumCalculator.maxPathSum(root), "Should compute correct max path sum for larger balanced tree");
    }

    @Test
    public void testMaxPathSumComplexTree() {
        TreeNode root = createTree(10, 2, 10, 20, 1, -25, null, null, null, 3, 4);
        assert root != null;
        assertEquals(42, pathSumCalculator.maxPathSum(root), "Should compute correct max path sum in complex tree with negative and positive values");
    }
}
