package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.TreeNode;
import main.java.org.algodsa.UniqueBinarySearchTreesII;
import org.junit.jupiter.api.Test;
import java.util.List;

public class UniqueBinarySearchTreesIITest {

    @Test
    public void testEmptyInput() {
        UniqueBinarySearchTreesII generator = new UniqueBinarySearchTreesII();
        List<TreeNode> trees = generator.generateTrees(0);
        assertNotNull(trees, "The result should not be null for n=0.");
        assertEquals(0, trees.size(), "There should be no trees for n=0.");
    }

    @Test
    public void testSingleNode() {
        UniqueBinarySearchTreesII generator = new UniqueBinarySearchTreesII();
        List<TreeNode> trees = generator.generateTrees(1);
        assertNotNull(trees, "The result should not be null for n=1.");
        assertEquals(1, trees.size(), "There should be one tree for n=1.");
        assertEquals(1, trees.get(0).val, "The single tree should have a root value of 1.");
        assertNull(trees.get(0).left, "The single tree should not have a left child.");
        assertNull(trees.get(0).right, "The single tree should not have a right child.");
    }

    @Test
    public void testTwoNodes() {
        UniqueBinarySearchTreesII generator = new UniqueBinarySearchTreesII();
        List<TreeNode> trees = generator.generateTrees(2);
        assertNotNull(trees, "The result should not be null for n=2.");
        assertEquals(2, trees.size(), "There should be two unique trees for n=2.");

        // Expected trees:
        // Tree 1: Root=1, Right=2
        // Tree 2: Root=2, Left=1
        TreeNode tree1 = trees.get(0);
        assertEquals(1, tree1.val, "First tree should have root value 1.");
        assertNull(tree1.left, "First tree should not have a left child.");
        assertNotNull(tree1.right, "First tree should have a right child.");
        assertEquals(2, tree1.right.val, "The right child of the first tree should have value 2.");

        TreeNode tree2 = trees.get(1);
        assertEquals(2, tree2.val, "Second tree should have root value 2.");
        assertNull(tree2.right, "Second tree should not have a right child.");
        assertNotNull(tree2.left, "Second tree should have a left child.");
        assertEquals(1, tree2.left.val, "The left child of the second tree should have value 1.");
    }

    @Test
    public void testThreeNodes() {
        UniqueBinarySearchTreesII generator = new UniqueBinarySearchTreesII();
        List<TreeNode> trees = generator.generateTrees(3);
        assertNotNull(trees, "The result should not be null for n=3.");
        assertEquals(5, trees.size(), "There should be five unique trees for n=3.");
    }

    @Test
    public void testStructureForThreeNodes() {
        UniqueBinarySearchTreesII generator = new UniqueBinarySearchTreesII();
        List<TreeNode> trees = generator.generateTrees(3);

        // Expected tree structures:
        // Tree 1: Root=1, Right=(2 -> 3)
        // Tree 2: Root=1, Right=3, Left of 3=2
        // Tree 3: Root=2, Left=1, Right=3
        // Tree 4: Root=3, Left=(1 -> 2)
        // Tree 5: Root=3, Left=2, Left of 2=1

        assertEquals(1, trees.get(0).val);
        assertEquals(3, trees.get(4).val);
    }
}
