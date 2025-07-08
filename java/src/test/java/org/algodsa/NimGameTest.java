package test.java.org.algodsa;

import main.java.org.algodsa.NimGame;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NimGameTest {

    NimGame game = new NimGame();

    @Test
    void testLosingPositions() {
        // Losing positions: multiples of 4
        assertFalse(game.canWinNim(4));
        assertFalse(game.canWinNim(8));
        assertFalse(game.canWinNim(12));
        assertFalse(game.canWinNim(100));
    }

    @Test
    void testWinningPositions() {
        // Winning positions: anything not a multiple of 4
        assertTrue(game.canWinNim(1));
        assertTrue(game.canWinNim(2));
        assertTrue(game.canWinNim(3));
        assertTrue(game.canWinNim(5));
        assertTrue(game.canWinNim(7));
        assertTrue(game.canWinNim(9));
        assertTrue(game.canWinNim(101));
    }
}
