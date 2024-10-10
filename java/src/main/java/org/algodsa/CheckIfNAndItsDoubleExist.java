package main.java.org.algodsa;

import java.util.HashSet;
import java.util.Set;

/**
 * Class to check if an integer and its double exist in the array.
 */
public class CheckIfNAndItsDoubleExist {
    /**
     * Constructor
     */
    public CheckIfNAndItsDoubleExist(){}

    /**
     * Checks if there exists two integers N and M in the array such that N is the double of M (i.e., N = 2 * M).
     *
     * This is achieved by iterating over the array and using a HashSet to store elements, checking if the current
     * element's half or double already exists in the set.
     *
     * Time Complexity: O(n), where n is the number of elements in the array.
     * The iteration over the array takes O(n) and both the contains and add operations on the HashSet are O(1) on average.
     *
     * Space Complexity: O(n), as the HashSet stores at most n elements from the array.
     *
     * @param arr the input array of integers
     * @return true if such a pair (N, 2 * N) exists, false otherwise
     */
    public boolean checkIfExist(int[] arr) {
        Set<Integer> seen = new HashSet<>();

        for (int num : arr) {
            if (num % 2 == 0 && seen.contains(num / 2) || seen.contains(2 * num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}

