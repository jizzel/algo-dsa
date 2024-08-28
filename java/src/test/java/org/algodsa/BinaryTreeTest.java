package test.java.org.algodsa;

import main.java.org.algodsa.BinaryTree;
import main.java.org.algodsa.Solution;
import main.java.org.algodsa.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

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

    @Test
    public void testPreorderTraversal() {
        List<Integer> expected = Arrays.asList(1, 2, 4, 5, 3, 6, 7);
        List<Integer> actual = Solution.preorderTraversal(binaryTree.root);
        assertEquals(expected, actual);
    }

    @Test
    public void testInorderTraversal() {
        List<Integer> expected = Arrays.asList(4, 2, 5, 1, 6, 3, 7);
        List<Integer> actual = Solution.inorderTraversal(binaryTree.root);
        assertEquals(expected, actual);
    }

    @Test
    public void testPostorderTraversal() {
        List<Integer> expected = Arrays.asList(4, 5, 2, 6, 7, 3, 1);
        List<Integer> actual = Solution.postorderTraversal(binaryTree.root);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetTreeHeight() {
        int height = binaryTree.getTreeHeight(binaryTree.root);
        assertEquals(3, height);  // The tree height should be 3
    }

    @Test
    public void testPrintLevelOrder() {

        // Capture the output of printLevelOrder
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        binaryTree.printLevelOrder(binaryTree.root);

        String expectedOutput = "1\n2\n3\n4\n5\n6\n7\n";
        assertEquals(expectedOutput, outContent.toString());

        // Reset System.out
        System.setOut(System.out);
    }

    @Test
    public void testPrintLevelOrderEfficient() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        binaryTree.printLevelOrderEfficient(binaryTree.root);

        String expectedOutput = "1\n2\n3\n4\n5\n6\n7\n";
        assertEquals(expectedOutput, outContent.toString());

        // Reset System.out
        System.setOut(System.out);
    }

    @Test
    public void testLevelOrderBottom() {
        // Expected output: [[4, 5, 6, 7], [2, 3], [1]]
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(4, 5, 6, 7),
                Arrays.asList(2, 3),
                Arrays.asList(1)
        );

        List<List<Integer>> actual = Solution.levelOrderBottom(binaryTree.root);
        assertEquals(expected, actual);
    }

    @Test
    public void testLevelOrderBottomWithEmptyTree() {
        // Tree is empty (root is null)
        binaryTree.root = null;

        // Expected output: []
        List<List<Integer>> expected = Arrays.asList();

        List<List<Integer>> actual = Solution.levelOrderBottom(binaryTree.root);
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

        binaryTree.root = new TreeNode(1);
        binaryTree.root.right = new TreeNode(2);
        binaryTree.root.right.right = new TreeNode(3);

        // Expected output: [[3], [2], [1]]
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(3),
                Arrays.asList(2),
                Arrays.asList(1)
        );

        List<List<Integer>> actual = Solution.levelOrderBottom(binaryTree.root);
        assertEquals(expected, actual);
    }

    @Test
    public void testLevelOrderBottomWithSingleNode() {
        // Tree with only one node
        binaryTree.root = new TreeNode(1);

        // Expected output: [[1]]
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(1)
        );

        List<List<Integer>> actual = Solution.levelOrderBottom(binaryTree.root);
        assertEquals(expected, actual);
    }
}

