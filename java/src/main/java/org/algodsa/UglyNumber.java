package main.java.org.algodsa;

/**
 * The {@code UglyNumber} class provides a method to determine whether a number
 * is an "ugly number". An ugly number is a positive number whose prime factors
 * only include 2, 3, and 5.
 */
public class UglyNumber {

    /**
     * Default constructor for the UglyNumber class.
     * Initializes a new instance of the UglyNumber class.
     */
    public UglyNumber(){}

    /**
     * <h4><a href="https://leetcode.com/problems/ugly-number/">263. Ugly Number</a></h4>
     * <br>
     * Checks if the given number is an ugly number.
     * <br><br>
     * Time Complexity: O(log n)
     *  - In the worst case, we divide {@code n} by 2, 3, or 5 until it becomes 1.
     * <br>
     * Space Complexity: O(1)
     *  - No extra space is used apart from primitive variables.
     * <br><br>
     * @param n the number to check
     * @return {@code true} if {@code n} is an ugly number, {@code false} otherwise
     */
    public boolean isUgly(int n) {
        if (n <= 0) return false;

        for (int factor : new int[]{2, 3, 5}) {
            while (n % factor == 0) {
                n /= factor;
            }
        }

        return n == 1;
    }
}
