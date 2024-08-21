public class Solution {
    /**
     * <h4>Excel Sheet Column Number</h4>
     * Converts an Excel sheet column title (e.g., "A", "AB") to its corresponding column number.
     *<br>
     * Time Complexity: O(n)<br>
     * Space Complexity: O(1)<br>
     *<br>
     * Problem Link:
     * <a href="https://leetcode.com/problems/excel-sheet-column-number/description/">Excel Sheet Column Number</a>
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
     * <h4></><a href="https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/">Find the Index of the First Occurrence in a String</a></h4>
     * Implements the `strStr()` function, which locates the first occurrence of the substring `needle`
     * in the string `haystack`.<br>
     * <br>
     * Time Complexity: O(n * m) - where n is the length of `haystack` and m is the length of `needle`.<br>
     * Space Complexity: O(1) - constant space usage.<br>
     * <br>
     * Algorithm:<br>
     * 1. If `needle` is longer than `haystack`, return -1 immediately since it can't be a substring.<br>
     * 2. Iterate through `haystack` up to the point where `needle` could still fit:<br>
     *    - For each position `i`, compare the substring of `haystack` starting at `i` with `needle`.<br>
     *    - Use an inner loop to compare each character of `needle` with the corresponding character in `haystack`.<br>
     *    - If all characters match, return the current index `i`.<br>
     * 3. If no match is found after the loop, return -1.<br>
     *<br>
     * @param haystack the string in which to search for the substring
     * @param needle the substring to find within `haystack`
     * @return the index of the first occurrence of `needle` in `haystack`, or -1 if `needle` is not found
     */
    public static int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) return -1;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j = 0;
            while (j < needle.length() && needle.charAt(j) == haystack.charAt(i + j)) {
                if (j == needle.length() - 1) return i;
                j++;
            }
        }
        return -1;
    }

}
