package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.FibonacciNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FibonacciNumberTest {

    private FibonacciNumber solution;

    @BeforeEach
    public void setUp() {
        solution = new FibonacciNumber();
    }

    @Test
    public void testFibonacciZero() {
        // Test case when n = 0
        assertEquals(0, solution.fib(0), "The Fibonacci of 0 should be 0");
    }

    @Test
    public void testFibonacciOne() {
        // Test case when n = 1
        assertEquals(1, solution.fib(1), "The Fibonacci of 1 should be 1");
    }

    @Test
    public void testFibonacciSmallNumber() {
        // Test case when n = 5 (Fibonacci sequence: 0, 1, 1, 2, 3, 5)
        assertEquals(5, solution.fib(5), "The Fibonacci of 5 should be 5");
    }

    @Test
    public void testFibonacciLargerNumber() {
        // Test case when n = 10 (Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55)
        assertEquals(55, solution.fib(10), "The Fibonacci of 10 should be 55");
    }

    @Test
    public void testFibonacciEvenLargerNumber() {
        // Test case when n = 20 (Fibonacci sequence grows larger)
        assertEquals(6765, solution.fib(20), "The Fibonacci of 20 should be 6765");
    }

    @Test
    public void testFibonacciHigherValue() {
        // Test case when n = 30
        assertEquals(832040, solution.fib(30), "The Fibonacci of 30 should be 832040");
    }
}