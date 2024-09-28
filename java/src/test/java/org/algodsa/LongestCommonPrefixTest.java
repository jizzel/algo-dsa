package test.java.org.algodsa;

import main.java.org.algodsa.LongestCommonPrefix;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {
    LongestCommonPrefix solution = new LongestCommonPrefix();

    @Test
    public void testLongestCommonPrefix() {
        assertEquals("fl", solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        assertEquals("", solution.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        assertEquals("a", solution.longestCommonPrefix(new String[]{"a"}));
    }

}