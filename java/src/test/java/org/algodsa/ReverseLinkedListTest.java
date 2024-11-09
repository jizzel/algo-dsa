package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.ListNode;
import main.java.org.algodsa.ReverseLinkedList;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ReverseLinkedListTest {

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
    public void testReverseListMultipleElements() {
        ReverseLinkedList solution = new ReverseLinkedList();
        ListNode head = createList(1, 2, 3, 4, 5);
        ListNode reversed = solution.reverseList(head);
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, listToArray(reversed), "The list should be reversed.");
    }

    @Test
    public void testReverseListSingleElement() {
        ReverseLinkedList solution = new ReverseLinkedList();
        ListNode head = createList(1);
        ListNode reversed = solution.reverseList(head);
        assertArrayEquals(new int[]{1}, listToArray(reversed), "A single-element list should remain the same.");
    }

    @Test
    public void testReverseListEmptyList() {
        ReverseLinkedList solution = new ReverseLinkedList();
        ListNode head = null;
        ListNode reversed = solution.reverseList(head);
        assertNull(reversed, "An empty list should remain unchanged.");
    }

    @Test
    public void testReverseListAllSameElements() {
        ReverseLinkedList solution = new ReverseLinkedList();
        ListNode head = createList(1, 1, 1, 1);
        ListNode reversed = solution.reverseList(head);
        assertArrayEquals(new int[]{1, 1, 1, 1}, listToArray(reversed), "A list with identical elements should reverse but have the same values.");
    }
}
