package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.LongestPalindrome;
import org.junit.jupiter.api.Test;

public class LongestPalindromeTest {

    @Test
    public void testAllEvenFrequencies() {
        LongestPalindrome lp = new LongestPalindrome();
        assertEquals(6, lp.longestPalindrome("aabbcc"), "All characters have even counts, full length should be used");
        assertEquals(8, lp.longestPalindrome("aabbccdd"), "All characters have even counts, full length should be used");
    }

    @Test
    public void testWithOddFrequencies() {
        LongestPalindrome lp = new LongestPalindrome();
        assertEquals(7, lp.longestPalindrome("abccccdd"), "One odd character can be placed in the center");
        assertEquals(1, lp.longestPalindrome("abcde"), "Only one odd character can be used in the center");
    }

    @Test
    public void testSingleCharacter() {
        LongestPalindrome lp = new LongestPalindrome();
        assertEquals(1, lp.longestPalindrome("a"), "A single character is always a palindrome of length 1");
        assertEquals(1, lp.longestPalindrome("z"), "A single character is always a palindrome of length 1");
    }

    @Test
    public void testEmptyString() {
        LongestPalindrome lp = new LongestPalindrome();
        assertEquals(0, lp.longestPalindrome(""), "An empty string should return 0");
    }

    @Test
    public void testStringWithAllUniqueCharacters() {
        LongestPalindrome lp = new LongestPalindrome();
        assertEquals(1, lp.longestPalindrome("abcdef"), "Only one character can be in the center, max length is 1");
    }
}
