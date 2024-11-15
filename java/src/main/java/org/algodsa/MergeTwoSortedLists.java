package main.java.org.algodsa;

/**
 * This class provides a method to merge two sorted linked lists into one sorted linked list.
 */
public class MergeTwoSortedLists {

    /**
     * Constructor
     */
    public MergeTwoSortedLists() {}

    /**
     * <h4><a href="https://leetcode.com/problems/merge-two-sorted-lists/">21. Merge Two Sorted Lists</a></h4>
     * <br>
     * Merges two sorted linked lists into one sorted list.
     * <br>
     * Time complexity: O(n + m)
     * Space complexity: O(n + m)
     * <br>
     * The time complexity is O(n + m), where n and m are the lengths of list1 and list2, respectively,
     * as we need to examine every node in both lists once. The space complexity is O(n + m) due to the
     * recursive call stack created for each node in the lists.<br>
     * <br>
     * @param list1 the head of the first sorted linked list.
     * @param list2 the head of the second sorted linked list.
     * @return the head of the merged sorted linked list.
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        if(list1.val <= list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}