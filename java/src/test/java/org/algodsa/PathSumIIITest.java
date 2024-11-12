package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.PathSumIII;
import main.java.org.algodsa.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

public class PathSumIIITest {

    private TreeNode createTree(Integer... values) {
        if (values.length == 0 || values[0] == null) return null;
        TreeNode root = new TreeNode(values[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;
        while (i < values.length) {
            TreeNode node = queue.poll();
            if (values[i] != null) {
                assert node != null;
                node.left = new TreeNode(values[i]);
                queue.offer(node.left);
            }
            i++;
            if (i < values.length && values[i] != null) {
                assert node != null;
                node.right = new TreeNode(values[i]);
                queue.offer(node.right);
            }
            i++;
        }
        return root;
    }

    @Test
    public void testPathSumMultiplePaths() {
        PathSumIII solution = new PathSumIII();
        TreeNode root = createTree(10, 5, -3, 3, 2, null, 11, 3, -2, null, 1);
        int targetSum = 8;
        int result = solution.pathSum(root, targetSum);
        int result2 = solution.pathSum2(root, targetSum);
        assertEquals(3, result, "The number of paths summing to 8 should be 3.");
        assertEquals(3, result2, "The number of paths summing to 8 should be 3.");
    }

    @Test
    public void testPathSumSinglePath() {
        PathSumIII solution = new PathSumIII();
        TreeNode root = createTree(1, 2, 3);
        int targetSum = 3;
        int result = solution.pathSum(root, targetSum);
        assertEquals(2, result, "The number of paths summing to 3 should be 2.");
    }

    @Test
    public void testPathSumNoPaths() {
        PathSumIII solution = new PathSumIII();
        TreeNode root = createTree(1, -2, -3);
        int targetSum = 5;
        int result = solution.pathSum(root, targetSum);
        assertEquals(0, result, "The number of paths summing to 5 should be 0.");
    }

    @Test
    public void testPathSumEmptyTree() {
        PathSumIII solution = new PathSumIII();
        int targetSum = 8;
        int result = solution.pathSum(null, targetSum);
        assertEquals(0, result, "An empty tree should have 0 paths.");
    }

    @Test
    public void testPathSumWithNegativeValues() {
        PathSumIII solution = new PathSumIII();
        TreeNode root = createTree(1, -2, -3, 4, 5, -2, null, 1, null, null, -1);
        int targetSum = -1;
        int result = solution.pathSum(root, targetSum);
        assertEquals(2, result, "The number of paths summing to -1 should be 2.");
    }
}
