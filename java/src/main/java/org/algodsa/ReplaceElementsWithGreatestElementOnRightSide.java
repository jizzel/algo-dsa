package main.java.org.algodsa;

/**
 * Class to replace each element in an array with the greatest element on its right side.
 */
public class ReplaceElementsWithGreatestElementOnRightSide {
    /**
     * Constructor
     */
    public ReplaceElementsWithGreatestElementOnRightSide(){}

    /**
     * <h4><a href="https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/">1299. Replace Elements with Greatest Element on Right Side</a></h4>
     * <br>
     * Replaces each element in the input array with the greatest element among the elements to its right.
     * The last element is replaced with -1 as there are no elements to the right of it.<br>
     * <br>
     * Time Complexity: O(n), where n is the length of the array. We traverse the array once from right to left.
     * <br>
     * Space Complexity: O(1), since the transformation is done in-place, without using additional space except for variables.<br>
     * <br>
     * @param arr the input array of integers
     * @return the modified array where each element is replaced by the greatest element on its right
     */
    public int[] replaceElements(int[] arr) {
        int i = arr.length - 1;

        int greatestRight = arr[i];
        arr[i--] = -1;  // Replace the last element with -1

        // Traverse the array from right to left, updating elements with the greatest element on the right
        for(; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = greatestRight;
            greatestRight = Math.max(greatestRight, temp);
        }

        return arr;
    }
}

