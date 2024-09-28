package test.java.org.algodsa;

import main.java.org.algodsa.BinaryTreePreorderTraversal;
import main.java.org.algodsa.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreePreorderTraversalTest {
    TreeNode root = SolutionTest.setUp();
    BinaryTreePreorderTraversal solution = new BinaryTreePreorderTraversal();
    @Test
    public void testPreorderTraversal() {
        List<Integer> expected = Arrays.asList(1, 2, 4, 5, 3, 6, 7);
        List<Integer> actual = solution.preorderTraversal(root);
        assertEquals(expected, actual);
    }
}