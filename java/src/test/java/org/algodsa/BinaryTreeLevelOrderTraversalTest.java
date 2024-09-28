package test.java.org.algodsa;

import main.java.org.algodsa.BinaryTreeLevelOrderTraversal;
import main.java.org.algodsa.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static test.java.org.algodsa.SolutionTest.setUp;

class BinaryTreeLevelOrderTraversalTest {
    BinaryTreeLevelOrderTraversal solution = new BinaryTreeLevelOrderTraversal();

    @Test
    void testLevelOrder() {
        // Test case 1: Empty tree
        assertEquals(new ArrayList<>(), solution.levelOrder(null));

        // Test case 2: Single-node tree
        TreeNode root2 = new TreeNode(1);
        List<List<Integer>> expected2 = List.of(
                List.of(1)
        );
        assertEquals(expected2, solution.levelOrder(root2));

        // Test case 3: Complete binary tree
        TreeNode root3 = setUp();
        List<List<Integer>> expected3 = Arrays.asList(
                List.of(1),
                Arrays.asList(2, 3),
                Arrays.asList(4, 5, 6, 7)
        );
        assertEquals(expected3, solution.levelOrder(root3));

        // Test case 4: Skewed tree (left-heavy)
        TreeNode root4 = new TreeNode(1);
        root4.left = new TreeNode(2);
        root4.left.left = new TreeNode(3);
        root4.left.left.left = new TreeNode(4);
        List<List<Integer>> expected4 = Arrays.asList(
                List.of(1),
                List.of(2),
                List.of(3),
                List.of(4)
        );
        assertEquals(expected4, solution.levelOrder(root4));

        // Test case 5: Tree with multiple levels and mixed branching
        TreeNode root5 = new TreeNode(1);
        root5.left = new TreeNode(2);
        root5.right = new TreeNode(3);
        root5.left.right = new TreeNode(4);
        root5.right.left = new TreeNode(5);
        root5.right.right = new TreeNode(6);
        List<List<Integer>> expected5 = Arrays.asList(
                List.of(1),
                Arrays.asList(2, 3),
                Arrays.asList(4, 5, 6)
        );
        assertEquals(expected5, solution.levelOrder(root5));
    }
}