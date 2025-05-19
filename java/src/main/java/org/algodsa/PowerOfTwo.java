package main.java.org.algodsa;

/**
 * This class provides methods to determine if a given integer is a power of two.
 */
public class PowerOfTwo {

    /**
     * Default constructor.
     */
    public PowerOfTwo() {}

    /**
     * <h4><a href="https://leetcode.com/problems/power-of-two/description/">231. Power of Two</a></h4>
     * Determines if a given integer is a power of two using iterative division.
     * <br>
     * Time Complexity: O(log n)
     *   - The input {@code n} is divided by 2 until it reaches 1.
     * <br>
     * Space Complexity: O(1)
     *   - Constant space usage.
     * <br><br>
     * @param n the integer to check.
     * @return {@code true} if {@code n} is a power of two; otherwise, {@code false}.
     */
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;

        while (n % 2 == 0) {
            n /= 2;
        }

        return n == 1;
    }

    /**
     * <h4>Alternative II</h4>
     * Determines if a given integer is a power of two using a bitwise trick.
     * <br>
     * A number that is a power of two has exactly one bit set in binary representation.
     * The expression {@code n & (n - 1)} removes the lowest set bit. If the result is 0,
     * then {@code n} had only one set bit and is a power of two.
     * <br><br>
     * Time Complexity: O(1)
     *   - Bitwise operations take constant time.
     * <br>
     * Space Complexity: O(1)
     *   - Constant space usage.
     * <br><br>
     * @param n the integer to check.
     * @return {@code true} if {@code n} is a power of two; otherwise, {@code false}.
     */
    public boolean isPowerOfTwoII(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
