package main.java.org.algodsa;

import java.util.HashMap;
import java.util.Map;

/**
 * Word Pattern
 */
public class WordPattern {
    /**
     * Constructor
     */
    public WordPattern(){}

    /**
     * <h4><a href="https://leetcode.com/problems/word-pattern/description/">Word Pattern</a></h4>
     * Determines if a given string `s` follows the pattern defined by the string `pattern`.<br>
     * <br>
     * Each character in the `pattern` string represents a unique pattern for corresponding words in the string `s`.<br>
     * The method checks if each unique character in `pattern` maps to a unique word in `s` and vice versa, ensuring
     * that the mapping is consistent throughout the entire string.<br>
     * <br>
     * Time Complexity: O(n) - where n is the length of the string `s` or `pattern`, as each character and word is processed once.<br>
     * Space Complexity: O(n) - for storing the map of characters to words.<br>
     *
     * Algorithm:<br>
     * 1. Split the input string `s` into an array of words using whitespace as a delimiter.<br>
     * 2. Check if the length of the array matches the length of the `pattern`. If not, return `false`.<br>
     * 3. Initialize a map to store the mapping between characters in the `pattern` and words in the array.<br>
     * 4. Iterate through each character in the `pattern` and the corresponding word:<br>
     *    - If the character is already mapped to a different word, return `false`.<br>
     *    - If the word is already mapped to a different character, return `false`.<br>
     *    - Update the map with the current character-word pair.<br>
     * 5. If all checks pass, return `true`.<br>
     * <br>
     * @param pattern a string representing the pattern to be checked
     * @param s a string where words need to follow the pattern defined by `pattern`
     * @return `true` if the string `s` follows the pattern, otherwise `false`
     */
    public boolean wordPattern(String pattern, String s) {
        String[] strs = s.split("\\s+");

        // Check that the length of the pattern and the array of strings are equal
        if (strs.length != pattern.length()) return false;

        Map<Character, String> map = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char currentChar = pattern.charAt(i);
            String currentStr = strs[i];

            // Check if the map already contains the current character
            if (map.containsKey(currentChar)) {
                // If the mapped value does not match the current string, return false
                if (!currentStr.equals(map.get(currentChar))) return false;
            } else {
                // If the map does not contain the current character
                // but contains the current string (word), return false
                if (map.containsValue(currentStr)) return false;

                // Update the map with the current character and string
                map.put(currentChar, currentStr);
            }
        }

        return true;
    }
}
