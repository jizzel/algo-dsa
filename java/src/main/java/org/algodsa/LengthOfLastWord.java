package main.java.org.algodsa;

/**
 * Length Of Last Word
 */
public class LengthOfLastWord {

    /**
     * Constructor
     */
    public LengthOfLastWord(){}

    /**
     * <h4><a href="https://leetcode.com/problems/length-of-last-word/description/">Length of Last Word</a></h4>
     * Returns the length of the last word in the given string.<br>
     * <br>
     * The method first skips any trailing spaces at the end of the string. Then, it counts the number of characters
     * in the last word until it encounters a space or the beginning of the string.<br>
     * <br>
     * Time Complexity: O(n) - where n is the length of the string `s`. <br>
     * Space Complexity: O(1) - constant space usage. <br>
     * <br>
     * Algorithm:<br>
     * 1. Initialize a variable `i` to the index of the last character in the string.<br>
     * 2. Skip any trailing spaces by decrementing `i` until a non-space character is found or `i` becomes negative.<br>
     * 3. Initialize a `count` variable to 0 to keep track of the length of the last word.<br>
     * 4. Iterate through the string from right to left, counting characters until a space is encountered or `i` becomes negative.<br>
     * 5. Return the `count`, which represents the length of the last word.<br>
     * <br>
     * @param s the input string
     * @return the length of the last word in the string
     */
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        int count = 0;

        // Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Count characters of the last word
        while (i >= 0) {
            if (s.charAt(i) != ' ') {
                ++count;
            } else {
                break;
            }
            i--;
        }
        return count;
    }
}
