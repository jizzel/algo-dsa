package main.java.org.algodsa;

/**
 * To Lower Case
 */
public class ToLowerCase {
    /**
     * Constructor
     */
    public ToLowerCase(){}

    /**
     * <h4><a href="https://leetcode.com/problems/to-lower-case/">To Lower Case</a></h4>
     * Converts all uppercase characters in the given string `s` to lowercase without using
     * built-in methods like `toLowerCase()`.<br>
     * <br>
     * Time Complexity: O(n) - where n is the length of the string `s`.<br>
     * Space Complexity: O(n) - for storing the character array.<br>
     *
     * Algorithm:<br>
     * 1. Convert the string `s` into a character array, `str`.<br>
     * 2. Calculate the ASCII offset between lowercase and uppercase letters: `offset = 'a' - 'A'`.<br>
     * 3. Loop through each character in `str`:<br>
     *    - If the character is an uppercase letter (between 'A' and 'Z'):<br>
     *      - Convert it to its corresponding lowercase letter by adding the `offset` to its ASCII value.<br>
     *      - Replace the original character in the array with the new lowercase character.<br>
     * 4. Convert the modified character array back to a string.<br>
     * 5. Return the resulting string.<br>
     * <br>
     * @param s the input string to be converted to lowercase
     * @return a new string with all uppercase characters converted to lowercase
     */
    public String toLowerCase(String s) {
        char[] str = s.toCharArray();
        int offset = 'a' - 'A';

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                int charValue = offset + s.charAt(i);
                str[i] = (char) charValue;
            }
        }

        return new String(str);
    }
}
