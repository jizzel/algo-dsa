package test.java.org.algodsa;

import main.java.org.algodsa.GroupAnagrams;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class GroupAnagramsTest {

    @Test
    public void testExampleCase() {
        GroupAnagrams ga = new GroupAnagrams();
        String[] input = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> expected = Arrays.asList(
                Arrays.asList("eat", "tea", "ate"),
                Arrays.asList("tan", "nat"),
                Arrays.asList("bat")
        );

        List<List<String>> result = ga.groupAnagrams(input);

        assertTrue(compareGroupAnagrams(expected, result));
    }

    @Test
    public void testEmptyInput() {
        GroupAnagrams ga = new GroupAnagrams();
        String[] input = {};

        List<List<String>> result = ga.groupAnagrams(input);

        assertTrue(result.isEmpty());
    }

    @Test
    public void testSingleWord() {
        GroupAnagrams ga = new GroupAnagrams();
        String[] input = {"hello"};

        List<List<String>> expected = Arrays.asList(
                Arrays.asList("hello")
        );

        List<List<String>> result = ga.groupAnagrams(input);

        assertTrue(compareGroupAnagrams(expected, result));
    }

    @Test
    public void testAllUniqueWords() {
        GroupAnagrams ga = new GroupAnagrams();
        String[] input = {"abc", "def", "ghi"};

        List<List<String>> expected = Arrays.asList(
                Arrays.asList("abc"),
                Arrays.asList("def"),
                Arrays.asList("ghi")
        );

        List<List<String>> result = ga.groupAnagrams(input);

        assertTrue(compareGroupAnagrams(expected, result));
    }

    /**
     * Helper method: compares two List<List<String>> disregarding order.
     */
    private boolean compareGroupAnagrams(List<List<String>> expected, List<List<String>> actual) {
        if (expected.size() != actual.size()) return false;

        // Normalize: sort inner lists & outer list
        List<List<String>> sortedExpected = new ArrayList<>();
        for (List<String> group : expected) {
            List<String> copy = new ArrayList<>(group);
            Collections.sort(copy);
            sortedExpected.add(copy);
        }
        sortedExpected.sort(Comparator.comparing(Object::toString));

        List<List<String>> sortedActual = new ArrayList<>();
        for (List<String> group : actual) {
            List<String> copy = new ArrayList<>(group);
            Collections.sort(copy);
            sortedActual.add(copy);
        }
        sortedActual.sort(Comparator.comparing(Object::toString));

        return sortedExpected.equals(sortedActual);
    }
}
