package main.java.org.algodsa;

import java.util.HashMap;
import java.util.Map;

/**
 * This class provides a method to calculate the number of unique ways to climb a staircase with a given
 * number of steps, where you can climb either 1 or 2 steps at a time.
 */
public class ClimbingStairs {

    /**
     * Constructor
     */
    public ClimbingStairs() {}

    private final Map<Integer, Integer> cache = new HashMap<>();

    /**
     * <h4><a href="https://leetcode.com/problems/climbing-stairs/">70. Climbing Stairs</a></h4>
     * <br>
     * Calculates the number of unique ways to reach the top of a staircase with `n` steps.
     * Uses memoization to store results for previously computed values to optimize performance.
     * <br>
     * Time complexity: O(n)
     * Space complexity: O(n)
     * <br>
     * The time complexity is O(n) because each unique sub-problem (step) is calculated only once.
     * The space complexity is O(n) due to the recursion stack and HashMap for memoization.
     * <br>
     * @param n the number of steps in the staircase
     * @return the number of unique ways to climb the staircase
     */
    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        if (cache.containsKey(n)) return cache.get(n);

        int result = climbStairs(n - 1) + climbStairs(n - 2);
        cache.put(n, result);

        return result;
    }
}