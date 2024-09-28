package test.java.org.algodsa;

import main.java.org.algodsa.WordPattern;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordPatternTest {
    WordPattern solution = new WordPattern();

    @Test
    public void testWordPattern() {
        assertTrue(solution.wordPattern("abba", "dog cat cat dog"));
        assertFalse(solution.wordPattern("abba", "dog cat cat fish"));
        assertFalse(solution.wordPattern("aaaa", "dog cat cat dog"));
        assertFalse(solution.wordPattern("abba", "dog dog dog dog"));
    }


}