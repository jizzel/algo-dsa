package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.RangeSumOfBST;
import main.java.org.algodsa.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RangeSumOfBSTTest {

    private final RangeSumOfBST solution = new RangeSumOfBST();
    private TreeNode root;

    @BeforeEach
    public void setUp() {

        // Create the tree:
        //      10
        //     /  \
        //    5   15
        //   / \    \
        //  3   7   18
        root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(18);
    }

    @Test
    public void testRangeSumBST_inRange() {
        // Test case 1: sum between 7 and 15
        int result = solution.rangeSumBST(root, 7, 15);
        assertEquals(32, result, "The sum of nodes between 7 and 15 should be 32 (7 + 10 + 15)");
    }

    @Test
    public void testRangeSumBST_entireTree() {
        // Test case 2: sum of the entire tree between 3 and 18
        int result = solution.rangeSumBST(root, 3, 18);
        assertEquals(58, result, "The sum of the entire tree should be 58 (3 + 5 + 7 + 10 + 15 + 18)");
    }

    @Test
    public void testRangeSumBST_singleValue() {
        // Test case 3: only one value in range (10)
        int result = solution.rangeSumBST(root, 10, 10);
        assertEquals(10, result, "The sum of nodes between 10 and 10 should be 10");
    }

    @Test
    public void testRangeSumBST_noNodesInRange() {
        // Test case 4: no nodes in the range
        int result = solution.rangeSumBST(root, 20, 30);
        assertEquals(0, result, "There should be no nodes in the range 20-30, so the sum should be 0");
    }

    @Test
    public void testRangeSumBST_partialOverlap() {
        // Test case 5: only part of the tree is in range (e.g., 6 to 10)
        int result = solution.rangeSumBST(root, 6, 10);
        assertEquals(17, result, "The sum of nodes between 6 and 10 should be 17 (7 + 10)");
    }
}