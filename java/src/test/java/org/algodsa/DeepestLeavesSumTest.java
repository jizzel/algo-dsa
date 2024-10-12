package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.DeepestLeavesSum;
import main.java.org.algodsa.TreeNode;
import org.junit.jupiter.api.Test;

public class DeepestLeavesSumTest {

    @Test
    public void testDeepestLeavesSum_BasicCase() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.left.left.left = new TreeNode(7);
        root.right.right.right = new TreeNode(8);

        DeepestLeavesSum solution = new DeepestLeavesSum();
        assertEquals(15, solution.deepestLeavesSum(root)); // Leaves at the deepest level are [7, 8], sum = 15
    }

    @Test
    public void testDeepestLeavesSum_SingleNode() {
        TreeNode root = new TreeNode(10);

        DeepestLeavesSum solution = new DeepestLeavesSum();
        assertEquals(10, solution.deepestLeavesSum(root)); // Only one node, which is also the deepest
    }

    @Test
    public void testDeepestLeavesSum_AllLeavesAtSameLevel() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        DeepestLeavesSum solution = new DeepestLeavesSum();
        assertEquals(22, solution.deepestLeavesSum(root)); // Deepest leaves are [4, 5, 6, 7], sum = 22
        assertEquals(22, solution.deepestLeavesSum2(root)); // Deepest leaves are [4, 5, 6, 7], sum = 22
    }

    @Test
    public void testDeepestLeavesSum_LeftSkewedTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);

        DeepestLeavesSum solution = new DeepestLeavesSum();
        assertEquals(4, solution.deepestLeavesSum(root)); // Only one deepest leaf, which is node 4
    }

    @Test
    public void testDeepestLeavesSum_RightSkewedTree() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);

        DeepestLeavesSum solution = new DeepestLeavesSum();
        assertEquals(4, solution.deepestLeavesSum(root)); // Only one deepest leaf, which is node 4
    }
}
