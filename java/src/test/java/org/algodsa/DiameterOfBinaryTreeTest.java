package test.java.org.algodsa;

import main.java.org.algodsa.DiameterOfBinaryTree;
import main.java.org.algodsa.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static test.java.org.algodsa.SolutionTest.setUp;

class DiameterOfBinaryTreeTest {
    DiameterOfBinaryTree solution = new DiameterOfBinaryTree();

    @Test
    public void testDiameterOfBinaryTree() {
        TreeNode root = setUp();

        // Test the diameter of the binary tree
        int diameter = solution.diameterOfBinaryTree(root);

        // The diameter is the longest path between any two nodes, which is 4 in this case:
        // Path: 4 -> 2 -> 1 -> 3 -> 7
        assertEquals(4, diameter);
    }
}