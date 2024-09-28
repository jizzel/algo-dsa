package test.java.org.algodsa;

import main.java.org.algodsa.BinaryTreeInorderTraversal;
import main.java.org.algodsa.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeInorderTraversalTest {
    TreeNode root = SolutionTest.setUp();
    BinaryTreeInorderTraversal solution = new BinaryTreeInorderTraversal();

    @Test
    public void testInorderTraversal() {
        List<Integer> expected = Arrays.asList(4, 2, 5, 1, 6, 3, 7);
        List<Integer> actual = solution.inorderTraversal(root);
        assertEquals(expected, actual);
    }

}