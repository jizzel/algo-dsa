package test.java.org.algodsa;

import main.java.org.algodsa.Solution;
import main.java.org.algodsa.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {

    @Test
    public void testDetectCapitalUse() {
        assertTrue(Solution.detectCapitalUse("USA"));
        assertTrue(Solution.detectCapitalUse("leetcode"));
        assertTrue(Solution.detectCapitalUse("Google"));
        assertFalse(Solution.detectCapitalUse("FlaG"));
    }

    @Test
    public void testWordPattern() {
        assertTrue(Solution.wordPattern("abba", "dog cat cat dog"));
        assertFalse(Solution.wordPattern("abba", "dog cat cat fish"));
        assertFalse(Solution.wordPattern("aaaa", "dog cat cat dog"));
        assertFalse(Solution.wordPattern("abba", "dog dog dog dog"));
    }

    @Test
    public void testAddBinary() {
        assertEquals("101", Solution.addBinary("100", "1"));
        assertEquals("100", Solution.addBinary("11", "1"));
        assertEquals("110", Solution.addBinary("11", "11"));
        assertEquals(
                "110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000",
                Solution.addBinary(
                        "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
                        "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
    }

    @Test
    void testTitleToNumber() {
        // Single-letter cases
        assertEquals(1, Solution.titleToNumber("A"));
        assertEquals(26, Solution.titleToNumber("Z"));

        // Double-letter cases
        assertEquals(27, Solution.titleToNumber("AA"));
        assertEquals(52, Solution.titleToNumber("AZ"));
        assertEquals(701, Solution.titleToNumber("ZY"));
        assertEquals(702, Solution.titleToNumber("ZZ"));

        // Triple-letter cases
        assertEquals(703, Solution.titleToNumber("AAA"));
        assertEquals(1404, Solution.titleToNumber("BAZ"));

        // Various cases
        assertEquals(28, Solution.titleToNumber("AB"));
        assertEquals(18278, Solution.titleToNumber("ZZZ"));

        // Large input case
        assertEquals(494265, Solution.titleToNumber("ABCDE"));
    }

    @Test
    public void testLengthOfLastWord() {
        assertEquals(5, Solution.lengthOfLastWord("Hello World"));
        assertEquals(4, Solution.lengthOfLastWord("   fly me   to   the moon  "));
        assertEquals(6, Solution.lengthOfLastWord("luffy is still joyboy"));
    }

    @Test
    public void testStrStr() {
        assertEquals(2, Solution.strStr("hello", "ll"));
        assertEquals(-1, Solution.strStr("aaaaa", "bba"));
        assertEquals(0, Solution.strStr("a", "a"));
    }

    @Test
    public void testRepeatedSubstringPattern() {
        assertTrue(Solution.repeatedSubstringPattern("abab"));
        assertFalse(Solution.repeatedSubstringPattern("aba"));
        assertTrue(Solution.repeatedSubstringPattern("abcabcabcabc"));
    }

    @Test
    public void testToLowerCase() {
        assertEquals("hello", Solution.toLowerCase("Hello"));
        assertEquals("here", Solution.toLowerCase("here"));
        assertEquals("lovely", Solution.toLowerCase("LOVELY"));
    }

    @Test
    public void testFizzBuzz() {
        List<String> result = Solution.fizzBuzz(15);
        assertEquals("1", result.get(0));
        assertEquals("2", result.get(1));
        assertEquals("Fizz", result.get(2));
        assertEquals("4", result.get(3));
        assertEquals("Buzz", result.get(4));
        assertEquals("FizzBuzz", result.get(14));
    }

    @Test
    public void testLongestCommonPrefix() {
        assertEquals("fl", Solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        assertEquals("", Solution.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        assertEquals("a", Solution.longestCommonPrefix(new String[]{"a"}));
    }

    @Test
    void testKthLargestLevelSum_singleNode() {
        TreeNode root = new TreeNode(5);
        assertEquals(5, Solution.kthLargestLevelSum(root, 1));
    }

    @Test
    void testKthLargestLevelSum_skewedTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);

        // Level sums: [1, 2, 3, 4]
        assertEquals(4, Solution.kthLargestLevelSum(root, 1));
        assertEquals(3, Solution.kthLargestLevelSum(root, 2));
        assertEquals(2, Solution.kthLargestLevelSum(root, 3));
        assertEquals(1, Solution.kthLargestLevelSum(root, 4));
    }

    @Test
    void testKthLargestLevelSum_kOutOfBounds() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);

        // Level sums: [10, 50]
        assertEquals(50, Solution.kthLargestLevelSum(root, 1));
        assertEquals(10, Solution.kthLargestLevelSum(root, 2));
        assertEquals(-1, Solution.kthLargestLevelSum(root, 3)); // k is out of bounds
    }

    @Test
    void testKthLargestLevelSum_emptyTree() {
        assertEquals(-1, Solution.kthLargestLevelSum(null, 1));
    }

    static TreeNode setUp() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        return root;
    }

    @Test
    void testDoLevelOrder_multipleLevels() {
        TreeNode root = setUp();

        List<Long> result = new ArrayList<>();
        Solution.doLevelOrder(root, result);

        // Expected sums: [1, 5, 22]
        assertEquals(List.of(1L, 5L, 22L), result);
    }

    @Test
    void testKthLargestLevelSum_completeTree() {
        TreeNode root = setUp();

        // Level sums: [1, 5, 22]
        assertEquals(22, Solution.kthLargestLevelSum(root, 1));
        assertEquals(5, Solution.kthLargestLevelSum(root, 2));
        assertEquals(1, Solution.kthLargestLevelSum(root, 3));
    }
}
