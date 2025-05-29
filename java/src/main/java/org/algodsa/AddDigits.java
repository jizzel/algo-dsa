package main.java.org.algodsa;

/**
 * The {@code AddDigits} class provides methods to repeatedly add digits of a non-negative integer
 * until the result has only one digit.
 */
public class AddDigits {

    /**
     * Default constructor.
     */
    public AddDigits() {}

    /**
     * <h4><a href="https://leetcode.com/problems/add-digits/">258. Add Digits</a></h4>
     * Repeatedly adds the digits of the given number until a single-digit result is obtained.
     * This implementation uses an iterative digit-summing approach.
     * <br><br>
     * Example: 38 → 3 + 8 = 11 → 1 + 1 = 2
     * <br><br>
     * Time Complexity: O(log₁₀n)
     *   - Because in each inner loop, we sum the digits, which requires traversing all digits (base-10).
     * <br>
     * Space Complexity: O(1)
     *   - Constant extra space used for variables.
     * <br><br>
     * @param num a non-negative integer
     * @return the resulting single-digit value
     */
    public int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }

    /**
     * Computes the repeated digit sum using a mathematical trick known as the digital root.
     * For base-10 numbers:
     * - digital root of 0 is 0
     * - digital root of any other number is (num % 9 == 0 ? 9 : num % 9)
     * <br><br>
     * Time Complexity: O(1)
     *   - Constant time arithmetic.
     * <br>
     * Space Complexity: O(1)
     *   - No extra space used.
     * <br><br>
     * @param num a non-negative integer
     * @return the resulting single-digit value
     */
    public int addDigitsII(int num) {
        if (num == 0) return 0;
        return num % 9 == 0 ? 9 : num % 9;
    }
}
