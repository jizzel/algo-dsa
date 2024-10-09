package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.BinaryTreePaths;
import main.java.org.algodsa.TreeNode;
import org.junit.jupiter.api.Test;
import java.util.List;

public class BinaryTreePathsTest {

    private final BinaryTreePaths solution = new BinaryTreePaths();

    @Test
    public void testBinaryTreePaths_SingleNode() {
        TreeNode root = new TreeNode(1);
        List<String> expected = List.of("1");
        List<String> result = solution.binaryTreePaths(root);
        assertEquals(expected, result, "For a single node tree, the path should just be the value of the node.");
    }

    @Test
    public void testBinaryTreePaths_CompleteTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);

        List<String> expected = List.of("1->2->5", "1->3");
        List<String> result = solution.binaryTreePaths(root);
        assertEquals(expected, result, "The binary tree paths should be calculated correctly for a complete tree.");
    }

    @Test
    public void testBinaryTreePaths_LeftHeavyTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);

        List<String> expected = List.of("1->2->3->4");
        List<String> result = solution.binaryTreePaths(root);
        assertEquals(expected, result, "For a left-heavy tree, the path should follow the left side of the tree.");
    }

    @Test
    public void testBinaryTreePaths_RightHeavyTree() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);

        List<String> expected = List.of("1->2->3->4");
        List<String> result = solution.binaryTreePaths(root);
        assertEquals(expected, result, "For a right-heavy tree, the path should follow the right side of the tree.");
    }
}
