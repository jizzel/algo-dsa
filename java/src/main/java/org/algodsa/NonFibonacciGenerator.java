package main.java.org.algodsa;

import java.util.Iterator;

/**
 * Non-Fibonacci Generator
 * A generator class for generating non-Fibonacci numbers in an infinite sequence.<br>
 * This class implements the {@code Iterator<Long>} interface, providing an infinite stream of non-Fibonacci numbers.<br>
 * <br>
 * Fibonacci numbers are skipped, and every subsequent call to {@code next()} produces the next non-Fibonacci number.<br>
 * Time Complexity:  O(1) for the next() method, similar to the NonFibonacciGenerator.
 * Space Complexity: O(1), as it only uses a fixed amount of space for the current and next
 */
public class NonFibonacciGenerator implements Iterator<Long> {
    private long current = 3; // The first Fibonacci number to start the range from
    private long next = 5;    // The next Fibonacci number in the sequence
    private long currentNonFib = current + 1; // The current non-Fibonacci number

    /**
     * Default constructor initializes the generator.<br>
     * It starts with the first non-Fibonacci number after the Fibonacci numbers 3 and 5.<br>
     */
    public NonFibonacciGenerator() {}

    /**
     * Calculates the next Fibonacci number in the sequence by shifting current and next.<br>
     * This method updates both {@code current} and {@code next} Fibonacci numbers and adjusts
     * the next non-Fibonacci number to check. <br>
     */
    private void calcNextFib() {
        long temp = current;
        current = next;
        next = next + temp;
        currentNonFib = current + 1; // Set the next possible non-Fibonacci number
    }

    /**
     * Always returns {@code true} because the generation of non-Fibonacci numbers is infinite.<br>
     * <br>
     * @return {@code true}, indicating that there are more non-Fibonacci numbers to generate.
     */
    @Override
    public boolean hasNext() {
        return true;
    }

    /**
     * Returns the next non-Fibonacci number in the sequence.<br>
     * If the current candidate non-Fibonacci number matches or exceeds the next Fibonacci number,
     * the Fibonacci sequence is updated, and the next non-Fibonacci number is generated.<br>
     * <br>
     * @return the next non-Fibonacci number.
     */
    @Override
    public Long next() {
        // If the current non-Fibonacci number reaches or surpasses the next Fibonacci number, update Fibonacci sequence
        if (currentNonFib >= next) {
            calcNextFib();
        }
        return currentNonFib++; // Return the next non-Fibonacci number and increment for future calls
    }
}
