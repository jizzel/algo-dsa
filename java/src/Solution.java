import java.util.ArrayList;
import java.util.List;

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

    /**
     * <h4></><a href="https://leetcode.com/problems/repeated-substring-pattern/">Repeated Substring Pattern</a></h4>
     * Checks if the given string `s` can be constructed by repeating a substring of itself.<br>
     * <br>
     * Time Complexity: O(n) - where n is the length of the string `s`.<br>
     * Space Complexity: O(n) - due to the creation of the `doubleStr` string.<br>
     * <br>
     * Algorithm:<br>
     * 1. Concatenate the string `s` with itself to form `doubleStr`.<br>
     * 2. Remove the first and last characters from `doubleStr` to avoid false positives.<br>
     * 3. Check if the original string `s` is a substring of this modified `doubleStr`.<br>
     * 4. If `s` is found within `doubleStr`, return `true`, indicating that `s` can be constructed
     *    by repeating a substring. Otherwise, return `false`.<br>
     * <br>
     * @param s the input string to check for repeated substring pattern
     * @return `true` if the string can be constructed by repeating a substring, otherwise `false`
     */
    public static boolean repeatedSubstringPattern(String s) {
        String doubleStr = s + s;
        doubleStr = doubleStr.substring(1, doubleStr.length() - 1);
        return doubleStr.contains(s);
    }

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
    public static String toLowerCase(String s) {
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

    /**
     * <h4><a href="https://leetcode.com/problems/fizz-buzz/">Fizz Buzz</a></h4>
     * Generates a list of strings representing the FizzBuzz sequence from 1 to `n`.<br>
     * <br>
     * Time Complexity: O(n) - where n is the input number, as each number from 1 to `n` is processed once.<br>
     * Space Complexity: O(n) - to store the list of strings.<br>
     * <br>
     * Algorithm:<br>
     * 1. Initialize an empty list `answer` to store the FizzBuzz results.<br>
     * 2. Iterate over each number from 1 to `n`:<br>
     *    - If the number is divisible by both 3 and 5, add "FizzBuzz" to the list.<br>
     *    - If the number is divisible by 3 only, add "Fizz" to the list.<br>
     *    - If the number is divisible by 5 only, add "Buzz" to the list.<br>
     *    - If the number is not divisible by 3 or 5, add the number itself as a string.<br>
     * 3. Return the list `answer` containing the FizzBuzz sequence.<br>
     * <br>
     * @param n the upper limit of the sequence (inclusive)
     * @return a list of strings representing the FizzBuzz sequence from 1 to `n`
     */
    public static List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = i + 1;
            answer.add(num % 3 == 0 && num % 5 == 0 ? "FizzBuzz" :
                    (num % 3 == 0) ? "Fizz" :
                            (num % 5 == 0) ? "Buzz" :
                                    String.valueOf(num));
        }

        return answer;
    }



}
