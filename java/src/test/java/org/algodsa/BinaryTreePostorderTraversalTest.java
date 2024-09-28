package test.java.org.algodsa;

import main.java.org.algodsa.BinaryTreePostorderTraversal;
import main.java.org.algodsa.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreePostorderTraversalTest {
    TreeNode root = SolutionTest.setUp();

    @Test
    public void testPostorderTraversal() {
        BinaryTreePostorderTraversal solution = new BinaryTreePostorderTraversal();
        List<Integer> expected = Arrays.asList(4, 5, 2, 6, 7, 3, 1);
        List<Integer> actual = solution.postorderTraversal(root);
        assertEquals(expected, actual);
    }

}