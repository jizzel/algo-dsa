package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.ListNode;
import main.java.org.algodsa.SwapNodesInPairs;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class SwapNodesInPairsTest {

    private ListNode createList(int... values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    private int[] listToArray(ListNode head) {
        ListNode current = head;
        ArrayList<Integer> result = new ArrayList<>();
        while (current != null) {
            result.add(current.val);
            current = current.next;
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    @Test
    public void testSwapPairsEvenNodes() {
        SwapNodesInPairs solution = new SwapNodesInPairs();
        ListNode head = createList(1, 2, 3, 4);
        ListNode swapped = solution.swapPairs(head);
        assertArrayEquals(new int[]{2, 1, 4, 3}, listToArray(swapped), "Should swap adjacent nodes in pairs for an even-length list.");
    }

    @Test
    public void testSwapPairsOddNodes() {
        SwapNodesInPairs solution = new SwapNodesInPairs();
        ListNode head = createList(1, 2, 3, 4, 5);
        ListNode swapped = solution.swapPairs(head);
        assertArrayEquals(new int[]{2, 1, 4, 3, 5}, listToArray(swapped), "Should swap adjacent nodes in pairs, leaving the last node unswapped for an odd-length list.");
    }

    @Test
    public void testSwapPairsSingleElement() {
        SwapNodesInPairs solution = new SwapNodesInPairs();
        ListNode head = createList(1);
        ListNode swapped = solution.swapPairs(head);
        assertArrayEquals(new int[]{1}, listToArray(swapped), "A single-element list should remain unchanged.");
    }

    @Test
    public void testSwapPairsEmptyList() {
        SwapNodesInPairs solution = new SwapNodesInPairs();
        ListNode swapped = solution.swapPairs(null);
        assertNull(swapped, "An empty list should remain unchanged.");
    }

    @Test
    public void testSwapPairsAllSameElements() {
        SwapNodesInPairs solution = new SwapNodesInPairs();
        ListNode head = createList(1, 1, 1, 1);
        ListNode swapped = solution.swapPairs(head);
        assertArrayEquals(new int[]{1, 1, 1, 1}, listToArray(swapped), "A list with all identical elements should swap positions correctly without changing values.");
    }
}
