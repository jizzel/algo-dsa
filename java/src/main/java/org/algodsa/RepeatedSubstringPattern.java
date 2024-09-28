package main.java.org.algodsa;

/**
 * Repeated Substring Pattern
 */
public class RepeatedSubstringPattern {
    /**
     * Constructor
     */
    public RepeatedSubstringPattern(){}

    /**
     * <h4><a href="https://leetcode.com/problems/repeated-substring-pattern/">Repeated Substring Pattern</a></h4>
     * Checks if the given string `s` can be constructed by repeating a substring of itself.<br>
     * <br>
     * Time Complexity: O(n) - where n is the length of the string `s`.<br>
     * Space Complexity: O(n) - due to the creation of the `doubleStr` string.<br>
     * <br>
     * Algorithm:<br>
     * 1. Concatenate the string `s` with itself to form `doubleStr`.<br>
     * 2. Remove the first and last characters from `doubleStr` to avoid false positives.<br>
     * 3. Check if the original string `s` is a substring of this modified `doubleStr`.<br>
     * 4. If `s` is found within `doubleStr`, return `true`, indicating that `s` can be constructed
     *    by repeating a substring. Otherwise, return `false`.<br>
     * <br>
     * @param s the input string to check for repeated substring pattern
     * @return `true` if the string can be constructed by repeating a substring, otherwise `false`
     */
    public boolean repeatedSubstringPattern(String s) {
        String doubleStr = s + s;
        doubleStr = doubleStr.substring(1, doubleStr.length() - 1);
        return doubleStr.contains(s);
    }
}
