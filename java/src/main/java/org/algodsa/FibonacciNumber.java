package main.java.org.algodsa;

/**
 * Fibonacci Number
 */
public class FibonacciNumber {

    /**
     * Constructor
     */
    public FibonacciNumber(){}

    /**
     * <h4><a href="https://leetcode.com/problems/fibonacci-number/description/">Fibonacci Number</a></h4>
     * Calculates the nth Fibonacci number.<br>
     * <br>
     * The Fibonacci sequence is defined as follows:<br>
     * fib(0) = 0, fib(1) = 1, fib(n) = fib(n-1) + fib(n-2) for n >= 2.<br>
     * <br>
     * This method uses an iterative approach to calculate the Fibonacci number,
     * ensuring O(n) time complexity and O(1) space complexity.<br>
     * <br>
     * @param n The position in the Fibonacci sequence to calculate (0-indexed).
     * @return The nth Fibonacci number.
     */
    public int fib(int n) {
        if (n < 2) return n;  // Base cases for n = 0 and n = 1

        int a = 0;  // fib(0)
        int b = 1;  // fib(1)

        for (int i = 2; i <= n; i++) {
            int curr = a + b;  // Calculate the current Fibonacci number
            a = b;             // Move to the next number in the sequence
            b = curr;         // Update b to be the current number
        }

        return b;  // b now contains fib(n)
    }
}
