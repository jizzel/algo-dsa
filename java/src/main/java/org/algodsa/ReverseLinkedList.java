package main.java.org.algodsa;

/**
 * This class provides a method to reverse a singly linked list using recursion.
 */
public class ReverseLinkedList {

    /**
     * Constructor
     */
    public ReverseLinkedList(){}

    /**
     * <h4><a href="https://leetcode.com/problems/reverse-linked-list/">206. Reverse Linked List</a></h4>
     * <br>
     * Reverses a singly linked list.
     * <br>
     * Time complexity: O(n)
     * Space complexity: O(n)
     * <br>
     * The time complexity is O(n), where n is the number of nodes in the linked list, as each node is visited once.
     * The space complexity is O(n) due to the recursive call stack.
     *
     * @param head the head of the linked list
     * @return the head of the reversed linked list
     */
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        return reverse(null, head);
    }

    /**
     * A helper function to perform the actual reversal of the linked list using recursion.
     * <br>
     * Time complexity: O(n)
     * Space complexity: O(n)
     * <br>
     * The time complexity is O(n) since each node is processed once.
     * The space complexity is O(n) due to the recursive call stack.
     * <br>
     * @param prev the previous node (initially null)
     * @param curr the current node to be reversed
     * @return the new head of the reversed linked list
     */
    private ListNode reverse(ListNode prev, ListNode curr) {
        if (curr == null) return prev;

        ListNode next = curr.next;
        curr.next = prev;
        return reverse(curr, next);
    }
}
