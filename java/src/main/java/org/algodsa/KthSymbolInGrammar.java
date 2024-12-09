package main.java.org.algodsa;

/**
 * This class provides a method to determine the k-th symbol in the n-th row
 * of a grammar sequence generated as follows:
 * - Row 1: "0"
 * - Row 2: "01" (derived from replacing "0" with "01" and "1" with "10")
 * - Row 3: "0110", and so on.
 */
public class KthSymbolInGrammar {

    /**
     * Constructor for KthSymbolInGrammar.
     */
    public KthSymbolInGrammar() {}

    /**
     * <h4><a href="https://leetcode.com/problems/k-th-symbol-in-grammar/description/">779. K-th Symbol in Grammar</a></h4>
     * <br>
     * Determines the k-th symbol in the n-th row of the grammar sequence.
     * <br>
     * Time complexity: O(n)
     * Space complexity: O(n)
     * <br>
     * The time complexity is O(n) because the recursion depth is proportional to the value of `n`.
     * The space complexity is also O(n) due to the recursive call stack.
     * <br>
     * @param n the row number (1-indexed).
     * @param k the column number (1-indexed).
     * @return the k-th symbol in the n-th row of the grammar sequence.
     */
    public int kthGrammar(int n, int k) {
        // Base case: The first row has a single element '0'.
        if (n == 1) return 0;

        // Find the parent index in the previous row.
        int parent = kthGrammar(n - 1, (k + 1) / 2);

        // Determine the current value based on the parent's value.
        if (k % 2 == 1) { // Odd index: same as parent
            return parent;
        } else { // Even index: inverted from parent
            return parent == 0 ? 1 : 0;
        }
    }
}
