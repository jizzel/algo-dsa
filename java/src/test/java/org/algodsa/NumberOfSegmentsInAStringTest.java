package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.NumberOfSegmentsInAString;
import org.junit.jupiter.api.Test;

public class NumberOfSegmentsInAStringTest {

    @Test
    public void testCountSegments_Example1() {
        NumberOfSegmentsInAString solution = new NumberOfSegmentsInAString();
        String s = "Hello, my name is John";
        int result = solution.countSegments(s);
        assertEquals(5, result, "For input 'Hello, my name is John', the result should be 5 segments.");
    }

    @Test
    public void testCountSegments_EmptyString() {
        NumberOfSegmentsInAString solution = new NumberOfSegmentsInAString();
        String s = "";
        int result = solution.countSegments(s);
        assertEquals(0, result, "For an empty string, the result should be 0 segments.");
    }

    @Test
    public void testCountSegments_OnlySpaces() {
        NumberOfSegmentsInAString solution = new NumberOfSegmentsInAString();
        String s = "     ";
        int result = solution.countSegments(s);
        assertEquals(0, result, "For a string with only spaces, the result should be 0 segments.");
    }

    @Test
    public void testCountSegments_SingleWord() {
        NumberOfSegmentsInAString solution = new NumberOfSegmentsInAString();
        String s = "word";
        int result = solution.countSegments(s);
        assertEquals(1, result, "For input 'word', the result should be 1 segment.");
    }

    @Test
    public void testCountSegments_MultipleSpacesBetweenWords() {
        NumberOfSegmentsInAString solution = new NumberOfSegmentsInAString();
        String s = "Hello    world  again";
        int result = solution.countSegments(s);
        assertEquals(3, result, "For input 'Hello    world  again', the result should be 3 segments.");
    }

    @Test
    public void testCountSegments_LeadingAndTrailingSpaces() {
        NumberOfSegmentsInAString solution = new NumberOfSegmentsInAString();
        String s = "   Leading and trailing spaces   ";
        int result = solution.countSegments(s);
        assertEquals(4, result, "For input with leading and trailing spaces, the result should be 4 segments.");
    }

    @Test
    public void testCountSegments_OneLetterPerWord() {
        NumberOfSegmentsInAString solution = new NumberOfSegmentsInAString();
        String s = "a b c d e";
        int result = solution.countSegments(s);
        assertEquals(5, result, "For input 'a b c d e', the result should be 5 segments.");
    }
}