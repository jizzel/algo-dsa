package main.java.org.algodsa;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * This class provides methods to check if a given array contains duplicate elements
 * such that the indices of the duplicates are at most {@code k} distance apart.
 */
public class ContainsDuplicateII {

    /**
     * Default constructor.
     */
    public ContainsDuplicateII() {}

    /**
     * <h4><a href="https://leetcode.com/problems/contains-duplicate-ii/">219. Contains Duplicate II</a></h4>
     * Checks whether there are any duplicate elements within a sliding window of size {@code k}.
     * <br>
     * This method uses a sliding window (HashSet) to maintain the last {@code k} elements.
     * <br>
     * Time Complexity: O(n), where {@code n} is the length of the array.
     *   - Each element is added and removed from the HashSet at most once.
     * <br>
     * Space Complexity: O(min(n, k)).
     *   - The HashSet stores up to {@code k} elements at a time.
     * <br><br>
     * @param nums the array of integers.
     * @param k the maximum index difference between duplicate values.
     * @return {@code true} if such duplicates exist, {@code false} otherwise.
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (window.contains(nums[i])) return true;

            window.add(nums[i]);

            if (window.size() > k) {
                window.remove(nums[i - k]);
            }
        }

        return false;
    }

    /** <h4>Alternative 2</h4>
     * Checks whether there are any duplicate elements within a distance of {@code k}
     * using a map to track the last seen index of each value.
     * <br><br>
     * Time Complexity: O(n), where {@code n} is the length of the array.
     *   - Each array element is processed once.
     * <br>
     * Space Complexity: O(n).
     *   - The HashMap stores the index for each unique value.
     * <br><br>
     * @param nums the array of integers.
     * @param k the maximum index difference between duplicate values.
     * @return {@code true} if such duplicates exist, {@code false} otherwise.
     */
    public boolean containsNearbyDuplicateII(int[] nums, int k) {
        Map<Integer, Integer> memory = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (memory.containsKey(nums[i])) {
                if (Math.abs(i - memory.get(nums[i])) <= k) return true;
            }
            memory.put(nums[i], i);
        }

        return false;
    }
}
