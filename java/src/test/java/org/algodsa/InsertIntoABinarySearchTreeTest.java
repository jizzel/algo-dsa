package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.InsertIntoABinarySearchTree;
import main.java.org.algodsa.TreeNode;
import org.junit.jupiter.api.Test;

public class InsertIntoABinarySearchTreeTest {

    private final InsertIntoABinarySearchTree solution = new InsertIntoABinarySearchTree();

    public TreeNode setUp() {
        // Create the following BST:
        //        4
        //      /   \
        //     2     7
        //    / \
        //   1   3
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        return root;
    }

    @Test
    public void testInsertIntoBST_InsertIntoEmptyTree() {
        // Test inserting into an empty tree
        TreeNode newTree = solution.insertIntoBST(null, 5);

        // Expected tree:
        //    5
        assertNotNull(newTree);
        assertEquals(5, newTree.val);
        assertNull(newTree.left);
        assertNull(newTree.right);
    }

    @Test
    public void testInsertIntoBST_InsertToTheLeft() {
        TreeNode root = setUp();
        // Insert value 0 into the BST
        root = solution.insertIntoBST(root, 0);

        // Expected tree:
        //        4
        //      /   \
        //     2     7
        //    / \
        //   1   3
        //  /
        // 0
        assertNotNull(root.left.left.left);
        assertEquals(0, root.left.left.left.val);
    }

    @Test
    public void testInsertIntoBST_InsertToTheRight() {
        TreeNode root = setUp();
        // Insert value 5 into the BST
        root = solution.insertIntoBST(root, 5);

        // Expected tree:
        //        4
        //      /   \
        //     2     7
        //    / \   /
        //   1   3 5
        assertNotNull(root.right.left);
        assertEquals(5, root.right.left.val);
    }

    @Test
    public void testInsertIntoBST_InsertDuplicateValue() {
        TreeNode root = setUp();
        // Insert value 4 (which already exists)
        root = solution.insertIntoBST(root, 4);

        // Since 4 is already present, the tree should remain unchanged
        assertEquals(4, root.val);
        assertEquals(2, root.left.val);
        assertEquals(7, root.right.val);
        assertEquals(1, root.left.left.val);
        assertEquals(3, root.left.right.val);
        assertNull(root.left.left.left);
    }
}
