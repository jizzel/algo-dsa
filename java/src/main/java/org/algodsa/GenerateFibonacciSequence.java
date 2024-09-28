package main.java.org.algodsa;

import java.util.Iterator;

/**
 * Fibonacci Generator<br><br>
 * <a href="https://leetcode.com/problems/generate-fibonacci-sequence/">Generate Fibonacci Sequence</a>
 * FibonacciGenerator generates an infinite sequence of Fibonacci numbers.<br>
 * <br>
 * The class implements the {@link Iterator<Long>} interface, allowing users to iterate
 * through Fibonacci numbers indefinitely. The Fibonacci sequence starts with
 * 0 and 1, and each subsequent number is the sum of the two preceding ones.<br>
 * <br>
 * Example:<br>
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, ...<br>
 * Time Complexity:  O(1) for the next() method, similar to the NonFibonacciGenerator.
 * Space Complexity: O(1), as it only uses a fixed amount of space for the current and next
 */
public class GenerateFibonacciSequence implements Iterator<Long> {

    /**
     * Constructor
     */
    public GenerateFibonacciSequence(){}

    // The current Fibonacci number
    private long current = 0;

    // The next Fibonacci number in the sequence
    private long next = 1;

    /**
     * This method always returns true since the Fibonacci sequence is infinite.
     *
     * @return true (indicating there are more elements)
     */
    @Override
    public boolean hasNext() {
        // Infinite Fibonacci generation, always has the next number
        return true;
    }

    /**
     * Returns the next Fibonacci number in the sequence.<br>
     * <br>
     * This method calculates the next Fibonacci number by updating the `current`
     * and `next` variables to represent the next pair of numbers in the sequence.<br>
     * <br>
     * @return The current Fibonacci number
     */
    @Override
    public Long next() {
        // Store the current Fibonacci number
        long curr = current;

        // Move to the next Fibonacci number
        current = next;
        next = next + curr;

        // Return the current number in the sequence
        return curr;
    }
}
