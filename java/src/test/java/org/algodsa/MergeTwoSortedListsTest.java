package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.ListNode;
import main.java.org.algodsa.MergeTwoSortedLists;
import org.junit.jupiter.api.Test;

public class MergeTwoSortedListsTest {

    @Test
    public void testBothListsEmpty() {
        MergeTwoSortedLists solution = new MergeTwoSortedLists();
        ListNode result = solution.mergeTwoLists(null, null);
        assertNull(result, "Merging two empty lists should return null.");
    }

    @Test
    public void testOneListEmpty() {
        MergeTwoSortedLists solution = new MergeTwoSortedLists();

        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode result = solution.mergeTwoLists(list1, null);
        assertEquals(list1, result, "Merging with an empty list should return the non-empty list.");

        result = solution.mergeTwoLists(null, list1);
        assertEquals(list1, result, "Merging an empty list with a non-empty list should return the non-empty list.");
    }

    @Test
    public void testMergeTwoNonEmptyLists() {
        MergeTwoSortedLists solution = new MergeTwoSortedLists();

        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode expected = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));
        ListNode result = solution.mergeTwoLists(list1, list2);

        assertTrue(compareLists(expected, result), "Merged list should match the expected sorted merged list.");
    }

    private boolean compareLists(ListNode l1, ListNode l2) {
        while (l1 != null && l2 != null) {
            if (l1.val != l2.val) return false;
            l1 = l1.next;
            l2 = l2.next;
        }
        return l1 == null && l2 == null;
    }
}