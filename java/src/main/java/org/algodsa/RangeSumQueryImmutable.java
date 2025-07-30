package main.java.org.algodsa;

/**
 * The {@code RangeSumQueryImmutable} class allows efficient range sum queries
 * on an immutable array using prefix sums.
 */
public class RangeSumQueryImmutable {
    private int[] prefix;

    /**
     * Constructs the prefix sum array for the input array {@code nums}.
     * <br>
     * Time Complexity: O(n)
     *  - A single pass is used to compute the prefix sums.
     * <br>
     * Space Complexity: O(n)
     *  - An extra array of size {@code nums.length + 1} is used to store the prefix sums.
     * <br><br>
     * @param nums the input array of integers
     */
    public RangeSumQueryImmutable(int[] nums) {
        prefix = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
    }

    /**
     * <h4><a href="https://leetcode.com/problems/range-sum-query-immutable/">303. Range Sum Query - Immutable</a></h4>
     * Returns the sum of the elements between indices {@code left} and {@code right} (inclusive).
     * <br>
     * Time Complexity: O(1)
     *  - The result is computed using precomputed prefix sums.
     * <br>
     * Space Complexity: O(1)
     *  - No additional space used per query.
     * <br><br>
     * @param left the starting index (inclusive)
     * @param right the ending index (inclusive)
     * @return the sum of elements from {@code left} to {@code right}
     */
    public int sumRange(int left, int right) {
        return prefix[right + 1] - prefix[left];
    }
}
