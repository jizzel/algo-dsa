package main.java.org.algodsa;

/**
 * A generator class for producing non-Fibonacci numbers.
 *
 * <p>This class provides a method to generate a specified number of non-Fibonacci
 * numbers and print them to the console. It utilizes the {@link NonFibonacciGenerator}
 * to obtain the non-Fibonacci numbers in sequence.
 *
 * <p>Example usage:
 * <pre>{@code
 * NonFibonacciNumbersGenerator generator = new NonFibonacciNumbersGenerator();
 * generator.generateNonFib(5); // Generates and prints 5 non-Fibonacci numbers
 * }</pre>
 *
 * @version 1.0
 */
public class NonFibonacciNumbersGenerator {

    /**
     * Constructor
     */
    public NonFibonacciNumbersGenerator(){}
    /**
     * Generates and prints the specified number of non-Fibonacci numbers.
     *
     * @param n the number of non-Fibonacci numbers to generate
     *          and print to the console
     */
    public void generateNonFib(int n) {
        NonFibonacciGenerator gen = new NonFibonacciGenerator();

        for (int i = 0; i < n; i++) {
            System.out.println(gen.next());
        }
    }
}