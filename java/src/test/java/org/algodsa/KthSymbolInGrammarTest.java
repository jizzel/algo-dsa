package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.KthSymbolInGrammar;
import org.junit.jupiter.api.Test;

public class KthSymbolInGrammarTest {

    @Test
    public void testBaseCase() {
        KthSymbolInGrammar solver = new KthSymbolInGrammar();
        assertEquals(0, solver.kthGrammar(1, 1), "Base case: The first element in the first row is 0.");
    }

    @Test
    public void testSecondRow() {
        KthSymbolInGrammar solver = new KthSymbolInGrammar();
        assertEquals(0, solver.kthGrammar(2, 1), "The first element in the second row is 0.");
        assertEquals(1, solver.kthGrammar(2, 2), "The second element in the second row is 1.");
    }

    @Test
    public void testThirdRow() {
        KthSymbolInGrammar solver = new KthSymbolInGrammar();
        assertEquals(0, solver.kthGrammar(3, 1), "The first element in the third row is 0.");
        assertEquals(1, solver.kthGrammar(3, 2), "The second element in the third row is 1.");
        assertEquals(1, solver.kthGrammar(3, 3), "The third element in the third row is 1.");
        assertEquals(0, solver.kthGrammar(3, 4), "The fourth element in the third row is 0.");
    }

    @Test
    public void testFourthRow() {
        KthSymbolInGrammar solver = new KthSymbolInGrammar();
        assertEquals(0, solver.kthGrammar(4, 1), "The first element in the fourth row is 0.");
        assertEquals(1, solver.kthGrammar(4, 2), "The second element in the fourth row is 1.");
        assertEquals(1, solver.kthGrammar(4, 3), "The third element in the fourth row is 1.");
        assertEquals(0, solver.kthGrammar(4, 4), "The fourth element in the fourth row is 0.");
        assertEquals(1, solver.kthGrammar(4, 5), "The fifth element in the fourth row is 1.");
        assertEquals(0, solver.kthGrammar(4, 6), "The sixth element in the fourth row is 0.");
        assertEquals(0, solver.kthGrammar(4, 7), "The seventh element in the fourth row is 0.");
        assertEquals(1, solver.kthGrammar(4, 8), "The eighth element in the fourth row is 1.");
    }

    @Test
    public void testLargeInput() {
        KthSymbolInGrammar solver = new KthSymbolInGrammar();
        assertEquals(1, solver.kthGrammar(10, 1024), "The 1024th element in the 10th row should be 1.");
        assertEquals(0, solver.kthGrammar(15, 1), "The first element in the 15th row should be 0.");
    }

    @Test
    public void testMiddleElement() {
        KthSymbolInGrammar solver = new KthSymbolInGrammar();
        assertEquals(1, solver.kthGrammar(5, 8), "The 8th element in the 5th row should be 0.");
        assertEquals(0, solver.kthGrammar(6, 16), "The 16th element in the 6th row should be 1.");
    }
}
