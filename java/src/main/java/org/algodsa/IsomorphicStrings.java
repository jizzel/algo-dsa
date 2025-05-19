package main.java.org.algodsa;

import java.util.HashMap;
import java.util.Map;

/**
 * This class provides methods to check whether two strings are isomorphic.
 * Two strings are isomorphic if characters in one string can be replaced to get the other string,
 * with a one-to-one mapping and no two characters from the first string mapping to the same character in the second.
 */
public class IsomorphicStrings {

    /**
     * Default constructor.
     */
    public IsomorphicStrings() {}

    /**
     * <h4><a href="https://leetcode.com/problems/isomorphic-strings/description/">205. Isomorphic Strings</a></h4>
     * Checks if two strings are isomorphic using two hash maps to maintain forward and reverse mappings.
     * <br><br>
     * Time Complexity: O(n)
     *   - Where {@code n} is the length of the input strings.
     *   - Each character is visited once.
     * <br>
     * Space Complexity: O(k)
     *   - Where {@code k} is the number of distinct characters in the strings.
     * <br><br>
     * @param s the first input string
     * @param t the second input string
     * @return {@code true} if {@code s} and {@code t} are isomorphic; otherwise, {@code false}
     */
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> reverseMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (map.containsKey(sChar)) {
                if (!map.get(sChar).equals(tChar)) return false;
            } else {
                if (reverseMap.containsKey(tChar)) return false;

                map.put(sChar, tChar);
                reverseMap.put(tChar, sChar);
            }
        }

        return true;
    }

    /**
     * <h4>Alternative II</h4>
     * Checks if two strings are isomorphic using fixed-size arrays for ASCII character mapping.
     * <br>
     * This approach assumes extended ASCII characters (256 possible characters).
     * <br><br>
     * Time Complexity: O(n)
     *   - Where {@code n} is the length of the input strings.
     * <br>
     * Space Complexity: O(1)
     *   - Uses two fixed-size arrays of length 256 regardless of input size.
     * <br><br>
     * @param s the first input string
     * @param t the second input string
     * @return {@code true} if {@code s} and {@code t} are isomorphic; otherwise, {@code false}
     */
    public boolean isIsomorphicII(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] sMap = new int[256];
        int[] tMap = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);

            if (sMap[cs] != tMap[ct]) return false;

            // Store i + 1 to avoid confusion with default value 0
            sMap[cs] = i + 1;
            tMap[ct] = i + 1;
        }

        return true;
    }
}
