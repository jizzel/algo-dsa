package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.TreeNode;
import main.java.org.algodsa.ValidateBinarySearchTree;
import org.junit.jupiter.api.Test;

public class ValidateBinarySearchTreeTest {

    @Test
    public void testEmptyTree() {
        ValidateBinarySearchTree validator = new ValidateBinarySearchTree();
        assertTrue(validator.isValidBST(null), "An empty tree is a valid BST.");
    }

    @Test
    public void testSingleNodeTree() {
        ValidateBinarySearchTree validator = new ValidateBinarySearchTree();
        TreeNode root = new TreeNode(10);
        assertTrue(validator.isValidBST(root), "A single-node tree is a valid BST.");
    }

    @Test
    public void testValidBST() {
        ValidateBinarySearchTree validator = new ValidateBinarySearchTree();
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(12);
        root.right.right = new TreeNode(20);

        assertTrue(validator.isValidBST(root), "The tree is a valid BST.");
    }

    @Test
    public void testInvalidBSTWithLeftChildGreaterThanRoot() {
        ValidateBinarySearchTree validator = new ValidateBinarySearchTree();
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(15);
        root.right = new TreeNode(20);

        assertFalse(validator.isValidBST(root), "The tree is not a valid BST because the left child is greater than the root.");
    }

    @Test
    public void testInvalidBSTWithRightChildLessThanRoot() {
        ValidateBinarySearchTree validator = new ValidateBinarySearchTree();
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(7);

        assertFalse(validator.isValidBST(root), "The tree is not a valid BST because the right child is less than the root.");
    }

    @Test
    public void testInvalidBSTWithSubtreeViolation() {
        ValidateBinarySearchTree validator = new ValidateBinarySearchTree();
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.right = new TreeNode(12); // Violates the BST property

        assertFalse(validator.isValidBST(root), "The tree is not a valid BST due to a subtree violation.");
    }

    @Test
    public void testValidBSTWithLargeValues() {
        ValidateBinarySearchTree validator = new ValidateBinarySearchTree();
        TreeNode root = new TreeNode(Integer.MAX_VALUE - 1);
        root.left = new TreeNode(Integer.MAX_VALUE - 2);
        root.right = new TreeNode(Integer.MAX_VALUE);

        assertTrue(validator.isValidBST(root), "The tree with large values is a valid BST.");
    }

    @Test
    public void testValidBSTWithNegativeValues() {
        ValidateBinarySearchTree validator = new ValidateBinarySearchTree();
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(-20);
        root.right = new TreeNode(0);
        root.left.left = new TreeNode(-30);
        root.left.right = new TreeNode(-15);

        assertTrue(validator.isValidBST(root), "The tree with negative values is a valid BST.");
    }
}
