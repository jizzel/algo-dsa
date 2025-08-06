package main.java.org.algodsa;

/**
 * The {@code ApplyOperationsToMakeSumOfArrayGreaterThanOrEqualTok} class contains methods to compute
 * the minimum number of operations required to make the sum of an array greater than or equal to {@code k}.
 * <br><br>
 * There are two types of operations:
 * - Increment an element by 1
 * - Duplicate the array (copy all elements)
 * <br>
 * These methods determine the optimal combination of operations to reach or exceed the target sum {@code k}.
 */
public class ApplyOperationsToMakeSumOfArrayGreaterThanOrEqualTok {

    /**
     * Default constructor for the {@code ApplyOperationsToMakeSumOfArrayGreaterThanOrEqualTok} class.
     * Initializes an instance of the class.
     */
    public ApplyOperationsToMakeSumOfArrayGreaterThanOrEqualTok() {}

    /**
     * <h4><a href="https://leetcode.com/problems/apply-operations-to-make-sum-of-array-greater-than-or-equal-to-k/description/">3091. Apply Operations to Make Sum of Array Greater Than or Equal to k</a></h4>
     * Computes the minimum number of operations using brute-force over possible split sizes.
     * <br><br>
     * Time Complexity: O(√k)
     * - Iterates from 1 to √k and checks the cost of using that many initial elements.
     * <br>
     * Space Complexity: O(1)
     * - Constant extra space used for computation.
     * <br><br>
     * @param k the target sum to reach or exceed
     * @return the minimum number of operations needed
     */
    public int minOperations(int k) {
        int res = k - 1; // Worst case: all increments
        for (int i = 1; i <= Math.sqrt(k); i++) {
            int numIncrements = i - 1;
            int numCopies = (k + i - 1) / i - 1;
            res = Math.min(res, numIncrements + numCopies);
        }
        return res;
    }

    /**
     * Optimized mathematical version of the {@code minOperations} function.
     * Chooses the number of initial elements (approximated by sqrt(k)) and computes operations directly.
     * <br><br>
     * Time Complexity: O(1)
     * - Performs a constant-time mathematical computation.
     *
     * Space Complexity: O(1)
     * - No additional space used.
     * <br><br>
     * @param k the target sum to reach or exceed
     * @return the minimum number of operations needed
     */
    public int minOperationsII(int k) {
        int a = (int) Math.sqrt(k);
        return a + (k - 1) / a - 1;
    }
}
