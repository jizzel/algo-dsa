package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.FlattenBinaryTreeToLinkedList;
import main.java.org.algodsa.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FlattenBinaryTreeToLinkedListTest {
    private FlattenBinaryTreeToLinkedList flattener;

    @BeforeEach
    public void setUp() {
        flattener = new FlattenBinaryTreeToLinkedList();
    }

    @Test
    public void testFlattenEmptyTree() {
        // Test case 1: Empty tree
        flattener.flatten(null);
        assertNull(null, "Flattening an empty tree should yield null");
    }

    @Test
    public void testFlattenSingleNode() {
        // Test case 2: Single node tree
        TreeNode root = new TreeNode(1);
        flattener.flatten(root);
        assertEquals(1, root.val);
        assertNull(root.left);
        assertNull(root.right);
    }

    @Test
    public void testFlattenBalancedTree() {
        // Test case 3: Balanced binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        flattener.flatten(root);

        // Verify the flattened tree
        assertEquals(1, root.val);
        assertNull(root.left);
        assertEquals(2, root.right.val);
        assertNull(root.right.left);
        assertEquals(3, root.right.right.val);
        assertNull(root.right.right.left);
        assertNull(root.right.right.right);
    }

    @Test
    public void testFlattenUnbalancedTree() {
        // Test case 4: Unbalanced binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.right = new TreeNode(4);
        flattener.flatten(root);

        // Verify the flattened tree
        assertEquals(1, root.val);
        assertNull(root.left);
        assertEquals(2, root.right.val);
        assertNull(root.right.left);
        assertEquals(3, root.right.right.val);
        assertNull(root.right.right.left);
        assertEquals(4, root.right.right.right.val);
        assertNull(root.right.right.right.left);
        assertNull(root.right.right.right.right);
    }

    @Test
    public void testFlattenTreeWithMultipleLevels() {
        // Test case 5: More complex tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);
        flattener.flatten(root);

        // Verify the flattened tree
        assertEquals(1, root.val);
        assertNull(root.left);
        assertEquals(2, root.right.val);
        assertNull(root.right.left);
        assertEquals(3, root.right.right.val);
        assertNull(root.right.right.left);
        assertEquals(4, root.right.right.right.val);
        assertNull(root.right.right.right.left);
        assertEquals(5, root.right.right.right.right.val);
        assertNull(root.right.right.right.right.left);
        assertEquals(6, root.right.right.right.right.right.val);
        assertNull(root.right.right.right.right.right.left);
        assertNull(root.right.right.right.right.right.right);
    }
}