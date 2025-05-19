package test.java.org.algodsa;

import main.java.org.algodsa.IsomorphicStrings;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IsomorphicStringsTest {

    IsomorphicStrings iso = new IsomorphicStrings();

    @Test
    void testBasicIsomorphicPairs() {
        assertTrue(iso.isIsomorphic("egg", "add"));
        assertTrue(iso.isIsomorphicII("egg", "add"));

        assertTrue(iso.isIsomorphic("paper", "title"));
        assertTrue(iso.isIsomorphicII("paper", "title"));
    }

    @Test
    void testNonIsomorphicPairs() {
        assertFalse(iso.isIsomorphic("foo", "bar"));
        assertFalse(iso.isIsomorphicII("foo", "bar"));

        assertFalse(iso.isIsomorphic("ab", "aa"));
        assertFalse(iso.isIsomorphicII("ab", "aa"));
    }

    @Test
    void testIdenticalStrings() {
        assertTrue(iso.isIsomorphic("abc", "abc"));
        assertTrue(iso.isIsomorphicII("abc", "abc"));
    }

    @Test
    void testEmptyStrings() {
        assertTrue(iso.isIsomorphic("", ""));
        assertTrue(iso.isIsomorphicII("", ""));
    }

    @Test
    void testSingleCharacterStrings() {
        assertTrue(iso.isIsomorphic("a", "z"));
        assertTrue(iso.isIsomorphicII("a", "z"));
    }

    @Test
    void testLengthMismatch() {
        assertFalse(iso.isIsomorphic("ab", "abc"));
        assertFalse(iso.isIsomorphicII("ab", "abc"));
    }

    @Test
    void testRepeatingCharactersMappingToDifferentOnes() {
        assertFalse(iso.isIsomorphic("abba", "abab"));
        assertFalse(iso.isIsomorphicII("abba", "abab"));
    }

    @Test
    void testUnicodeSupport() {
        // These methods use 256-char arrays, so technically ASCII based; avoid true Unicode
        assertTrue(iso.isIsomorphic("ⱭⱮⱭ", "xyx"));
    }
}
