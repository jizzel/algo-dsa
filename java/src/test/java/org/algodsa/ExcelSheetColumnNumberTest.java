package test.java.org.algodsa;

import main.java.org.algodsa.ExcelSheetColumnNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExcelSheetColumnNumberTest {
    ExcelSheetColumnNumber solution = new ExcelSheetColumnNumber();

    @Test
    void testTitleToNumber() {
        // Single-letter cases
        assertEquals(1, solution.titleToNumber("A"));
        assertEquals(26, solution.titleToNumber("Z"));

        // Double-letter cases
        assertEquals(27, solution.titleToNumber("AA"));
        assertEquals(52, solution.titleToNumber("AZ"));
        assertEquals(701, solution.titleToNumber("ZY"));
        assertEquals(702, solution.titleToNumber("ZZ"));

        // Triple-letter cases
        assertEquals(703, solution.titleToNumber("AAA"));
        assertEquals(1404, solution.titleToNumber("BAZ"));

        // Various cases
        assertEquals(28, solution.titleToNumber("AB"));
        assertEquals(18278, solution.titleToNumber("ZZZ"));

        // Large input case
        assertEquals(494265, solution.titleToNumber("ABCDE"));
    }
}