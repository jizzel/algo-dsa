package main.java.org.algodsa;

/**
 * This class provides a method to determine the length of the longest possible palindrome
 * that can be built using the characters of a given string.
 */
public class LongestPalindrome {

    /**
     * Default constructor for the LongestPalindrome class.
     * This constructor initializes the LongestPalindrome class.
     */
    public LongestPalindrome() {}

    /**
     * <h4><a href="https://leetcode.com/problems/longest-palindrome/description/">409. Longest Palindrome</a></h4>
     * <br>
     * Computes the length of the longest palindrome that can be built using the given string's characters.
     * <br><br>
     * Time Complexity: O(n), where n is the length of the input string.
     * - We iterate over the string once to count character frequencies (O(n)).
     * - We iterate over a fixed-size array (128 ASCII characters), which takes O(1) time.
     * <br>
     * Space Complexity: O(1), since we use a fixed-size integer array of 128 elements.
     * <br><br>
     * @param s the input string
     * @return the length of the longest palindrome that can be formed
     */
    public int longestPalindrome(String s) {
        int[] freq = new int[128]; // Character frequency array for ASCII characters
        boolean plusOne = false;
        int longest = 0;

        // Count occurrences of each character
        for (int ch : s.toCharArray()) {
            freq[ch]++;
        }

        // Calculate the longest palindrome length
        for (int j : freq) {
            if (j % 2 == 0) {
                longest += j; // Add all even counts
            } else {
                longest += j - 1; // Use the largest even part of an odd count
                plusOne = true; // Mark that we can use one odd character in the middle
            }
        }

        return plusOne ? ++longest : longest;
    }
}
