package main.java.org.algodsa;

/**
 * This class provides a method to check whether a given integer is a palindrome.
 */
public class PalindromeNumber {

    /**
     * Default constructor.
     */
    public PalindromeNumber() {}

    /**
     * <h4><a href="https://leetcode.com/problems/palindrome-number/description/">9. Palindrome Number</a></h4>
     * <br>
     * Checks if a given integer is a palindrome.
     * <br><br>
     * Time Complexity: O(log n), where n is the given number.
     * The number is reversed by extracting digits, which takes approximately log10(n) iterations.
     * <br>
     * Space Complexity: O(1), as only a few integer variables are used.
     * <br><br>
     * @param x the integer to check.
     * @return {@code true} if the number is a palindrome, otherwise {@code false}.
     */
    public boolean isPalindrome(int x) {
        if (x < 0) return false; // Negative numbers are not palindromes

        int original = x;
        int reverse = 0;

        while (x > 0) {
            reverse = (reverse * 10) + (x % 10); // Build reversed number
            x /= 10; // Reduce the number
        }

        return original == reverse; // Check if reversed number matches original
    }
}
