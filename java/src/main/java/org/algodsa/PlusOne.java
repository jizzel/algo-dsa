package main.java.org.algodsa;

/**
 * Class to increment an integer represented as an array of digits by one.
 */
public class PlusOne {
    /**
     * Constructor
     */
    public PlusOne(){}

    /**
     * <h4><a href="https://leetcode.com/problems/plus-one/">66. Plus One</a></h4>
     * <br>
     * Given a non-negative integer represented as an array of digits, increments the integer by one.
     * <br>
     * The array of digits is processed from the least significant digit (rightmost) to the most significant digit (leftmost).
     * If a digit is 9, it becomes 0 and the carry continues to the next digit. If the most significant digit is 9,
     * the array is expanded to accommodate the carry (e.g., 999 + 1 becomes 1000).<br>
     * <br>
     * Time Complexity: O(n), where n is the number of digits in the input array. We traverse the array once.
     * <br>
     * Space Complexity: O(1), as we modify the input array in-place and use constant extra space. However,
     * in the worst case (e.g., when all digits are 9), we create a new array of size n+1, resulting in O(n) space.<br>
     * <br>
     * @param digits the array of digits representing the integer
     * @return the array of digits representing the incremented integer
     */
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                return digits;
            }
        }

        // In case all digits are 9, we need to add a new leading 1
        digits = new int[n + 1];
        digits[0] = 1;

        return digits;
    }
}

