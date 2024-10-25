package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.SumRootToLeafNumbers;
import main.java.org.algodsa.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumRootToLeafNumbersTest {

    private SumRootToLeafNumbers solution;

    @BeforeEach
    public void setUp() {
        solution = new SumRootToLeafNumbers();
    }

    @Test
    public void testSingleRootNode() {
        TreeNode root = new TreeNode(5);
        assertEquals(5, solution.sumNumbers(root)); // Single node with value 5, expected sum is 5
    }

    @Test
    public void testCompleteBinaryTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        assertEquals(25, solution.sumNumbers(root)); // Paths: 12 + 13 = 25
    }

    @Test
    public void testLeftHeavyTree() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(9);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(1);
        root.right = new TreeNode(0);
        assertEquals(1026, solution.sumNumbers(root)); // Paths: 495 + 491 + 40 = 1026
    }

    @Test
    public void testRightHeavyTree() {
        TreeNode root = new TreeNode(3);
        root.right = new TreeNode(8);
        root.right.right = new TreeNode(5);
        assertEquals(385, solution.sumNumbers(root)); // Only path: 385
    }

    @Test
    public void testNullRoot() {
        assertEquals(0, solution.sumNumbers(null)); // No nodes, expected sum is 0
    }

    @Test
    public void testMixedTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        assertEquals(385, solution.sumNumbers(root)); // Paths: 124 + 125 + 136 = 385
    }
}
