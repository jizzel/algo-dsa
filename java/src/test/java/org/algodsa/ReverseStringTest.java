package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.ReverseString;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReverseStringTest {

    private ReverseString solution;

    @BeforeEach
    public void setUp() {
        solution = new ReverseString();
    }

    @Test
    public void testReverseString_evenLength() {
        char[] input = {'h', 'e', 'l', 'l', 'o'};
        char[] expected = {'o', 'l', 'l', 'e', 'h'};

        solution.reverseString(input);
        assertArrayEquals(expected, input, "The array should be reversed for an even-length input");
    }

    @Test
    public void testReverseString_oddLength() {
        char[] input = {'t', 'e', 's', 't', 's'};
        char[] expected = {'s', 't', 's', 'e', 't'};

        solution.reverseString(input);
        assertArrayEquals(expected, input, "The array should be reversed for an odd-length input");
    }

    @Test
    public void testReverseString2_oddLength() {
        char[] input = {'t', 'e', 's', 't', 's'};
        char[] expected = {'s', 't', 's', 'e', 't'};

        solution.reverseString2(input);
        assertArrayEquals(expected, input, "The array should be reversed for an odd-length input");
    }

    @Test
    public void testReverseString_singleCharacter() {
        char[] input = {'a'};
        char[] expected = {'a'};

        solution.reverseString(input);
        assertArrayEquals(expected, input, "The array with a single character should remain unchanged");
    }

    @Test
    public void testReverseString_emptyArray() {
        char[] input = {};
        char[] expected = {};

        solution.reverseString(input);
        assertArrayEquals(expected, input, "The array should remain unchanged for an empty array");
    }
}
