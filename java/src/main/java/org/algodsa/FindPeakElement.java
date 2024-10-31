package main.java.org.algodsa;

/**
 * This class provides a method to find a peak element in an array.
 */
public class FindPeakElement {
    /**
     * Constructor
     */
    public FindPeakElement(){}

    /**
     * <h4><a href="https://leetcode.com/problems/find-peak-element/">162. Find Peak Element</a></h4>
     * <br>
     * Finds a peak element in the given array and returns its index.
     * <br>
     * A peak element is defined as an element that is greater than its neighbors. This method uses a
     * binary search approach to locate a peak in O(log n) time.
     * <br>
     * Note: The array does not have to be fully sorted, but a peak is guaranteed to exist by the problem's definition.
     * <br>
     * Time Complexity: O(log n), as it performs a binary search.
     * Space Complexity: O(1), using constant space.<br>
     * <br>
     * @param nums the input array to search for a peak element
     * @return the index of any one peak element found in the array
     */
    public int findPeakElement(int[] nums) {
        int l = 0, r = nums.length - 1;

        while (l + 1 < r) {
            int m = l + (r - l) / 2;

            // Check if the right side is increasing, move left boundary
            if (nums[m] > nums[m + 1]) r = m;
            else l = m + 1;
        }

        return nums[l] > nums[r] ? l : r;
    }

    /**
     * Alternative approach
     * @param nums int array
     * @return int
     */
    public int findPeakElement2(int[] nums) {
        int l = 0, r = nums.length - 1;


         while(l<r){
             int m = l + (r - l)/2;

             if(nums[m] < nums[m+1]) l = m + 1;
             else r = m;
         }

        return l;
    }
}
