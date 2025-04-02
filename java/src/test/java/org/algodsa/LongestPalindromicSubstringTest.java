package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.LongestPalindromicSubstring;
import org.junit.jupiter.api.Test;

public class LongestPalindromicSubstringTest {

    @Test
    public void testBasicCases() {
        LongestPalindromicSubstring solver = new LongestPalindromicSubstring();

        assertEquals("aba", solver.longestPalindrome("babad")); // Can also be "bab"
        assertEquals("bb", solver.longestPalindrome("cbbd"));
        assertEquals("a", solver.longestPalindrome("a"));
        assertEquals("", solver.longestPalindrome(""));
        assertEquals("ccc", solver.longestPalindrome("ccc"));
    }

    @Test
    public void testSingleCharacterString() {
        LongestPalindromicSubstring solver = new LongestPalindromicSubstring();
        assertEquals("z", solver.longestPalindrome("z"));
    }

    @Test
    public void testAllCharactersSame() {
        LongestPalindromicSubstring solver = new LongestPalindromicSubstring();
        assertEquals("aaaaa", solver.longestPalindrome("aaaaa"));
    }

    @Test
    public void testLongString() {
        LongestPalindromicSubstring solver = new LongestPalindromicSubstring();
        assertEquals("anana", solver.longestPalindrome("banana"));
    }
}
