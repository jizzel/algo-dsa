package main.java.org.algodsa;

/**
 * Class for computing the integer part of the square root of a non-negative integer x.
 */
public class SqrtX {
    /**
     * Constructor
     */
    public SqrtX(){}

    /**
     * <h4><a href="https://leetcode.com/problems/sqrtx/">69. Sqrt(x)</a></h4>
     * Computes the integer part of the square root of the given non-negative integer x.
     * <br>
     * This method uses binary search to find the largest integer y such that y * y = x.
     * It efficiently narrows down the range by adjusting the mid-point based on comparisons.<br>
     * <br>
     * Time Complexity: O(log x), as the algorithm uses binary search on the range from 1 to x / 2.<br>
     * Space Complexity: O(1), as it only requires a constant amount of space.<br>
     * <br>
     * @param x the non-negative integer whose integer square root is to be found
     * @return the integer part of the square root of x
     */
    public int mySqrt(int x) {
        if (x < 2) return x;

        int low = 1, high = x / 2 + 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (mid == x / mid) return mid;

            if (mid < x / mid) low = mid + 1;  // Try higher

            else high = mid - 1;  // Try lower
        }

        return high;  // `high` will be the integer part of the sqrt(x)
    }
}
