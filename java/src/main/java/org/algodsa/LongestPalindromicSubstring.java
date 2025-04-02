package main.java.org.algodsa;

/**
 * Longest Palindromic Substring
 */
public class LongestPalindromicSubstring {
    /**
     * Constructor
     */
    public LongestPalindromicSubstring(){}

    /**
     * <h4><a href="https://leetcode.com/problems/longest-palindromic-substring/">L5. Longest Palindromic Substring</a></h4>
     * Finds the longest palindromic substring in a given string.<br>
     * <br>
     * Time Complexity: O(n^2) - where n is the length of the input string.<br>
     * Space Complexity: O(1) - uses constant space.<br>
     * <br>
     * @param s the input string
     * @return the longest palindromic substring
     */
    public String longestPalindrome(String s) {
        int n = s.length();
        if (n < 2) return s;

        int start = 0, end = 0;

        for (int i = 0; i < n; i++) {
            // Check for odd-length palindromes
            int len1 = expandAroundCenter(s, i, i);
            // Check for even-length palindromes
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    /**
     * Expands around the center to find the length of the palindrome.
     * @param s the input string
     * @param left the left index
     * @param right the right index
     * @return the length of the palindrome
     */
    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
