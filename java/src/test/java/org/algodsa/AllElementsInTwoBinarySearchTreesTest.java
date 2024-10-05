package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.AllElementsInTwoBinarySearchTrees;
import main.java.org.algodsa.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

public class AllElementsInTwoBinarySearchTreesTest {

    private AllElementsInTwoBinarySearchTrees solution;
    private TreeNode root1;
    private TreeNode root2;

    @BeforeEach
    public void setUp() {
        solution = new AllElementsInTwoBinarySearchTrees();

        // Tree 1:
        //    2
        //   / \
        //  1   4
        root1 = new TreeNode(2);
        root1.left = new TreeNode(1);
        root1.right = new TreeNode(4);

        // Tree 2:
        //    1
        //   / \
        //  0   3
        root2 = new TreeNode(1);
        root2.left = new TreeNode(0);
        root2.right = new TreeNode(3);
    }

    @Test
    public void testGetAllElements() {
        List<Integer> result = solution.getAllElements(root1, root2);
        List<Integer> expected = List.of(0, 1, 1, 2, 3, 4);
        assertEquals(expected, result);
    }

    @Test
    public void testGetAllElementsSecondApproach() {
        List<Integer> result = solution.getAllElements2(root1, root2);
        List<Integer> expected = List.of(0, 1, 1, 2, 3, 4);
        assertEquals(expected, result);
    }

    @Test
    public void testGetAllElements_EmptyTree1() {
        root1 = null;
        List<Integer> result = solution.getAllElements(root1, root2);
        List<Integer> expected = List.of(0, 1, 3);
        assertEquals(expected, result);
    }

    @Test
    public void testGetAllElements_EmptyTree2() {
        root2 = null;
        List<Integer> result = solution.getAllElements(root1, root2);
        List<Integer> expected = List.of(1, 2, 4);
        assertEquals(expected, result);
    }

    @Test
    public void testGetAllElements_BothEmpty() {
        root1 = null;
        root2 = null;
        List<Integer> result = solution.getAllElements(root1, root2);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testGetAllElements_SingleElementTrees() {
        root1 = new TreeNode(5);
        root2 = new TreeNode(6);
        List<Integer> result = solution.getAllElements(root1, root2);
        List<Integer> expected = List.of(5, 6);
        assertEquals(expected, result);
    }
}
