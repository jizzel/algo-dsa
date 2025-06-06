package main.java.org.algodsa;

/**
 * The {@code MissingNumber} class provides three different methods to find the
 * missing number in an array that contains {@code n} distinct numbers in the
 * range [0, n], with one number missing.
 */
public class MissingNumber {

    /**
     * Default constructor.
     */
    public MissingNumber() {}

    /** <h4><a href="https://leetcode.com/problems/missing-number/">268. Missing Number</a></h4>
     * Finds the missing number using counting.
     * <br>
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * <br><br>
     * @param nums the input array of size n containing numbers from 0 to n with one missing
     * @return the missing number
     */
    public int missingNumber(int[] nums) {
        int[] count = new int[nums.length];

        for (int num : nums) {
            if (num < nums.length) count[num]++;
        }

        for (int i = 0; i < nums.length; i++) {
            if (count[i] == 0) return i;
        }

        return nums.length;
    }

    /**
     * Finds the missing number by placing each number in its correct index (cyclic sort variant).
     * <br>
     * Time Complexity: O(n)
     * Space Complexity: O(1) (in-place modification)
     * <br><br>
     * @param nums the input array of size n containing numbers from 0 to n with one missing
     * @return the missing number
     */
    public int missingNumberII(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] < nums.length && nums[i] != i) {
                int temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] >= nums.length) return j;
        }

        return nums.length;
    }

    /**
     * Finds the missing number using the mathematical sum formula.
     * <br>
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * <br><br>
     * @param nums the input array of size n containing numbers from 0 to n with one missing
     * @return the missing number
     */
    public int missingNumberIII(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}
