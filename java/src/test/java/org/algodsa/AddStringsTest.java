package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.AddStrings;
import org.junit.jupiter.api.Test;

public class AddStringsTest {

    @Test
    public void testAddStrings_Example1() {
        AddStrings solution = new AddStrings();
        String num1 = "11";
        String num2 = "123";
        String result = solution.addStrings(num1, num2);
        assertEquals("134", result, "For input '11' and '123', the result should be '134'");
    }

    @Test
    public void testAddStrings_Example2() {
        AddStrings solution = new AddStrings();
        String num1 = "456";
        String num2 = "77";
        String result = solution.addStrings(num1, num2);
        assertEquals("533", result, "For input '456' and '77', the result should be '533'");
    }

    @Test
    public void testAddStrings_Example3() {
        AddStrings solution = new AddStrings();
        String num1 = "0";
        String num2 = "0";
        String result = solution.addStrings(num1, num2);
        assertEquals("0", result, "For input '0' and '0', the result should be '0'");
    }

    @Test
    public void testAddStrings_LargeNumbers() {
        AddStrings solution = new AddStrings();
        String num1 = "987654321";
        String num2 = "123456789";
        String result = solution.addStrings(num1, num2);
        assertEquals("1111111110", result, "For input '987654321' and '123456789', the result should be '1111111110'");
    }

    @Test
    public void testAddStrings_WithCarryOver() {
        AddStrings solution = new AddStrings();
        String num1 = "999";
        String num2 = "999";
        String result = solution.addStrings(num1, num2);
        assertEquals("1998", result, "For input '999' and '999', the result should be '1998'");
    }

    @Test
    public void testAddStrings_OneNumberZero() {
        AddStrings solution = new AddStrings();
        String num1 = "0";
        String num2 = "1000";
        String result = solution.addStrings(num1, num2);
        assertEquals("1000", result, "For input '0' and '1000', the result should be '1000'");
    }

    @Test
    public void testAddStrings_DifferentLengths() {
        AddStrings solution = new AddStrings();
        String num1 = "1";
        String num2 = "9999";
        String result = solution.addStrings(num1, num2);
        assertEquals("10000", result, "For input '1' and '9999', the result should be '10000'");
    }
}