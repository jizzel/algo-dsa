package test.java.org.algodsa;

import main.java.org.algodsa.ValidAnagram;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidAnagramTest {

    ValidAnagram validAnagram = new ValidAnagram();

    @Test
    void testBasicAnagrams() {
        assertTrue(validAnagram.isAnagram("listen", "silent"));
        assertTrue(validAnagram.isAnagramII("listen", "silent"));

        assertTrue(validAnagram.isAnagram("anagram", "nagaram"));
        assertTrue(validAnagram.isAnagramII("anagram", "nagaram"));
    }

    @Test
    void testDifferentLengths() {
        assertFalse(validAnagram.isAnagram("rat", "carrot"));
        assertFalse(validAnagram.isAnagramII("rat", "carrot"));
    }

    @Test
    void testSameLengthButNotAnagrams() {
        assertFalse(validAnagram.isAnagram("hello", "world"));
        assertFalse(validAnagram.isAnagramII("hello", "world"));
    }

    @Test
    void testEmptyStrings() {
        assertTrue(validAnagram.isAnagram("", ""));
        assertTrue(validAnagram.isAnagramII("", ""));
    }

    @Test
    void testSingleCharacter() {
        assertTrue(validAnagram.isAnagram("a", "a"));
        assertFalse(validAnagram.isAnagram("a", "b"));

        assertTrue(validAnagram.isAnagramII("a", "a"));
        assertFalse(validAnagram.isAnagramII("a", "b"));
    }

    @Test
    void testAnagramWithRepeats() {
        assertTrue(validAnagram.isAnagram("aabbcc", "baccab"));
        assertTrue(validAnagram.isAnagramII("aabbcc", "baccab"));
    }
}
