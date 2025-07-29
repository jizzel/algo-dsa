package main.java.org.algodsa;

/**
 * The {@code ValidPalindromeII} class provides a method to determine whether a string
 * can become a palindrome by removing at most one character.
 */
public class ValidPalindromeII {

    /**
     * Default constructor for the ValidPalindromeII class.
     * Initializes a new instance of the ValidPalindromeII class.
     */
    public ValidPalindromeII() {}

    /**
     * <h4><a href="https://leetcode.com/problems/valid-palindrome-ii/">680. Valid Palindrome II</a></h4>
     * Determines whether the given string can become a palindrome by removing at most one character.
     * <br>
     * Time Complexity: O(n)
     *  - In the worst case, two passes of the string are performed (when checking both deletion options).
     * <br>
     * Space Complexity: O(1)
     *  - Constant extra space is used.
     * <br><br>
     * @param s the input string
     * @return {@code true} if the string can be a palindrome after removing at most one character,
     *         otherwise {@code false}
     */
    public boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }

        return true;
    }

    /**
     * Helper method to check if the substring s[i...j] is a palindrome.
     * <br>
     * Time Complexity: O(n)
     *  - Where n is the length of the substring being checked.
     * <br>
     * Space Complexity: O(1)
     *  - Constant space.
     * <br><br>
     * @param s the input string
     * @param i the starting index (inclusive)
     * @param j the ending index (inclusive)
     * @return {@code true} if the substring is a palindrome, otherwise {@code false}
     */
    private boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
