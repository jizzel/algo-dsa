package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.ReverseVowelsOfAString;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReverseVowelsOfAStringTest {

    private ReverseVowelsOfAString solution;

    @BeforeEach
    public void setUp() {
        solution = new ReverseVowelsOfAString();
    }

    @Test
    public void testReverseVowelsSimple() {
        // Test a simple string with vowels in reverse
        assertEquals("holle", solution.reverseVowels("hello"), "The reversed vowels of 'hello' should result in 'holle'");
    }

    @Test
    public void testReverseVowelsWithUpperCase() {
        // Test with uppercase vowels included
        assertEquals("hollO", solution.reverseVowels("hOllo"), "The reversed vowels of 'hOllo' should result in 'hOlle'");
    }

    @Test
    public void testReverseVowelsNoVowels() {
        // Test when there are no vowels
        assertEquals("bcdfg", solution.reverseVowels("bcdfg"), "If there are no vowels, the string should remain 'bcdfg'");
    }

    @Test
    public void testReverseVowelsAllVowels() {
        // Test when all characters are vowels
        assertEquals("uoiea", solution.reverseVowels("aeiou"), "The reversed vowels of 'aeiou' should be 'uoiea'");
    }

    @Test
    public void testReverseVowelsOneVowel() {
        // Test when there is only one vowel
        assertEquals("test", solution.reverseVowels("test"), "If there is only one vowel, the string should remain 'test'");
    }

    @Test
    public void testReverseVowelsEmptyString() {
        // Test an empty string
        assertEquals("", solution.reverseVowels(""), "An empty string should return an empty string");
    }

    @Test
    public void testReverseVowelsWithSpaces() {
        // Test with spaces included in the string
        assertEquals("leot cede", solution.reverseVowels("leet code"), "The reversed vowels of 'leet code' should result in 'leot cede'");
    }

    @Test
    public void testReverseVowelsSpecialCharacters() {
        // Test with special characters
        assertEquals("H@llo!", solution.reverseVowels("H@llo!"), "The reversed vowels of 'H@llo!' should result in 'H@lle!'");
    }
}