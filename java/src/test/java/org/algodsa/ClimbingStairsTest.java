package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.ClimbingStairs;
import org.junit.jupiter.api.Test;

public class ClimbingStairsTest {

    @Test
    public void testClimbStairsBaseCases() {
        ClimbingStairs solution = new ClimbingStairs();
        assertEquals(1, solution.climbStairs(1), "There is only 1 way to climb 1 stair.");
        assertEquals(2, solution.climbStairs(2), "There are 2 ways to climb 2 stairs.");
    }

    @Test
    public void testClimbStairsSmallN() {
        ClimbingStairs solution = new ClimbingStairs();
        assertEquals(3, solution.climbStairs(3), "There are 3 ways to climb 3 stairs.");
        assertEquals(5, solution.climbStairs(4), "There are 5 ways to climb 4 stairs.");
        assertEquals(8, solution.climbStairs(5), "There are 8 ways to climb 5 stairs.");
    }

    @Test
    public void testClimbStairsMediumN() {
        ClimbingStairs solution = new ClimbingStairs();
        assertEquals(21, solution.climbStairs(7), "There are 21 ways to climb 7 stairs.");
        assertEquals(34, solution.climbStairs(8), "There are 34 ways to climb 8 stairs.");
    }

    @Test
    public void testClimbStairsLargeN() {
        ClimbingStairs solution = new ClimbingStairs();
        assertEquals(377, solution.climbStairs(13), "There are 233 ways to climb 13 stairs.");
        assertEquals(987, solution.climbStairs(15), "There are 610 ways to climb 15 stairs.");
    }

    @Test
    public void testClimbStairsEdgeCase() {
        ClimbingStairs solution = new ClimbingStairs();
        assertEquals(1, solution.climbStairs(1), "Edge case: climbing 1 stair should return 1.");
    }
}