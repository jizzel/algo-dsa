package main.java.org.algodsa;
/**
 * This class extends the GuessGame class to implement a guessing number game.
 * It allows users to guess a number within a specified range and determine if
 * their guess is correct, too high, or too low.
 */
public class GuessNumberHigherOrLower extends GuessGame {

    /**
     * Constructor to initialize the picked number for the guessing game.
     * <br>
     * @param pickedNumber the number to be guessed
     */
    public GuessNumberHigherOrLower(int pickedNumber) {
        super(pickedNumber);
    }

    /**
     * <h4><a href="https://leetcode.com/problems/guess-number-higher-or-lower/">374. Guess Number Higher or Lower</a></h4>
     * This method performs a binary search to find the picked number
     * within the range from 1 to n.<br>
     * <br>
     * @param n the upper limit of the guessing range
     * @return the picked number if guessed correctly
     */
    public int guessNumber(int n) {
        int l = 1, h = n;

        while (l <= h) {
            int m = l + (h - l) / 2; // Calculate the mid-point
            int guessed = guess(m); // Use the guess API to check the guess

            if (guessed == 0) return m; // Correct guess

            if (guessed == 1) {
                l = m + 1; // Guess was too low
            } else {
                h = m - 1; // Guess was too high
            }
        }

        return h; // This line is technically unreachable since we should find the number.
    }
}
