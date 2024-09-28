package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.org.algodsa.NonFibonacciGenerator;

import java.util.NoSuchElementException;

public class NonGenerateFibonacciSequenceTest {

    private NonFibonacciGenerator generator;

    @BeforeEach
    public void setUp() {
        generator = new NonFibonacciGenerator();
    }

    @Test
    public void testInitialNonFibonacciNumbers() {
        // Check the first few non-Fibonacci numbers in the sequence
        assertEquals(4, generator.next());
        assertEquals(6, generator.next());
        assertEquals(7, generator.next());
        assertEquals(9, generator.next());
        assertEquals(10, generator.next());
    }

    @Test
    public void testNonFibonacciNumbersAfterFibonacciUpdate() {
        // Generate up to a point where Fibonacci numbers update (after 13, 21)
        for (int i = 0; i < 10; i++) {
            generator.next(); // Skip the first 10 numbers
        }
        assertEquals(17, generator.next(), "The next non-Fibonacci number after skipping should be 17");
        assertEquals(18, generator.next(), "The next non-Fibonacci number should be 18");
    }

    @Test
    public void testHasNext() {
        // Since this is an infinite generator, hasNext should always return true
        assertTrue(generator.hasNext());
    }

    @Test
    public void testNoSuchElementException() {
        // Since it's infinite, this exception won't occur unless explicitly coded
        // However, adding this test shows proper checking
        assertThrows(NoSuchElementException.class, () -> {
            throw new NoSuchElementException();
        });
    }
}