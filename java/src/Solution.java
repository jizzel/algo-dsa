public class Solution {
    /**
     * <h4><a href="https://leetcode.com/problems/excel-sheet-column-number/description/">Excel Sheet Column Number</a></h4>
     * Converts an Excel sheet column title (e.g., "A", "AB") to its corresponding column number.
     *<br>
     * Time Complexity: O(n)<br>
     * Space Complexity: O(1)<br>
     *<br>
     *<br>
     * Algorithm:<br>
     * 1. Initialize a variable `result` to store the final column number and set it to 0.<br>
     * 2. Iterate through each character in the `columnTitle` string from left to right:<br>
     *    - Convert the character to its numeric value using the formula: `currentValue = currentChar - 'A' + 1`.<br>
     *      (Note: This leverages ASCII values, where 'A' corresponds to 1, 'B' to 2, and so on.)<br>
     *    - Update the `result` by multiplying the current `result` by 26 (for the 26 letters of the alphabet)<br>
     *      and adding `currentValue`.<br>
     *      - This can be represented as: `result = result * 26 + currentValue`.<br>
     * 3. Once the loop completes, `result` will contain the column number corresponding to the input `columnTitle`.<br>
     * 4. Return `result`.<br>
     *<br>
     * @param columnTitle the Excel sheet column title as a String
     * @return the corresponding column number as an int
     */
    public static int titleToNumber(String columnTitle) {
        int result = 0;

        for (int i=0;i<columnTitle.length();i++){
            int charNum = (columnTitle.charAt(i) - 'A') + 1;
            result *= 26;
            result += charNum;
        }
        return result;
    }

    /**
     * <h4></><a href="https://leetcode.com/problems/length-of-last-word/description/">Length of Last Word</a></h4>
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
     *<br>
     * @param s the input string
     * @return the length of the last word in the string
     */
    public static int lengthOfLastWord(String s) {
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
