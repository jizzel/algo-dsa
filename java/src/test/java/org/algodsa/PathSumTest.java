package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.PathSum;
import main.java.org.algodsa.TreeNode;
import org.junit.jupiter.api.Test;

public class PathSumTest {

    private final PathSum solution = new PathSum();

    @Test
    public void testHasPathSum_SingleNodeEqualsTarget() {
        TreeNode root = new TreeNode(5);
        assertTrue(solution.hasPathSum(root, 5), "Single node value equals target sum.");
    }

    @Test
    public void testHasPathSum_SingleNodeNotEqualsTarget() {
        TreeNode root = new TreeNode(1);
        assertFalse(solution.hasPathSum(root, 5), "Single node value does not equal target sum.");
    }

    @Test
    public void testHasPathSum_PathExists() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        assertTrue(solution.hasPathSum(root, 22), "There exists a path sum that equals the target.");
    }

    @Test
    public void testHasPathSum_NoPathExists() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        assertFalse(solution.hasPathSum(root, 5), "No path sum equals the target.");
    }

    @Test
    public void testHasPathSum_EmptyTree() {
        assertFalse(solution.hasPathSum(null, 5), "An empty tree should return false.");
    }

    @Test
    public void testHasPathSum_MultiplePaths() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        assertTrue(solution.hasPathSum(root, 7), "Multiple paths exist, and one of them sums to the target.");
        assertFalse(solution.hasPathSum(root, 11), "None of the paths sum to the target.");
    }
}
