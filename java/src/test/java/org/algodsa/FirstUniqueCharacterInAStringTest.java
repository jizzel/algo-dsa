package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.FirstUniqueCharacterInAString;
import org.junit.jupiter.api.Test;

public class FirstUniqueCharacterInAStringTest {
    private final FirstUniqueCharacterInAString solution = new FirstUniqueCharacterInAString();

    @Test
    public void testFirstUniqChar_Example1() {
        // Test case 1: Example input
        String s = "leetcode";  // First unique character is 'l' at index 0
        int expected = 0;
        int result = solution.firstUniqChar(s);
        assertEquals(expected, result, "First unique character in 'leetcode' should be at index 0");
    }

    @Test
    public void testFirstUniqChar_Example2() {
        // Test case 2: Another example input
        String s = "loveleetcode";  // First unique character is 'v' at index 2
        int expected = 2;
        int result = solution.firstUniqChar(s);
        assertEquals(expected, result, "First unique character in 'loveleetcode' should be at index 2");
    }

    @Test
    public void testFirstUniqChar_NoUniqueCharacter() {
        // Test case 3: No unique character
        String s = "aabbcc";  // No unique character
        int expected = -1;
        int result = solution.firstUniqChar(s);
        assertEquals(expected, result, "There are no unique characters in 'aabbcc'");
    }

    @Test
    public void testFirstUniqChar_SingleCharacter() {
        // Test case 4: Single character string
        String s = "z";  // Single character 'z' is unique
        int expected = 0;
        int result = solution.firstUniqChar(s);
        assertEquals(expected, result, "First unique character in 'z' should be at index 0");
    }

    @Test
    public void testFirstUniqChar_AllUniqueCharacters() {
        // Test case 5: All characters are unique
        String s = "abcdef";  // First unique character is 'a' at index 0
        int expected = 0;
        int result = solution.firstUniqChar(s);
        assertEquals(expected, result, "First unique character in 'abcdef' should be at index 0");
    }

    @Test
    public void testFirstUniqChar_MixedCase() {
        // Test case 6: Mixed case characters (ignoring case)
        String s = "aAbBcCdDeE";  // First unique character is 'a' at index 0
        int expected = 0;
        int result = solution.firstUniqChar(s);
        assertEquals(expected, result, "First unique character in 'aAbBcCdDeE' should be at index 0");
    }

    @Test
    public void testFirstUniqChar_RepeatedUniqueChar() {
        // Test case 7: String with repeated unique characters
        String s = "aab";  // First unique character is 'b' at index 2
        int expected = 2;
        int result = solution.firstUniqChar(s);
        assertEquals(expected, result, "First unique character in 'aab' should be at index 2");
    }

    @Test
    public void testFirstUniqChar_EmptyString() {
        // Test case 8: Empty string
        String s = "";  // No unique character in an empty string
        int expected = -1;
        int result = solution.firstUniqChar(s);
        assertEquals(expected, result, "An empty string should return -1");
    }
}