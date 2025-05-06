package main.java.org.algodsa;

/**
 * Even Odd
 */

public class CompareEvenOddSums {

    /**
     * Constructor
     */
    public CompareEvenOddSums() {}

    /**
     * Compares the sum of elements at even indices with those at odd indices.
     * <br>
     * Time Complexity: O(n) - where n is the length of the array.<br>
     * Space Complexity: O(1) - uses constant space.<br>
     * <br>
     * @param numbers int array
     * @return "even" if even-indexed sum is greater, "odd" if odd-indexed sum is greater, "equal" otherwise.
     */
    public String solution(int[] numbers) {
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if ((i & 1) == 0) {
                evenSum += numbers[i];
            } else {
                oddSum += numbers[i];
            }
        }

        if (evenSum > oddSum) return "even";
        else if (oddSum > evenSum) return "odd";
        else return "equal";
    }
}
