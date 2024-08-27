package test.java.org.algodsa;

import main.java.org.algodsa.BinaryTree;
import main.java.org.algodsa.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class BinaryTreeTest {
    private BinaryTree binaryTree;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        // Initialize the tree
        binaryTree = new BinaryTree();

        // Set up a simple tree structure
        //        1
        //       / \
        //      2   3
        //     / \ / \
        //    4  5 6  7
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        binaryTree.root = root;

        // Capture system output for testing purposes
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void testPrintPreOrder() {
        // Expected output for Pre-Order traversal: "1 2 4 5 3"
        binaryTree.printPreOrder(binaryTree.root);
        assertEquals("1\n2\n4\n5\n3\n6\n7\n", outputStreamCaptor.toString());
    }

    @Test
    void testPrintInOrder() {
        // Expected output for In-Order traversal: "4 2 5 1 3"
        binaryTree.printInOrder(binaryTree.root);
        assertEquals("4\n2\n5\n1\n6\n3\n7\n", outputStreamCaptor.toString());
    }

    @Test
    void testPrintPostOrder() {
        // Expected output for Post-Order traversal: "4 5 2 3 1"
        binaryTree.printPostOrder(binaryTree.root);
        assertEquals("4\n5\n2\n6\n7\n3\n1\n", outputStreamCaptor.toString());
    }

    @Test
    void testEmptyTreeTraversal() {
        // Create an empty tree and attempt to traverse it
        BinaryTree emptyTree = new BinaryTree();

        // Test Pre-Order traversal on an empty tree (should output nothing)
        emptyTree.printPreOrder(emptyTree.root);
        assertEquals("", outputStreamCaptor.toString());

        // Test In-Order traversal on an empty tree (should output nothing)
        emptyTree.printInOrder(emptyTree.root);
        assertEquals("", outputStreamCaptor.toString());

        // Test Post-Order traversal on an empty tree (should output nothing)
        emptyTree.printPostOrder(emptyTree.root);
        assertEquals("", outputStreamCaptor.toString());
    }
}

