package test.java.org.algodsa;

import main.java.org.algodsa.KthLargestSumInABinaryTree;
import main.java.org.algodsa.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static test.java.org.algodsa.SolutionTest.setUp;

class KthLargestSumInABinaryTreeTest {
    KthLargestSumInABinaryTree solution = new KthLargestSumInABinaryTree();

    @Test
    void testKthLargestLevelSum_singleNode() {
        TreeNode root = new TreeNode(5);
        assertEquals(5, solution.kthLargestLevelSum(root, 1));
    }

    @Test
    void testKthLargestLevelSum_skewedTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);

        // Level sums: [1, 2, 3, 4]
        assertEquals(4, solution.kthLargestLevelSum(root, 1));
        assertEquals(3, solution.kthLargestLevelSum(root, 2));
        assertEquals(2, solution.kthLargestLevelSum(root, 3));
        assertEquals(1, solution.kthLargestLevelSum(root, 4));
    }

    @Test
    void testKthLargestLevelSum_kOutOfBounds() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);

        // Level sums: [10, 50]
        assertEquals(50, solution.kthLargestLevelSum(root, 1));
        assertEquals(10, solution.kthLargestLevelSum(root, 2));
        assertEquals(-1, solution.kthLargestLevelSum(root, 3)); // k is out of bounds
    }

    @Test
    void testKthLargestLevelSum_emptyTree() {
        assertEquals(-1, solution.kthLargestLevelSum(null, 1));
    }

    @Test
    void testDoLevelOrder_multipleLevels() {
        TreeNode root = setUp();

        List<Long> result = new ArrayList<>();
        solution.doLevelOrder(root, result);

        // Expected sums: [1, 5, 22]
        assertEquals(List.of(1L, 5L, 22L), result);
    }

    @Test
    void testKthLargestLevelSum_completeTree() {
        TreeNode root = setUp();

        // Level sums: [1, 5, 22]
        assertEquals(22, solution.kthLargestLevelSum(root, 1));
        assertEquals(5, solution.kthLargestLevelSum(root, 2));
        assertEquals(1, solution.kthLargestLevelSum(root, 3));
    }

}