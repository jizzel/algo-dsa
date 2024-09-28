package test.java.org.algodsa;

import main.java.org.algodsa.InvertBinaryTree;
import main.java.org.algodsa.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static test.java.org.algodsa.SolutionTest.setUp;

class InvertBinaryTreeTest {
    InvertBinaryTree solution = new InvertBinaryTree();

    @Test
    public void testInvertTree() {
        TreeNode root = setUp();
        // Invert the tree
        TreeNode invertedRoot = solution.invertTree(root);

        // Check the root is still the same
        assertEquals(1, invertedRoot.val);

        // Check if left and right children of the root are swapped
        assertEquals(3, invertedRoot.left.val);
        assertEquals(2, invertedRoot.right.val);

        // Check if the left subtree of root (which was originally 3) is also inverted
        assertEquals(7, invertedRoot.left.left.val);  // originally right child of 3
        assertEquals(6, invertedRoot.left.right.val); // originally left child of 3

        // Check if the right subtree of root (which was originally 2) is also inverted
        assertEquals(5, invertedRoot.right.left.val); // originally right child of 2
        assertEquals(4, invertedRoot.right.right.val); // originally left child of 2
    }

}