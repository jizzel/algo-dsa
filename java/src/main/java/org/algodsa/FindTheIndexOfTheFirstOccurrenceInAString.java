package main.java.org.algodsa;

/**
 * Find The Index Of The First Occurrence In A String
 */
public class FindTheIndexOfTheFirstOccurrenceInAString {
    /**
     * Constructor
     */
    public FindTheIndexOfTheFirstOccurrenceInAString(){}

    /**
     * <h4><a href="https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/">Find the Index of the First Occurrence in a String</a></h4>
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
     * <br>
     * @param haystack the string in which to search for the substring
     * @param needle the substring to find within `haystack`
     * @return the index of the first occurrence of `needle` in `haystack`, or -1 if `needle` is not found
     */
    public int strStr(String haystack, String needle) {
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
