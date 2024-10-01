package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.ScoreOfAString;
import org.junit.jupiter.api.Test;

public class ScoreOfAStringTest {

    @Test
    public void testScoreOfString_Example1() {
        ScoreOfAString solution = new ScoreOfAString();
        String s = "abc";
        int result = solution.scoreOfString(s);
        assertEquals(2, result, "For input 'abc', the result should be 2.");
    }

    @Test
    public void testScoreOfString_Example2() {
        ScoreOfAString solution = new ScoreOfAString();
        String s = "abz";
        int result = solution.scoreOfString(s);
        assertEquals(25, result, "For input 'abz', the result should be 25.");
    }

    @Test
    public void testScoreOfString_SingleCharacter() {
        ScoreOfAString solution = new ScoreOfAString();
        String s = "a";
        int result = solution.scoreOfString(s);
        assertEquals(0, result, "For input 'a' (single character), the result should be 0.");
    }

    @Test
    public void testScoreOfString_EmptyString() {
        ScoreOfAString solution = new ScoreOfAString();
        String s = "";
        int result = solution.scoreOfString(s);
        assertEquals(0, result, "For an empty string, the result should be 0.");
    }

    @Test
    public void testScoreOfString_RepeatedCharacters() {
        ScoreOfAString solution = new ScoreOfAString();
        String s = "aaaa";
        int result = solution.scoreOfString(s);
        assertEquals(0, result, "For input 'aaaa', the result should be 0.");
    }
}