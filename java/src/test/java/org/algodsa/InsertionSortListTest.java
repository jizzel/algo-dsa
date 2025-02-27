package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.InsertionSortList;
import main.java.org.algodsa.ListNode;
import org.junit.jupiter.api.Test;

public class InsertionSortListTest {

    private ListNode arrayToList(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    private int[] listToArray(ListNode head) {
        java.util.List<Integer> list = new java.util.ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    @Test
    public void testSortedList() {
        InsertionSortList sorter = new InsertionSortList();
        ListNode head = arrayToList(new int[]{1, 2, 3, 4, 5});
        int[] expected = {1, 2, 3, 4, 5};
        ListNode sortedHead = sorter.insertionSortList(head);
        assertArrayEquals(expected, listToArray(sortedHead), "Sorted list should remain unchanged");
    }

    @Test
    public void testReverseSortedList() {
        InsertionSortList sorter = new InsertionSortList();
        ListNode head = arrayToList(new int[]{5, 4, 3, 2, 1});
        int[] expected = {1, 2, 3, 4, 5};
        ListNode sortedHead = sorter.insertionSortList(head);
        assertArrayEquals(expected, listToArray(sortedHead), "Reversed list should be sorted");
    }

    @Test
    public void testUnsortedList() {
        InsertionSortList sorter = new InsertionSortList();
        ListNode head = arrayToList(new int[]{4, 2, 1, 3});
        int[] expected = {1, 2, 3, 4};
        ListNode sortedHead = sorter.insertionSortList(head);
        assertArrayEquals(expected, listToArray(sortedHead), "Unsorted list should be sorted");
    }

    @Test
    public void testListWithDuplicates() {
        InsertionSortList sorter = new InsertionSortList();
        ListNode head = arrayToList(new int[]{4, 2, 2, 1, 3, 3});
        int[] expected = {1, 2, 2, 3, 3, 4};
        ListNode sortedHead = sorter.insertionSortList(head);
        assertArrayEquals(expected, listToArray(sortedHead), "List with duplicates should be sorted correctly");
    }

    @Test
    public void testSingleElementList() {
        InsertionSortList sorter = new InsertionSortList();
        ListNode head = arrayToList(new int[]{7});
        int[] expected = {7};
        ListNode sortedHead = sorter.insertionSortList(head);
        assertArrayEquals(expected, listToArray(sortedHead), "Single-element list should remain unchanged");
    }

    @Test
    public void testEmptyList() {
        InsertionSortList sorter = new InsertionSortList();
        ListNode head = arrayToList(new int[]{});
        int[] expected = {};
        ListNode sortedHead = sorter.insertionSortList(head);
        assertArrayEquals(expected, listToArray(sortedHead), "Empty list should remain unchanged");
    }
}
