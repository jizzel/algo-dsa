package test.java.org.algodsa;

import main.java.org.algodsa.ValidPalindromeII;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidPalindromeIITest {

    ValidPalindromeII solution = new ValidPalindromeII();

    @Test
    void testValidPalindrome_TrueCases() {
        assertTrue(solution.validPalindrome("aba"));              // Already a palindrome
        assertTrue(solution.validPalindrome("abca"));             // Can become "aba" or "aca"
        assertTrue(solution.validPalindrome("deeee"));            // Remove 'd'
        assertTrue(solution.validPalindrome("cbbcc"));            // Remove middle 'b'
        assertTrue(solution.validPalindrome("a"));                // Single char
        assertTrue(solution.validPalindrome(""));                 // Empty string
    }

    @Test
    void testValidPalindrome_FalseCases() {
        assertFalse(solution.validPalindrome("abc"));             // Needs more than one deletion
        assertFalse(solution.validPalindrome("abcdef"));         // 'x' at end ruins it
    }

    @Test
    void testValidPalindrome_AlreadyPalindrome() {
        assertTrue(solution.validPalindrome("racecar"));
        assertTrue(solution.validPalindrome("madam"));
        assertTrue(solution.validPalindrome("noon"));
    }

    @Test
    void testValidPalindrome_CaseWithDeletionAtEndOrStart() {
        assertFalse(solution.validPalindrome("abccaa"));
        assertTrue(solution.validPalindrome("aabccaa"));
    }
}
