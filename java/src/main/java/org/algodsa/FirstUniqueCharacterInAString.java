package main.java.org.algodsa;

/**
 * This class provides a method to find the first unique character in a string.
 */
public class FirstUniqueCharacterInAString {
    /**
     * Constructor
     */
    public FirstUniqueCharacterInAString(){}

    /**
     * <h4><a href="https://leetcode.com/problems/first-unique-character-in-a-string/description/">First Unique Character in a String</a></h4>
     * Finds the index of the first non-repeating character in the input string.<br>
     * If there are no unique characters, it returns -1.<br>
     * <br>
     * @param s the input string
     * @return the index of the first non-repeating character, or -1 if none exists
     * <br>
     * The method iterates through all the lowercase English letters ('a' to 'z') and
     * checks their first and last occurrence in the string. If the first and last index
     * of a character are the same, that means the character is unique. The method returns
     * the minimum index of such a unique character.<br>
     * <br>
     * Time Complexity: O(n), where n is the length of the string.<br>
     * The method checks each character ('a' to 'z') and uses indexOf and lastIndexOf,
     * both of which take linear time.<br>
     * <br>
     * Space Complexity: O(1), since no additional data structures are used that depend on the input size.<br>
     */
    public int firstUniqChar(String s) {
        int ans = Integer.MAX_VALUE;

        for (char c = 'a'; c <= 'z'; c++) {
            int index = s.indexOf(c);
            if (index != -1 && index == s.lastIndexOf(c)) {
                ans = Math.min(ans, index);
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
