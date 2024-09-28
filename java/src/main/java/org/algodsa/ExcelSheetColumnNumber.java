package main.java.org.algodsa;

/**
 * Excel Sheet Column to Number
 */
public class ExcelSheetColumnNumber {
    /**
     * Constructor
     */
    public ExcelSheetColumnNumber(){}

    /**
     * <h4><a href="https://leetcode.com/problems/excel-sheet-column-number/description/">Excel Sheet Column Number</a></h4>
     * Converts an Excel sheet column title (e.g., "A", "AB") to its corresponding column number.<br>
     * <br>
     * Time Complexity: O(n)<br>
     * Space Complexity: O(1)<br>
     * <br>
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
     * <br>
     * @param columnTitle the Excel sheet column title as a String
     * @return the corresponding column number as an int
     */
    public int titleToNumber(String columnTitle) {
        int result = 0;

        for (int i=0;i<columnTitle.length();i++){
            int charNum = (columnTitle.charAt(i) - 'A') + 1;
            result *= 26;
            result += charNum;
        }
        return result;
    }
}
