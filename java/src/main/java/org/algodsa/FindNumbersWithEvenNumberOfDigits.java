package main.java.org.algodsa;

/**
 * Class to find how many numbers in an array have an even number of digits.
 */
public class FindNumbersWithEvenNumberOfDigits {
    /**
     * Constructor
     */
    public FindNumbersWithEvenNumberOfDigits(){}

    /**
     * <h4><a href="https://leetcode.com/problems/find-numbers-with-even-number-of-digits/">1295. Find Numbers with Even Number of Digits</a></h4>
     * <br>
     * Finds the number of integers in the array that have an even number of digits.<br>
     * <br>
     * Time Complexity: O(n), where n is the number of elements in the array. We traverse each number once to check the digit count.
     * <br>
     * Space Complexity: O(1), since we only use a constant amount of extra space for the counter.<br>
     * <br>
     * @param nums an array of integers
     * @return the number of integers that have an even number of digits
     */
    public int findNumbers(int[] nums) {
        // Counter to count the number of even digit integers
        int evenDigitCount = 0;

        // Check each number to see if it has an even number of digits
        for (int num : nums) {
            if ((num >= 10 && num <= 99) || (num >= 1000 && num <= 9999) || num == 100000)
                evenDigitCount++;
        }

        return evenDigitCount;
    }
}
