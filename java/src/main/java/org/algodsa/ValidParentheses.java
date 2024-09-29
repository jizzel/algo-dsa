package main.java.org.algodsa;

import java.util.Map;
import java.util.Stack;

/**
 * The {@code ValidParentheses} class provides a method to validate if a given string
 * of parentheses (which can include round brackets '()', curly braces '{}', and
 * square brackets '[]') is valid. A valid string has properly matched and nested
 * opening and closing brackets.
 */
public class ValidParentheses {

    /**
     * Constructor
     */
    public ValidParentheses(){}

    /**
     * <h4><a href="https://leetcode.com/problems/valid-parentheses/description/">20. Valid Parentheses</a></h4>
     * Checks if a given string contains valid parentheses.<br>
     * <br>
     * @param s The input string containing parentheses characters '()', '{}', and '[]'.<br>
     * @return {@code true} if the input string has valid parentheses, {@code false} otherwise.<br>
     * <br>
     * <b>Time Complexity:</b> O(n), where n is the length of the input string.<br>
     * Each character is processed once.<br>
     * <br>
     * <b>Space Complexity:</b> O(n) in the worst case, where n is the length of
     * the input string, due to the space used by the stack for unmatched opening brackets.
     */
    public boolean isValid(String s) {
        // Map to store closing brackets as keys and their corresponding opening brackets as values
        Map<Character, Character> map = Map.of(
                ')', '(',
                '}', '{',
                ']', '['
        );

        // Stack to keep track of opening brackets
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            // If it's a closing bracket
            if (map.containsKey(ch)) {
                // Check if the stack is empty or if the last opening bracket doesn't match the current closing bracket
                if (stack.isEmpty() || stack.pop() != map.get(ch)) {
                    return false;
                }
            }
            // If it's an opening bracket, push it onto the stack
            else {
                stack.push(ch);
            }
        }

        // If the stack is empty, all brackets were properly matched
        return stack.isEmpty();
    }
}