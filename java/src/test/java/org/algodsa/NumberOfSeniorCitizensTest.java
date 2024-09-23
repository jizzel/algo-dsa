package test.java.org.algodsa;

import main.java.org.algodsa.NumberOfSeniorCitizens;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NumberOfSeniorCitizensTest {

    private NumberOfSeniorCitizens solution;

    @BeforeEach
    public void setUp() {
        solution = new NumberOfSeniorCitizens();
    }

    @Test
    public void testCountSeniorsExample1() {
        // Test case 1: Example 1
        String[] details = {"7868190130M7522", "5303914400F9211", "9273338290F4010"};
        int expected = 2;
        assertEquals(expected, solution.countSeniors(details), "The count of seniors should be 2");
    }

    @Test
    public void testCountSeniorsNoSeniors() {
        // Test case 2: No seniors
        String[] details = {"1234567890M3012", "9876543210F2523"};
        int expected = 0;
        assertEquals(expected, solution.countSeniors(details), "The count of seniors should be 0");
    }

    @Test
    public void testCountSeniorsAllSeniors() {
        // Test case 3: All are seniors
        String[] details = {"1234567890M6521", "9876543210F7311"};
        int expected = 2;
        assertEquals(expected, solution.countSeniors(details), "The count of seniors should be 2");
    }

    @Test
    public void testCountSeniorsMixed() {
        // Test case 4: Mixed seniors and non-seniors
        String[] details = {"1234567890M6521", "9876543210F2523", "5432167890M7021"};
        int expected = 2;
        assertEquals(expected, solution.countSeniors(details), "The count of seniors should be 2");
    }
}