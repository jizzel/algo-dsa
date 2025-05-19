package main.java.org.algodsa;

import java.util.HashMap;
import java.util.Map;

/**
 * This class provides methods to determine whether two strings are anagrams.
 */
public class ValidAnagram {

    /**
     * Default constructor.
     */
    public ValidAnagram() {}

    /**
     * <h4><a href="https://leetcode.com/problems/valid-anagram/description/">242. Valid Anagram</a></h4>
     * Determines if two strings are anagrams using a fixed-size array to count character frequencies.
     * <br>
     * Assumes input strings contain only lowercase English letters ('a' to 'z').
     * <br><br>
     * Time Complexity: O(n)
     *   - Where {@code n} is the length of the input strings.
     *   - Both strings are traversed once.
     * <br>
     * Space Complexity: O(1)
     *   - Uses a fixed-size array of 26 integers regardless of input size.
     * <br><br>
     * @param s the first string
     * @param t the second string
     * @return {@code true} if {@code s} and {@code t} are anagrams; otherwise, {@code false}
     */
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] counts = new int[26];

        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }

        for (int count : counts) {
            if (count != 0) return false;
        }

        return true;
    }

    /**
     * <h4>Alternative II</h4>
     * Determines if two strings are anagrams using a hash map to count character frequencies.
     * <br>
     * Can be used for more general cases including Unicode characters.
     * <br><br>
     * Time Complexity: O(n)
     *   - Where {@code n} is the length of the input strings.
     *   - Each character in {@code s} and {@code t} is processed once.
     * <br>
     * Space Complexity: O(k)
     *   - Where {@code k} is the number of distinct characters in {@code s}.
     * <br><br>
     * @param s the first string
     * @param t the second string
     * @return {@code true} if {@code s} and {@code t} are anagrams; otherwise, {@code false}
     */
    public boolean isAnagramII(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> countMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (!countMap.containsKey(c)) return false;

            countMap.put(c, countMap.get(c) - 1);
            if (countMap.get(c) < 0) return false;
        }

        return true;
    }
}
