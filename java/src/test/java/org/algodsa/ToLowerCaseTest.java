package test.java.org.algodsa;

import main.java.org.algodsa.ToLowerCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToLowerCaseTest {
    ToLowerCase solution = new ToLowerCase();

    @Test
    public void testToLowerCase() {
        assertEquals("hello", solution.toLowerCase("Hello"));
        assertEquals("here", solution.toLowerCase("here"));
        assertEquals("lovely", solution.toLowerCase("LOVELY"));
    }

}