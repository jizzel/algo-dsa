package main.java.org.algodsa;

/**
 * Detect Capital
 */
public class DetectCapital {
    /**
     * Constructor
     */
    public DetectCapital(){}

    /**
     * <h4><a href="https://leetcode.com/problems/detect-capital/">Detect Capital</a></h4>
     * Determines if the usage of capital letters in a word is correct according to some defined rules.<br>
     * <br>
     * The method checks the first two characters of the word to determine the pattern of capitalization.<br>
     * If the first character is lowercase and the second is uppercase, it immediately returns `false` as this
     * does not conform to any of the valid capitalization patterns. Then, for the rest of the word, it checks
     * if all characters follow the pattern established by the first two characters. If any character violates
     * this pattern, the method returns `false`. Otherwise, it returns `true`.<br>
     * <br>
     * Time Complexity: O(n) - where n is the length of the word, as each character is checked once.<br>
     * Space Complexity: O(1) - only a few variables are used for comparisons.<br>
     * <br>
     * Algorithm:<br>
     * 1. If the word has only one character, return `true` since a single character can be either uppercase or lowercase.<br>
     * 2. Check if the first character is lowercase and the second character is uppercase:<br>
     *    - If true, return `false` because this pattern is invalid.<br>
     * 3. Iterate through the rest of the word starting from the third character:<br>
     *    - Ensure that the capitalization of each character matches the pattern set by the first two characters.<br>
     *    - If a mismatch is found, return `false`.<br>
     * 4. If no mismatches are found, return `true`.<br>
     *
     * @param word the input word to check for correct capital usage
     * @return `true` if the capitalization in the word is correct according to the rules, otherwise `false`
     */
    public boolean detectCapitalUse(String word) {
        if (word.length() == 1) return true;

        if (Character.isLowerCase(word.charAt(0)) && !Character.isLowerCase(word.charAt(1))) return false;

        for (int i = 2; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(1)) != Character.isUpperCase(word.charAt(i))) return false;
        }

        return true;
    }
}
