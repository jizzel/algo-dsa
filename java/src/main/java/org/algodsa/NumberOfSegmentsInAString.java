package main.java.org.algodsa;

/**
 * This class provides a method to count the number of segments (words) in a given string.
 * A segment is defined as a contiguous sequence of non-space characters.
 */
public class NumberOfSegmentsInAString {
    /**
     * Constructor
     */
    public NumberOfSegmentsInAString(){}

    /**
     * <h4><a href="https://leetcode.com/problems/number-of-segments-in-a-string/description/">434. Number of Segments in a String</a></h4>
     * Counts the number of segments (words) in the input string.<br>
     * Segments are sequences of non-space characters separated by spaces.<br>
     * <br>
     * @param s the input string
     * @return the number of segments in the input string
     * <br>
     * Time Complexity: O(n), where n is the length of the string. The function iterates through the string once.<br>
     * <br>
     * Space Complexity: O(1), the space used is constant as the algorithm only uses a few variables to track the result.<br>
     */
    public int countSegments(String s) {
        char prev = ' ';
        int count = 0;

        // Loop through the characters of the string
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            // Count a segment when transitioning from a space to a non-space character
            if (curr != ' ' && prev == ' ') count++;
            prev = curr;
        }

        return count;
    }
}
