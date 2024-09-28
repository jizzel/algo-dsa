package main.java.org.algodsa;

/**
 * Longest Common Prefix
 */
public class LongestCommonPrefix {
    /**
     * Constructor
     */
    public LongestCommonPrefix(){}

    /**
     * <h4><a href="https://leetcode.com/problems/longest-common-prefix/">Longest Common Prefix</a></h4>
     * Finds the longest common prefix string among an array of strings.<br>
     * <br>
     * The method works by initially assuming the first string in the array (`strs[0]`) as the common prefix.<br>
     * It then iteratively compares this prefix with each subsequent string in the array. If the current string
     * does not start with the assumed prefix, the prefix is shortened by removing characters from the end until
     * the current string starts with the prefix. This process continues until either a common prefix is found for
     * all strings or the prefix becomes empty, indicating that there is no common prefix.<br>
     * <br>
     * Time Complexity: O(S) - where S is the sum of all characters in all strings. In the worst case,
     * the algorithm compares each character of every string.<br>
     * Space Complexity: O(1) - as no extra space is used except for a few variables.<br>
     * <br>
     * Algorithm:<br>
     * 1. Initialize the `prefix` with the first string in the array.<br>
     * 2. Iterate over each string in the array starting from the second string:<br>
     *    - While the current string does not start with the `prefix`, shorten the `prefix` by one character
     *      from the end.<br>
     *    - If the `prefix` becomes empty, return an empty string.<br>
     * 3. After checking all strings, return the `prefix`, which now represents the longest common prefix.<br>
     *
     * @param strs an array of strings to find the longest common prefix
     * @return the longest common prefix string among the input strings; if none exists, returns an empty string
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }
}
