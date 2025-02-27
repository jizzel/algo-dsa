package main.java.org.algodsa;

/**
 * This class provides an implementation of the Insertion Sort algorithm for a singly linked list.
 */
public class InsertionSortList {

    /**
     * Default constructor.
     */
    public InsertionSortList() {}

    /**
     * <h4><a href="https://leetcode.com/problems/insertion-sort-list/">147. Insertion Sort List</a></h4>
     * <br>
     * Sorts a singly linked list in ascending order using the Insertion Sort algorithm.
     * <br><br>
     * Time Complexity:
     * - Best Case (Already Sorted): O(n)
     * - Worst Case (Reversed Order): O(n^2)
     * - Average Case: O(n^2)
     * <br>
     * Space Complexity: O(1), since sorting is done in place.
     * <br><br>
     * @param head the head of the unsorted linked list
     * @return the head of the sorted linked list
     */
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0); // Dummy node to simplify insertions
        ListNode prev = dummy; // Pointer to the sorted portion

        while (head != null) { // Iterate through the list
            ListNode next = head.next; // Cache the next node

            // If the current node's value is smaller, reset prev to the start
            if (prev.val >= head.val) {
                prev = dummy;
            }

            // Find the correct position to insert the current node
            while (prev.next != null && prev.next.val < head.val) {
                prev = prev.next;
            }

            // Insert the node in the correct position
            head.next = prev.next;
            prev.next = head;
            head = next; // Move to the next node
        }

        return dummy.next; // Return the sorted list
    }
}
