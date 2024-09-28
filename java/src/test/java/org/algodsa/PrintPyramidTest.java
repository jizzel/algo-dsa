package test.java.org.algodsa;

import main.java.org.algodsa.PrintPyramid;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class PrintPyramidTest {
    PrintPyramid solution = new PrintPyramid();

    @Test
    void testPrintPyramid() {
        // Redirect System.out to capture the printed output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Test with different pyramid sizes
        solution.printPyramid(1);
        String expectedOutput1 = "*\n";
        assertEquals(expectedOutput1, outContent.toString(), "Pyramid of size 1 failed.");

        // Clear the output stream
        outContent.reset();

        solution.printPyramid(2);
        String expectedOutput2 = " *\n***\n";
        assertEquals(expectedOutput2, outContent.toString(), "Pyramid of size 2 failed.");

        // Clear the output stream
        outContent.reset();

        solution.printPyramid(3);
        String expectedOutput3 = "  *\n ***\n*****\n";
        assertEquals(expectedOutput3, outContent.toString(), "Pyramid of size 3 failed.");

        // Clear the output stream
        outContent.reset();

        solution.printPyramid(4);
        String expectedOutput4 = "   *\n  ***\n *****\n*******\n";
        assertEquals(expectedOutput4, outContent.toString(), "Pyramid of size 4 failed.");

        // Reset System.out back to its original state
        System.setOut(System.out);
    }

}