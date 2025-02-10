package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.PalindromeNumber;
import org.junit.jupiter.api.Test;

public class PalindromeNumberTest {

    @Test
    public void testPositivePalindrome() {
        PalindromeNumber checker = new PalindromeNumber();
        assertTrue(checker.isPalindrome(121), "121 should be a palindrome");
        assertTrue(checker.isPalindrome(1221), "1221 should be a palindrome");
        assertTrue(checker.isPalindrome(1), "Single-digit numbers should be palindromes");
        assertTrue(checker.isPalindrome(0), "0 should be a palindrome");
    }

    @Test
    public void testNegativeNumbers() {
        PalindromeNumber checker = new PalindromeNumber();
        assertFalse(checker.isPalindrome(-121), "-121 should not be a palindrome");
        assertFalse(checker.isPalindrome(-1), "-1 should not be a palindrome");
    }

    @Test
    public void testNonPalindromeNumbers() {
        PalindromeNumber checker = new PalindromeNumber();
        assertFalse(checker.isPalindrome(123), "123 should not be a palindrome");
        assertFalse(checker.isPalindrome(10), "10 should not be a palindrome");
        assertFalse(checker.isPalindrome(100), "100 should not be a palindrome");
    }
}
