package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.MinimumDistanceBetweenBSTNodes;
import main.java.org.algodsa.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MinimumDistanceBetweenBSTNodesTest {

    private final MinimumDistanceBetweenBSTNodes solution = new MinimumDistanceBetweenBSTNodes();
    private TreeNode root;

    @BeforeEach
    public void setUp() {

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
    public void testMinDiffInBST() {
        // Test case: Calculate the minimum difference
        int result = solution.minDiffInBST(root);
        assertEquals(1, result, "The minimum absolute difference in the tree should be 1");
    }

    @Test
    public void testMinDiffInBST_singleNode() {
        // Test case: A tree with a single node should return Integer.MAX_VALUE as there is no pair
        TreeNode singleNode = new TreeNode(5);
        int result = solution.minDiffInBST(singleNode);
        assertEquals(Integer.MAX_VALUE, result, "The result should be Integer.MAX_VALUE for a single-node tree");
    }

    @Test
    public void testMinDiffInBST_largeTree() {
        // Test case: A larger tree with more nodes
        TreeNode largeRoot = createBST();

        int result = solution.minDiffInBST(largeRoot);
        assertEquals(2, result, "The minimum absolute difference in the large tree should be 2");
    }

    static TreeNode createBST() {
        TreeNode largeRoot = new TreeNode(10);
        largeRoot.left = new TreeNode(5);
        largeRoot.right = new TreeNode(15);
        largeRoot.left.left = new TreeNode(3);
        largeRoot.left.right = new TreeNode(7);
        largeRoot.right.left = new TreeNode(12);
        largeRoot.right.right = new TreeNode(18);
        return largeRoot;
    }
}
