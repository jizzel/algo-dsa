package main.java.org.algodsa;

/**
 * The {@code NimGame} class provides a solution to the classic Nim Game problem.
 * In this game, two players take turns removing 1 to 3 stones from a pile.
 * The player who removes the last stone wins. You always go first.
 */
public class NimGame {

    /**
     * Default constructor.
     */
    public NimGame() {}

    /**
     * <h4><a href="https://leetcode.com/problems/nim-game/">292. Nim Game</a></h4>
     * Determines whether you can win the Nim game given {@code n} stones.
     * <br>
     * The winning strategy is based on the observation that:
     * - If {@code n % 4 == 0}, the player who starts will always lose
     *   (assuming both play optimally).
     * - Otherwise, the starting player can always force a win.
     * <br><br>
     * Time Complexity: O(1)
     *   - The check is a constant-time arithmetic operation.
     * <br>
     * Space Complexity: O(1)
     *   - No additional space used.
     * <br><br>
     * @param n the number of stones in the pile
     * @return {@code true} if you can win the game, otherwise {@code false}
     */
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}
