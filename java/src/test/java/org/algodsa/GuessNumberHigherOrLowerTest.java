package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.GuessNumberHigherOrLower;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GuessNumberHigherOrLowerTest {

    private GuessNumberHigherOrLower guessGame;

    // Mocking the GuessGame's behavior
    private int pickedNumber;

    @BeforeEach
    public void setUp() {
        pickedNumber = 6; // Example picked number for testing
        guessGame = new GuessNumberHigherOrLower(pickedNumber) {
            @Override
            protected int guess(int num) {
                if (num < pickedNumber) {
                    return 1; // Guess too low
                } else if (num > pickedNumber) {
                    return -1; // Guess too high
                } else {
                    return 0; // Correct guess
                }
            }
        };
    }

    @Test
    public void testGuessNumberCorrectGuess() {
        assertEquals(pickedNumber, guessGame.guessNumber(10)); // Picking a number within range
    }

    @Test
    public void testGuessNumberLowGuess() {
        assertEquals(pickedNumber, guessGame.guessNumber(8)); // Picking a higher number
    }

    @Test
    public void testGuessNumberSingleOption() {
        guessGame = new GuessNumberHigherOrLower(1) {
            @Override
            protected int guess(int num) {
                return num == 1 ? 0 : -1; // Only one number to guess
            }
        };
        assertEquals(1, guessGame.guessNumber(1)); // The only option
    }
}
