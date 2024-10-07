package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.TreeNode;
import main.java.org.algodsa.TrimABinarySearchTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TrimABinarySearchTreeTest {

    private TrimABinarySearchTree solution;
    private TreeNode root;

    @BeforeEach
    public void setUp() {
        solution = new TrimABinarySearchTree();

        // BST structure:
        //     3
        //    / \
        //   0   4
        //    \
        //     2
        //    /
        //   1
        root = new TreeNode(3);
        root.left = new TreeNode(0);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(1);
        root.right = new TreeNode(4);
    }

    @Test
    public void testTrimBST_NormalCase() {
        // Trim the tree with range [1, 3]
        TreeNode result = solution.trimBST(root, 1, 3);

        // Expected trimmed tree:
        //     3
        //    /
        //   2
        //  /
        // 1
        assertNotNull(result);
        assertEquals(3, result.val);
        assertEquals(2, result.left.val);
        assertEquals(1, result.left.left.val);
        assertNull(result.right);
    }

    @Test
    public void testTrimBST_EntireTreeWithinRange() {
        // Trim the tree with range [0, 4] (entire tree should remain)
        TreeNode result = solution.trimBST(root, 0, 4);

        // The tree should remain the same
        assertNotNull(result);
        assertEquals(3, result.val);
        assertEquals(0, result.left.val);
        assertEquals(4, result.right.val);
    }

    @Test
    public void testTrimBST_AllOutOfRange() {
        // Trim the tree with range [5, 6] (no node should remain)
        TreeNode result = solution.trimBST(root, 5, 6);

        // Expected trimmed tree: null
        assertNull(result);
    }

    @Test
    public void testTrimBST_SingleNodeTree() {
        // Test with a single node
        TreeNode singleNode = new TreeNode(1);
        TreeNode result = solution.trimBST(singleNode, 1, 1);

        // The tree should remain the same
        assertNotNull(result);
        assertEquals(1, result.val);
    }

    @Test
    public void testTrimBST_LowerBoundExceeded() {
        // Trim the tree with range [2, 4]
        TreeNode result = solution.trimBST(root, 2, 4);

        // Expected trimmed tree:
        //     3
        //    / \
        //   2   4
        assertNotNull(result);
        assertEquals(3, result.val);
        assertEquals(2, result.left.val);
        assertEquals(4, result.right.val);
        assertNull(result.left.left);
    }
}
