package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.ListNode;
import main.java.org.algodsa.RemoveDuplicatesFromSortedList;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesFromSortedListTest {

    private ListNode arrayToList(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;
        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        return head;
    }

    private int[] listToArray(ListNode head) {
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        int[] arr = new int[length];
        temp = head;
        for (int i = 0; i < length; i++) {
            arr[i] = temp.val;
            temp = temp.next;
        }
        return arr;
    }

    @Test
    public void testEmptyList() {
        RemoveDuplicatesFromSortedList remover = new RemoveDuplicatesFromSortedList();
        ListNode result = remover.deleteDuplicates(null);
        assertNull(result, "The result should be null for an empty list.");
    }

    @Test
    public void testSingleNode() {
        RemoveDuplicatesFromSortedList remover = new RemoveDuplicatesFromSortedList();
        ListNode head = new ListNode(1);
        ListNode result = remover.deleteDuplicates(head);
        assertNotNull(result, "The result should not be null for a single node list.");
        assertEquals(1, result.val, "The value should remain the same.");
        assertNull(result.next, "The list should still contain only one node.");
    }

    @Test
    public void testNoDuplicates() {
        RemoveDuplicatesFromSortedList remover = new RemoveDuplicatesFromSortedList();
        int[] input = {1, 2, 3, 4, 5};
        ListNode head = arrayToList(input);
        ListNode result = remover.deleteDuplicates(head);
        assertArrayEquals(input, listToArray(result), "The list should remain unchanged when there are no duplicates.");
    }

    @Test
    public void testAllDuplicates() {
        RemoveDuplicatesFromSortedList remover = new RemoveDuplicatesFromSortedList();
        int[] input = {1, 1, 1, 1};
        int[] expected = {1};
        ListNode head = arrayToList(input);
        ListNode result = remover.deleteDuplicates(head);
        assertArrayEquals(expected, listToArray(result), "The list should only contain one instance of the duplicate number.");
    }

    @Test
    public void testMixedDuplicates() {
        RemoveDuplicatesFromSortedList remover = new RemoveDuplicatesFromSortedList();
        int[] input = {1, 1, 2, 3, 3, 4, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        ListNode head = arrayToList(input);
        ListNode result = remover.deleteDuplicates(head);
        assertArrayEquals(expected, listToArray(result), "The duplicates should be removed while maintaining order.");
    }

    @Test
    public void testDuplicatesAtEnd() {
        RemoveDuplicatesFromSortedList remover = new RemoveDuplicatesFromSortedList();
        int[] input = {1, 2, 3, 4, 5, 5, 5};
        int[] expected = {1, 2, 3, 4, 5};
        ListNode head = arrayToList(input);
        ListNode result = remover.deleteDuplicates(head);
        assertArrayEquals(expected, listToArray(result), "The trailing duplicates should be removed.");
    }
}
