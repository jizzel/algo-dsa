package main.java.org.algodsa;

/**
 * Class that provides a method to find the third distinct maximum number from an array.
 * If the third distinct maximum does not exist, the method returns the maximum number.
 */
public class ThirdMaximumNumber {
    /**
     * Constructor
     */
    public ThirdMaximumNumber(){}

    /**
     * <h4><a href="https://leetcode.com/problems/third-maximum-number/">414. Third Maximum Number</a></h4>
     * <br>
     * Finds the third distinct maximum number in an array of integers. If there are fewer than
     * three distinct numbers, the maximum number is returned.<br>
     * <br>
     * Time Complexity: O(n), where n is the number of elements in the array. We traverse the array
     * once while updating the first, second, and third distinct maximum numbers.
     * <br>
     * Space Complexity: O(1), as we only use a few extra variables to track the three maximum numbers.<br>
     * <br>
     * @param nums the input array of integers
     * @return the third distinct maximum number, or the maximum number if there are fewer than three distinct values
     */
    public int thirdMax(int[] nums) {
        Integer f = null, s = null, t = null;

        for (int num : nums) {
            // Skip if the number is already one of the max values
            if ((f != null && num == f) || (s != null && num == s) || (t != null && num == t)) continue;

            // Update f, s, t accordingly
            if (f == null || num > f) {
                t = s;
                s = f;
                f = num;
            } else if (s == null || num > s) {
                t = s;
                s = num;
            } else if (t == null || num > t) {
                t = num;
            }
        }

        // If third max exists, return it; otherwise return the maximum (f)
        return t == null ? f : t;
    }
}
