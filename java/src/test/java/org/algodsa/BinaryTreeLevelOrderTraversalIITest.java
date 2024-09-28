package test.java.org.algodsa;

import main.java.org.algodsa.BinaryTreeLevelOrderTraversalII;
import main.java.org.algodsa.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeLevelOrderTraversalIITest {
    TreeNode root = SolutionTest.setUp();
    BinaryTreeLevelOrderTraversalII solution = new BinaryTreeLevelOrderTraversalII();

    @Test
    public void testLevelOrderBottom() {
        // Expected output: [[4, 5, 6, 7], [2, 3], [1]]
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(4, 5, 6, 7),
                Arrays.asList(2, 3),
                List.of(1)
        );

        List<List<Integer>> actual = solution.levelOrderBottom(root);
        assertEquals(expected, actual);
    }

    @Test
    public void testLevelOrderBottomWithEmptyTree() {
        // Expected output: []
        List<List<Integer>> expected = List.of();

        List<List<Integer>> actual = solution.levelOrderBottom(null);
        assertEquals(expected, actual);
    }

    @Test
    public void testLevelOrderBottomWithUnbalancedTree() {
        // Unbalanced tree:
        //       1
        //        \
        //         2
        //          \
        //           3

        root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);

        // Expected output: [[3], [2], [1]]
        List<List<Integer>> expected = Arrays.asList(
                List.of(3),
                List.of(2),
                List.of(1)
        );

        List<List<Integer>> actual = solution.levelOrderBottom(root);
        assertEquals(expected, actual);
    }

    @Test
    public void testLevelOrderBottomWithSingleNode() {
        // Tree with only one node
        root = new TreeNode(1);

        // Expected output: [[1]]
        List<List<Integer>> expected = List.of(
                List.of(1)
        );

        List<List<Integer>> actual = solution.levelOrderBottom(root);
        assertEquals(expected, actual);
    }

}