package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.ValidPalindrome;
import org.junit.jupiter.api.Test;

public class ValidPalindromeTest {

    @Test
    public void testBasicPalindromes() {
        ValidPalindrome vp = new ValidPalindrome();
        assertTrue(vp.isPalindrome("racecar"), "racecar is a palindrome");
        assertTrue(vp.isPalindrome("madam"), "madam is a palindrome");
        assertTrue(vp.isPalindrome("Aba"), "Case-insensitive check for Aba");
    }

    @Test
    public void testNonPalindromes() {
        ValidPalindrome vp = new ValidPalindrome();
        assertFalse(vp.isPalindrome("hello"), "hello is not a palindrome");
        assertFalse(vp.isPalindrome("world"), "world is not a palindrome");
    }

    @Test
    public void testPalindromeWithSpacesAndPunctuation() {
        ValidPalindrome vp = new ValidPalindrome();
        assertTrue(vp.isPalindrome("A man, a plan, a canal: Panama"), "Ignoring spaces and punctuation");
        assertTrue(vp.isPalindrome("No 'x' in Nixon"), "Ignoring spaces and punctuation");
        assertTrue(vp.isPalindrome("Was it a car or a cat I saw?"), "Ignoring spaces and punctuation");
    }

    @Test
    public void testEmptyStringAndSingleCharacter() {
        ValidPalindrome vp = new ValidPalindrome();
        assertTrue(vp.isPalindrome(""), "An empty string is a palindrome");
        assertTrue(vp.isPalindrome("a"), "A single character is always a palindrome");
    }

    @Test
    public void testNumericPalindromes() {
        ValidPalindrome vp = new ValidPalindrome();
        assertTrue(vp.isPalindrome("12321"), "Numbers forming a palindrome");
        assertFalse(vp.isPalindrome("123456"), "123456 is not a palindrome");
    }

    @Test
    public void testMixedCaseAndSymbols() {
        ValidPalindrome vp = new ValidPalindrome();
        assertTrue(vp.isPalindrome("RaceCar!"), "Case-insensitive with special characters");
        assertTrue(vp.isPalindrome("123aBccBA321"), "Mixed case and numbers should still be a palindrome");
    }
}
