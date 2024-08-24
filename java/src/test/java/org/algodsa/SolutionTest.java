package test.java.org.algodsa;

import main.java.org.algodsa.Solution;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class SolutionTest {

    @Test
    public void testDetectCapitalUse() {
        assertTrue(Solution.detectCapitalUse("USA"));
        assertTrue(Solution.detectCapitalUse("leetcode"));
        assertTrue(Solution.detectCapitalUse("Google"));
        assertFalse(Solution.detectCapitalUse("FlaG"));
    }

    @Test
    public void testWordPattern() {
        assertTrue(Solution.wordPattern("abba", "dog cat cat dog"));
        assertFalse(Solution.wordPattern("abba", "dog cat cat fish"));
        assertFalse(Solution.wordPattern("aaaa", "dog cat cat dog"));
        assertFalse(Solution.wordPattern("abba", "dog dog dog dog"));
    }

    @Test
    public void testAddBinary() {
        assertEquals("101", Solution.addBinary("100", "1"));
        assertEquals("100", Solution.addBinary("11", "1"));
        assertEquals("110", Solution.addBinary("11", "11"));
        assertEquals(
                "110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000",
                Solution.addBinary(
                        "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
                        "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
    }

    @Test
    public void testLengthOfLastWord() {
        assertEquals(5, Solution.lengthOfLastWord("Hello World"));
        assertEquals(4, Solution.lengthOfLastWord("   fly me   to   the moon  "));
        assertEquals(6, Solution.lengthOfLastWord("luffy is still joyboy"));
    }

    @Test
    public void testStrStr() {
        assertEquals(2, Solution.strStr("hello", "ll"));
        assertEquals(-1, Solution.strStr("aaaaa", "bba"));
        assertEquals(0, Solution.strStr("a", "a"));
    }

    @Test
    public void testRepeatedSubstringPattern() {
        assertTrue(Solution.repeatedSubstringPattern("abab"));
        assertFalse(Solution.repeatedSubstringPattern("aba"));
        assertTrue(Solution.repeatedSubstringPattern("abcabcabcabc"));
    }

    @Test
    public void testToLowerCase() {
        assertEquals("hello", Solution.toLowerCase("Hello"));
        assertEquals("here", Solution.toLowerCase("here"));
        assertEquals("lovely", Solution.toLowerCase("LOVELY"));
    }

    @Test
    public void testFizzBuzz() {
        List<String> result = Solution.fizzBuzz(15);
        assertEquals("1", result.get(0));
        assertEquals("2", result.get(1));
        assertEquals("Fizz", result.get(2));
        assertEquals("4", result.get(3));
        assertEquals("Buzz", result.get(4));
        assertEquals("FizzBuzz", result.get(14));
    }

    @Test
    public void testLongestCommonPrefix() {
        assertEquals("fl", Solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        assertEquals("", Solution.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        assertEquals("a", Solution.longestCommonPrefix(new String[]{"a"}));
    }
}
