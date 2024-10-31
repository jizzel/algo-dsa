package main.java.org.algodsa;

/**
 * This class represents a simple guessing game where a user has to guess a picked number.
 * It provides an API to simulate the guessing process.
 */
public class GuessGame {
    private final int pickedNumber;

    /**
     * Constructor to set the picked number for the guessing game.
     *
     * @param pickedNumber the number to be guessed
     */
    public GuessGame(int pickedNumber) {
        this.pickedNumber = pickedNumber;
    }

    /**
     * Simulates the guess API to check a user's guess against the picked number.
     *
     * @param num the number being guessed
     * @return 1 if the guessed number is lower than the picked number,
     *        -1 if the guessed number is higher than the picked number,
     *        0 if the guessed number is equal to the picked number
     */
    protected int guess(int num) {
        // num is higher than the picked number
        // num is equal to the picked number
        return Integer.compare(pickedNumber, num); // num is lower than the picked number
    }
}
