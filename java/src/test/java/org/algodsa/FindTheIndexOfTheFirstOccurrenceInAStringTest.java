package test.java.org.algodsa;

import main.java.org.algodsa.FindTheIndexOfTheFirstOccurrenceInAString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheIndexOfTheFirstOccurrenceInAStringTest {
    FindTheIndexOfTheFirstOccurrenceInAString solution = new FindTheIndexOfTheFirstOccurrenceInAString();

    @Test
    public void testStrStr() {
        assertEquals(2, solution.strStr("hello", "ll"));
        assertEquals(-1, solution.strStr("aaaaa", "bba"));
        assertEquals(0, solution.strStr("a", "a"));
    }

}