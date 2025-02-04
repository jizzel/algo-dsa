package main.java.org.algodsa;

/**
 * This class provides a method to remove duplicates from a sorted linked list.
 */
public class RemoveDuplicatesFromSortedList {

    /**
     * Constructor
     */
    public RemoveDuplicatesFromSortedList() {}

    /**
     * <h4><a href="https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/">83. Remove Duplicates from Sorted List</a></h4>
     * <br>
     * Removes duplicate elements from a sorted linked list.
     * <br><br>
     * Time complexity: O(n), where n is the number of nodes in the linked list.
     * The method iterates through the list once, processing each node.
     * <br>
     * Space complexity: O(1), as the method modifies the linked list in place without extra storage.
     * <br><br>
     * @param head the head of the sorted linked list.
     * @return the head of the modified linked list with duplicates removed.
     */
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode curr = head;

        // Iterate through the list and remove duplicates
        while (curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next; // Skip the duplicate node
            } else {
                curr = curr.next; // Move to the next distinct node
            }
        }

        return head;
    }
}
