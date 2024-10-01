package main.java.org.algodsa;

/**
 * This class provides a method to calculate the score of a string based on the absolute difference
 * between the ASCII values of consecutive characters.
 */
public class ScoreOfAString {

    /**
     * Constructor
     */
    public ScoreOfAString(){}

    /**
     * <h4><a href="https://leetcode.com/problems/score-of-a-string/description/">3110. Score of a String</a></h4>
     * Calculates the score of a string. The score is defined as the sum of the absolute differences
     * between the ASCII values of consecutive characters in the string.<br>
     * <br>
     * @param s the input string
     * @return the score of the string, calculated as the sum of absolute differences between consecutive characters
     * <br>
     * <br>
     * This method iterates through the string, compares each character with the next one, and sums up the absolute differences.
     * <br>
     * Time Complexity: O(n), where n is the length of the string. The function iterates through the string once.
     * <br>
     * Space Complexity: O(1), constant space usage since only a few variables are used.
     */
    public int scoreOfString(String s) {
        int sum = 0;
        int n = s.length() - 1;

        // Iterate over the string and calculate the sum of absolute differences
        for (int i = 0; i < n; i++) {
            sum += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }
        return sum;
    }
}

