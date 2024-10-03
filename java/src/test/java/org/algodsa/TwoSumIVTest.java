package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.TreeNode;
import main.java.org.algodsa.TwoSumIV;
import org.junit.jupiter.api.Test;

public class TwoSumIVTest {

    TwoSumIV solution = new TwoSumIV();;
    TreeNode root = SolutionTest.setUp2();

    @Test
    public void testFindTarget_withTarget9() {
        // Test case: Should find target 9 (5 + 4)
        assertTrue(solution.findTarget(root, 9), "The tree should contain two elements summing to 9");
    }

    @Test
    public void testFindTarget_withTarget28() {
        // Test case: Should not find target 28 (no two elements sum to 28)
        assertFalse(solution.findTarget(root, 28), "The tree should not contain two elements summing to 28");
    }

    @Test
    public void testFindTarget_withTarget6() {
        // Test case: Should find target 6 (2 + 4)
        assertTrue(solution.findTarget(root, 6), "The tree should contain two elements summing to 6");
    }

    @Test
    public void testFindTarget_withTarget13() {
        // Test case: Should find target 13 (6 + 7)
        assertTrue(solution.findTarget(root, 13), "The tree should contain two elements summing to 13");
    }

    @Test
    public void testFindTarget_withTarget15() {
        // Test case: Should not find target 15 (no two elements sum to 15)
        assertFalse(solution.findTarget(root, 15), "The tree should not contain two elements summing to 15");
    }
}