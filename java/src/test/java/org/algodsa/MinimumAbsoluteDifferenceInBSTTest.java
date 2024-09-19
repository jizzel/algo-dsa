package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.MinimumAbsoluteDifferenceInBST;
import main.java.org.algodsa.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MinimumAbsoluteDifferenceInBSTTest {

    private MinimumAbsoluteDifferenceInBST solution;
    private TreeNode root;

    @BeforeEach
    public void setUp() {
        solution = new MinimumAbsoluteDifferenceInBST();

        // Create the tree:
        //      4
        //     / \
        //    2   6
        //   / \
        //  1   3
        root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
    }

    @Test
    public void testGetMinimumDifference() {
        // Test case: Calculate minimum difference
        int result = solution.getMinimumDifference(root);
        assertEquals(1, result, "The minimum absolute difference in the tree should be 1");
    }

    @Test
    public void testGetMinimumDifference_singleNode() {
        // Test case: A tree with a single node should return Integer.MAX_VALUE as there is no pair
        TreeNode singleNode = new TreeNode(5);
        int result = solution.getMinimumDifference(singleNode);
        assertEquals(Integer.MAX_VALUE, result, "The result should be Integer.MAX_VALUE for a single node tree");
    }

    @Test
    public void testGetMinimumDifference_largeTree() {
        // Test case: A larger tree with more nodes
        TreeNode largeRoot = MinimumDistanceBetweenBSTNodesTest.createBST();

        int result = solution.getMinimumDifference(largeRoot);
        assertEquals(2, result, "The minimum absolute difference in the large tree should be 2");
    }
}
