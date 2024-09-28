package test.java.org.algodsa;

import main.java.org.algodsa.LengthOfLastWord;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWordTest {
    LengthOfLastWord solution = new LengthOfLastWord();

    @Test
    public void testLengthOfLastWord() {
        assertEquals(5, solution.lengthOfLastWord("Hello World"));
        assertEquals(4, solution.lengthOfLastWord("   fly me   to   the moon  "));
        assertEquals(6, solution.lengthOfLastWord("luffy is still joyboy"));
    }

}