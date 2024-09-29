package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.ValidParentheses;
import org.junit.jupiter.api.Test;

public class ValidParenthesesTest {
    ValidParentheses solution = new ValidParentheses();

    @Test
    public void testValidParentheses_Example1() {
        String s = "()";
        assertTrue(solution.isValid(s), "For input '()', the result should be true");
    }

    @Test
    public void testValidParentheses_Example2() {
        String s = "()[]{}";
        assertTrue(solution.isValid(s), "For input '()[]{}', the result should be true");
    }

    @Test
    public void testValidParentheses_Example3() {
        String s = "(]";
        assertFalse(solution.isValid(s), "For input '(]', the result should be false");
    }

    @Test
    public void testValidParentheses_Example4() {
        String s = "([)]";
        assertFalse(solution.isValid(s), "For input '([)]', the result should be false");
    }

    @Test
    public void testValidParentheses_Example5() {
        String s = "{[]}";
        assertTrue(solution.isValid(s), "For input '{[]}', the result should be true");
    }

    @Test
    public void testValidParentheses_EmptyString() {
        String s = "";
        assertTrue(solution.isValid(s), "For empty input, the result should be true");
    }

    @Test
    public void testValidParentheses_OnlyOpeningBrackets() {
        String s = "(((";
        assertFalse(solution.isValid(s), "For input '(((', the result should be false");
    }

    @Test
    public void testValidParentheses_OnlyClosingBrackets() {
        String s = ")))";
        assertFalse(solution.isValid(s), "For input ')))', the result should be false");
    }

    @Test
    public void testValidParentheses_MixedCharacters() {
        String s = "[{a+b}(c*d)]";
        assertFalse(solution.isValid(s), "For input '[{a+b}(c*d)]', the result should be false (non-bracket characters)");
    }

    @Test
    public void testValidParentheses_NestedBrackets() {
        String s = "[({})]";
        assertTrue(solution.isValid(s), "For input '[({})]', the result should be true");
    }

    @Test
    public void testValidParentheses_ExtraClosingBracket() {
        String s = "([]})";
        assertFalse(solution.isValid(s), "For input '([]})', the result should be false (extra closing bracket)");
    }
}