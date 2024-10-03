package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.DeleteNodeInABST;
import main.java.org.algodsa.TreeNode;
import org.junit.jupiter.api.Test;

public class DeleteNodeInABSTTest {

    DeleteNodeInABST solution = new DeleteNodeInABST();;
    TreeNode root = SolutionTest.setUp2();

    @Test
    public void testDeleteNode_KeyExists() {
        // Test deleting a node with value 3 (which has two children)
        root = solution.deleteNode(root, 3);

        // Expected tree:
        //        5
        //      /   \
        //     4     6
        //    /       \
        //   2         7

        assertEquals(5, root.val);
        assertEquals(4, root.left.val);
        assertEquals(2, root.left.left.val);
        assertNull(root.left.right);
        assertEquals(6, root.right.val);
        assertEquals(7, root.right.right.val);
    }

    @Test
    public void testDeleteNode_LeafNode() {
        // Test deleting a leaf node with value 7
        root = solution.deleteNode(root, 7);

        // Expected tree:
        //        5
        //      /   \
        //     3     6
        //    / \
        //   2   4

        assertEquals(5, root.val);
        assertEquals(6, root.right.val);
        assertNull(root.right.right);
    }

    @Test
    public void testDeleteNode_NodeWithOneChild() {
        // Test deleting a node with value 6 (which has only one child)
        root = solution.deleteNode(root, 6);

        // Expected tree:
        //        5
        //      /   \
        //     3     7
        //    / \
        //   2   4

        assertEquals(5, root.val);
        assertEquals(7, root.right.val);
        assertNull(root.right.right);
    }

    @Test
    public void testDeleteNode_RootNode() {
        // Test deleting the root node (which has two children)
        root = solution.deleteNode(root, 5);

        // Expected tree (successor 6 becomes the new root):
        //        6
        //      /   \
        //     3     7
        //    / \
        //   2   4

        assertEquals(6, root.val);
        assertEquals(3, root.left.val);
        assertEquals(7, root.right.val);
    }

    @Test
    public void testDeleteNode_KeyDoesNotExist() {
        // Test deleting a node that doesn't exist in the tree (value 8)
        root = solution.deleteNode(root, 8);

        // Expected tree remains unchanged:
        //        5
        //      /   \
        //     3     6
        //    / \     \
        //   2   4     7

        assertEquals(5, root.val);
        assertEquals(3, root.left.val);
        assertEquals(6, root.right.val);
        assertEquals(2, root.left.left.val);
        assertEquals(4, root.left.right.val);
        assertEquals(7, root.right.right.val);
    }
}
