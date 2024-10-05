package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.GenerateFibonacciSequence;
import org.junit.jupiter.api.Test;

public class GenerateFibonacciSequenceTest {

    private GenerateFibonacciSequence generator;

    @Test
    public void testFirstFiveFibonacciNumbers() {
        generator = new GenerateFibonacciSequence();
        // The first 5 Fibonacci numbers are: 0, 1, 1, 2, 3
        assertEquals(0, generator.next(), "The first Fibonacci number should be 0");
        assertEquals(1, generator.next(), "The second Fibonacci number should be 1");
        assertEquals(1, generator.next(), "The third Fibonacci number should be 1");
        assertEquals(2, generator.next(), "The fourth Fibonacci number should be 2");
        assertEquals(3, generator.next(), "The fifth Fibonacci number should be 3");
    }

    @Test
    public void testNextFibonacciNumbers() {
        generator = new GenerateFibonacciSequence();
        // Generate the first 6 Fibonacci numbers: 0, 1, 1, 2, 3, 5
        for (int i = 0; i < 5; i++) {
            generator.next(); // skip first 5 numbers
        }
        assertEquals(5, generator.next(), "The sixth Fibonacci number should be 5");
        assertEquals(8, generator.next(), "The seventh Fibonacci number should be 8");
        assertEquals(13, generator.next(), "The eighth Fibonacci number should be 13");
    }

    @Test
    public void testLargeFibonacciNumber() {
        generator = new GenerateFibonacciSequence();
        // Skip the first 50 Fibonacci numbers and get the 51st
        for (int i = 0; i < 50; i++) {
            generator.next();
        }
        assertEquals(12586269025L, generator.next(), "The 51st Fibonacci number should be 12586269025");
    }
}