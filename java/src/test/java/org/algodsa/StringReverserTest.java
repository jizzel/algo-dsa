package test.java.org.algodsa;

import main.java.org.algodsa.StringReverser;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringReverserTest {

    StringReverser reverser = new StringReverser();

    @Test
    void testBasicReversal() {
        assertEquals("cba", reverser.reverse("abc"));
        assertEquals("olleh", reverser.reverse("hello"));
    }

    @Test
    void testEmptyString() {
        assertEquals("", reverser.reverse(""));
    }

    @Test
    void testNullInput() {
        assertNull(reverser.reverse(null));
    }

    @Test
    void testPalindrome() {
        assertEquals("radar", reverser.reverse("radar"));
        assertEquals("level", reverser.reverse("level"));
    }

    @Test
    void testSingleCharacter() {
        assertEquals("a", reverser.reverse("a"));
    }
}