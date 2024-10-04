package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.NonFibonacciNumbersGenerator;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class NonFibonacciNumbersGeneratorTest {

    private final NonFibonacciNumbersGenerator generator = new NonFibonacciNumbersGenerator();
    @Test
    public void testGenerateNonFib() {
        // Set up to capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out; // Save the original System.out
        System.setOut(new PrintStream(outputStream)); // Redirect System.out

        int n = 10; // Number of non-Fibonacci numbers to generate
        generator.generateNonFib(n);

        // Restore original System.out
        System.setOut(originalOut);

        // Split the output into lines and convert to a list of Longs
        String[] generatedNumbers = outputStream.toString().trim().split("\n");

        assertEquals(n, generatedNumbers.length, "The number of generated non-Fibonacci numbers should match n");

        // Validate the generated non-Fibonacci numbers
        long[] expectedNonFibNumbers = {4, 6, 7, 9, 10, 11, 12, 14, 15, 16}; // First 10 non-Fibonacci numbers
        for (int i = 0; i < n; i++) {
            assertEquals(String.valueOf(expectedNonFibNumbers[i]), generatedNumbers[i].trim(),
                    "Non-Fibonacci number at index " + i + " should be " + expectedNonFibNumbers[i]);
        }
    }
}