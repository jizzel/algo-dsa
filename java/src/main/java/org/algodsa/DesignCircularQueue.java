package main.java.org.algodsa;

/**
 * <a href="https://leetcode.com/problems/design-circular-queue/">622. Design Circular Queue</a>
 * <br>
 * Time complexity: O(1)
 * Space complexity: O(k)
 * <br>
 * All operations (enqueue, dequeue, front, rear, isEmpty, isFull) take constant time, O(1).
 * The space complexity is O(k), where k is the size of the queue.
 * <br>
 * This class implements a circular queue using a fixed-size array.
 * It provides methods to enqueue and dequeue elements, and to check the
 * front and rear elements, as well as to verify if the queue is empty or full.
 */
public class DesignCircularQueue {
    int[] list;
    int start;
    int end;

    /**
     * Initializes the circular queue with a fixed capacity.
     *
     * @param k the maximum capacity of the circular queue
     */
    public DesignCircularQueue(int k) {
        list = new int[k];
        start = -1;
        end = -1;
    }

    /**
     * Adds an element to the end of the queue.
     *
     * @param value the value to be added to the queue
     * @return true if the element was successfully added, false if the queue is full
     */
    public boolean enQueue(int value) {
        if (!isFull()) {
            end = nextPos(end);
            list[end] = value;

            if (start == -1) start = 0;  // Set start pointer if queue was previously empty
            return true;
        }
        return false;
    }

    /**
     * Removes an element from the front of the queue.
     *
     * @return true if the element was successfully removed, false if the queue is empty
     */
    public boolean deQueue() {
        if (!isEmpty()) {
            if (start == end) {  // Only one element in the queue
                start = -1;
                end = -1;
            } else {
                start = nextPos(start);  // Move the start pointer to the next position
            }
            return true;
        }
        return false;
    }

    /**
     * Retrieves the front element of the queue.
     *
     * @return the front element, or -1 if the queue is empty
     */
    public int Front() {
        return isEmpty() ? -1 : list[start];
    }

    /**
     * Retrieves the rear element of the queue.
     *
     * @return the rear element, or -1 if the queue is empty
     */
    public int Rear() {
        return isEmpty() ? -1 : list[end];
    }

    /**
     * Checks if the queue is empty.
     *
     * @return true if the queue is empty, false otherwise
     */
    public boolean isEmpty() {
        return start == -1;
    }

    /**
     * Checks if the queue is full.
     *
     * @return true if the queue is full, false otherwise
     */
    public boolean isFull() {
        return nextPos(end) == start;
    }

    /**
     * Helper method to calculate the next position in a circular manner.
     *
     * @param curr the current position
     * @return the next position in the circular array
     */
    private int nextPos(int curr) {
        return (curr + 1) % list.length;
    }
}
