package test.java.org.algodsa;

import main.java.org.algodsa.FindTheDifference;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FindTheDifferenceTest {

    @Test
    void testSingleExtraCharacterAtEnd() {
        FindTheDifference ftd = new FindTheDifference();
        assertEquals('e', ftd.findTheDifference("abcd", "abcde"));
    }

    @Test
    void testSingleExtraCharacterInMiddle() {
        FindTheDifference ftd = new FindTheDifference();
        assertEquals('x', ftd.findTheDifference("abcde", "abxcde"));
    }

    @Test
    void testExtraCharacterIsDuplicate() {
        FindTheDifference ftd = new FindTheDifference();
        assertEquals('a', ftd.findTheDifference("aabbcc", "aabbcca"));
    }

    @Test
    void testSingleLetterStrings() {
        FindTheDifference ftd = new FindTheDifference();
        assertEquals('y', ftd.findTheDifference("", "y"));
    }

    @Test
    void testLongInput() {
        FindTheDifference ftd = new FindTheDifference();
        String s = "abcdefghijklmnopqrstuvwxyz".repeat(1000);
        String t = s + "z";
        assertEquals('z', ftd.findTheDifference(s, t));
    }

    @Test
    void testUnexpectedInput_ReturnsFallback() {
        FindTheDifference ftd = new FindTheDifference();
        assertEquals('?', ftd.findTheDifference("abc", "abc")); // No difference
    }
}
