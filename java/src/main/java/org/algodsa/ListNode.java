package main.java.org.algodsa;

/**
 * A class representing a node in a singly linked list.
 * Each node contains a value and a reference to the next node in the list.
 */
public class ListNode {
    /**
     * The value stored in the node.
     */
    public int val;

    /**
     * The reference to the next node in the list.
     */
    public ListNode next;

    /**
     * Default constructor for the ListNode. Initializes val to 0 and next to null.
     */
    ListNode() {}

    /**
     * Constructor for the ListNode. Initializes the node with a given value.
     * @param val the value to store in the node
     */
    public ListNode(int val) {
        this.val = val;
    }

    /**
     * Constructor for the ListNode. Initializes the node with a given value and next node reference.
     * @param val the value to store in the node
     * @param next the reference to the next node in the list
     */
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}