package main.java.org.algodsa;

/**
 * This class provides a method to swap nodes in a linked list in pairs.
 * For example, given a list 1->2->3->4, it returns 2->1->4->3 by swapping adjacent nodes.
 */
public class SwapNodesInPairs {

    /**
     * Default constructor for the SwapNodesInPairs class.
     */
    public SwapNodesInPairs() {}

    /**
     * <h4><a href="https://leetcode.com/problems/swap-nodes-in-pairs/">24. Swap Nodes in Pairs</a></h4>
     * <br>
     * Swaps every two adjacent nodes in a linked list and returns the new head of the modified list.
     * <br>
     * This function recursively swaps pairs of nodes in the list. If the list has fewer than two nodes,
     * no swaps are performed.<br>
     * <br>
     * Time complexity: O(n)
     * Space complexity: O(n)
     * <br>
     * The time complexity is O(n), where n is the number of nodes in the linked list, as we visit each node once.
     * The space complexity is O(n) due to the recursive call stack.
     * <br>
     * @param head the head of the linked list
     * @return the new head of the modified linked list
     */
    public ListNode swapPairs(ListNode head) {
        // Base case: if the list is empty or has only one node, no swap is needed
        if (head == null || head.next == null) {
            return head;
        }

        // Set the second node as the new head of the swapped pair
        ListNode newHead = head.next;

        // Recursively swap the pairs starting from the third node onward
        head.next = swapPairs(head.next.next);

        // Link the second node back to the first node to complete the swap
        newHead.next = head;

        return newHead;
    }
}
