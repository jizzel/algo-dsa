package test.java.org.algodsa;

import main.java.org.algodsa.AddBinary;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddBinaryTest {
    AddBinary solution = new AddBinary();
    @Test
    public void testAddBinary() {
        assertEquals("101", solution.addBinary("100", "1"));
        assertEquals("100", solution.addBinary("11", "1"));
        assertEquals("110", solution.addBinary("11", "11"));
        assertEquals(
                "110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000",
                solution.addBinary(
                        "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
                        "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
    }

}