package main.java.org.algodsa;

/**
 * This class provides a method to compute the power of a given base raised to an integer exponent.
 */
public class Pow {

    /**
     * Constructor
     */
    public Pow(){}

    /**
     * <h4><a href="https://leetcode.com/problems/powx-n/description/">Pow(x, n)</a></h4>
     * Computes x raised to the power of n.
     *
     * Time complexity: O(log n)
     * Space complexity: O(log n)
     *
     * The time complexity is O(log n) because we divide the exponent by 2 in each recursive call.
     * The space complexity is also O(log n) due to the recursion stack depth.
     *
     * @param x the base, a double value
     * @param n the exponent, an integer value
     * @return the result of x raised to the power of n
     */
    public double myPow(double x, int n) {
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        return helper(x, n);
    }

    /**
     * Helper method to perform recursive power calculation.
     *
     * @param x the base
     * @param n the exponent
     * @return the result of x raised to the power of n
     */
    private double helper(double x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;

        double result = helper(x, n / 2);
        return (n % 2) == 0 ? (result * result) : (result * result * x);
    }
}