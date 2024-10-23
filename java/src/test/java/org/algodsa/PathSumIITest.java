package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.PathSumII;
import main.java.org.algodsa.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class PathSumIITest {

    private PathSumII solution;

    @BeforeEach
    public void setUp() {
        solution = new PathSumII();
    }

    @Test
    public void testPathSum_MultiplePaths() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);

        List<List<Integer>> result = solution.pathSum(root, 22);

        assertEquals(2, result.size());
        assertTrue(result.contains(List.of(5, 4, 11, 2)));
        assertTrue(result.contains(List.of(5, 8, 4, 5)));
    }

    @Test
    public void testPathSum_NoPaths() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        List<List<Integer>> result = solution.pathSum(root, 5);

        assertTrue(result.isEmpty()); // No path exists with sum 5
    }

    @Test
    public void testPathSum_SinglePath() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        List<List<Integer>> result = solution.pathSum(root, 3);

        assertEquals(1, result.size());
        assertTrue(result.contains(List.of(1, 2))); // Only one path with sum 3
    }

    @Test
    public void testPathSum_SingleNode_ValidPath() {
        TreeNode root = new TreeNode(5);

        List<List<Integer>> result = solution.pathSum(root, 5);

        assertEquals(1, result.size());
        assertTrue(result.contains(List.of(5))); // Single node, valid path
    }

    @Test
    public void testPathSum_SingleNode_InvalidPath() {
        TreeNode root = new TreeNode(5);

        List<List<Integer>> result = solution.pathSum(root, 10);

        assertTrue(result.isEmpty()); // Single node, no valid path for sum 10
    }

    @Test
    public void testPathSum_EmptyTree() {
        TreeNode root = null;

        List<List<Integer>> result = solution.pathSum(root, 0);

        assertTrue(result.isEmpty()); // Empty tree should return an empty list
    }

    @Test
    public void testPathSum_DuplicateValues() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.right.right = new TreeNode(3);

        List<List<Integer>> result = solution.pathSum(root, 6);

        assertEquals(2, result.size());
        assertTrue(result.contains(List.of(1, 2, 3)));
        assertTrue(result.contains(List.of(1, 2, 3))); // Two paths with same values
    }
}