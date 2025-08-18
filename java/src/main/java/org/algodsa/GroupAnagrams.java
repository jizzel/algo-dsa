package main.java.org.algodsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Provides a solution to the "Group Anagrams" problem.
 *
 * <p>The method groups words that are anagrams of each other into lists.</p>
 */
public class GroupAnagrams {

    /**
     * Default constructor for the GroupAnagrams class.
     * This constructor initializes the GroupAnagrams class.
     */
    public GroupAnagrams() {}

    /**
     * <h4><a href="https://leetcode.com/problems/group-anagrams/">49. Group Anagrams</a></h4>
     * Groups words that are anagrams into sublists.
     *
     * <p><b>Time Complexity:</b> O(N * K log K), where:
     * <ul>
     *   <li>N = number of strings in the input array</li>
     *   <li>K = maximum length of a string</li>
     * </ul>
     * Each string is sorted (O(K log K)), and this is done for N strings.
     *
     * <p><b>Space Complexity:</b> O(N * K),
     * since we store the sorted strings as keys and group the strings in lists.</p>
     *
     * @param strs the array of input strings
     * @return a list of grouped anagrams
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList<>();
        }

        HashMap<String, List<String>> result = new HashMap<>();
        for (String i : strs) {
            char[] A = i.toCharArray();
            Arrays.sort(A);
            String key = String.valueOf(A);
            if (!result.containsKey(key)) {
                result.put(key, new ArrayList<>());
            }
            result.get(key).add(i);
        }

        return new ArrayList<>(result.values());
    }
}
