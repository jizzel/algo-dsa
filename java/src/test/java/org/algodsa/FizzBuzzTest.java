package test.java.org.algodsa;

import main.java.org.algodsa.FizzBuzz;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    FizzBuzz solution = new FizzBuzz();

    @Test
    public void testFizzBuzz() {
        List<String> result = solution.fizzBuzz(15);
        assertEquals("1", result.get(0));
        assertEquals("2", result.get(1));
        assertEquals("Fizz", result.get(2));
        assertEquals("4", result.get(3));
        assertEquals("Buzz", result.get(4));
        assertEquals("FizzBuzz", result.get(14));
    }

}