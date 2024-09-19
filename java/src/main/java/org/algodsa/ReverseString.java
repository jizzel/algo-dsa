package main.java.org.algodsa;

/**
 * Reverse string class
 */
public class ReverseString {

    /**
     * Constructor
     */
    public ReverseString(){}
    /**
     * <h4><a href="https://leetcode.com/problems/reverse-string/description/">Reverse String</a></h4>
     * Reverses the input character array in place.<br>
     * <br>
     * The function swaps characters from the start and end of the array
     * and works toward the center, effectively reversing the array.<br>
     * <br>
     * @param s the input character array to be reversed
     * <br>
     * Time Complexity: O(n), where n is the length of the array. Each character is processed once.<br>
     * Space Complexity: O(1), as the reversal is done in place with no extra space used.<br>
     */
    public void reverseString(char[] s) {
        // Use two pointers: one starting at the beginning (i) and one at the end (j)
        for (int i = 0, j = s.length - 1; i < j; i++, j--) {
            // Swap the characters at index i and j
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}
