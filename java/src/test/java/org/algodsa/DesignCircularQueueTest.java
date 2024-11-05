package test.java.org.algodsa;

import static org.junit.jupiter.api.Assertions.*;

import main.java.org.algodsa.DesignCircularQueue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DesignCircularQueueTest {

    private DesignCircularQueue queue;

    @BeforeEach
    public void setUp() {
        queue = new DesignCircularQueue(3); // Initialize with capacity 3
    }

    @Test
    public void testEnQueue() {
        assertTrue(queue.enQueue(1), "Enqueue should return true when space is available");
        assertTrue(queue.enQueue(2), "Enqueue should return true when space is available");
        assertTrue(queue.enQueue(3), "Enqueue should return true when space is available");
        assertFalse(queue.enQueue(4), "Enqueue should return false when the queue is full");
        assertEquals(1, queue.Front(), "Front should return the first enqueued element");
        assertEquals(3, queue.Rear(), "Rear should return the last enqueued element");
    }

    @Test
    public void testDeQueue() {
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        assertTrue(queue.deQueue(), "Dequeue should return true when an element is dequeued");
        assertTrue(queue.deQueue(), "Dequeue should return true when an element is dequeued");
        assertEquals(3, queue.Front(), "Front should update to the next element after dequeuing");
        assertTrue(queue.deQueue(), "Dequeue should return true when an element is dequeued");
        assertFalse(queue.deQueue(), "Dequeue should return false when the queue is empty");
    }

    @Test
    public void testFront() {
        assertEquals(-1, queue.Front(), "Front should return -1 when the queue is empty");
        queue.enQueue(1);
        queue.enQueue(2);
        assertEquals(1, queue.Front(), "Front should return the first element enqueued");
    }

    @Test
    public void testRear() {
        assertEquals(-1, queue.Rear(), "Rear should return -1 when the queue is empty");
        queue.enQueue(1);
        queue.enQueue(2);
        assertEquals(2, queue.Rear(), "Rear should return the last element enqueued");
    }

    @Test
    public void testIsEmpty() {
        assertTrue(queue.isEmpty(), "isEmpty should return true when the queue is initialized empty");
        queue.enQueue(1);
        assertFalse(queue.isEmpty(), "isEmpty should return false when elements are enqueued");
        queue.deQueue();
        assertTrue(queue.isEmpty(), "isEmpty should return true after all elements are dequeued");
    }

    @Test
    public void testIsFull() {
        assertFalse(queue.isFull(), "isFull should return false when the queue is not full");
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        assertTrue(queue.isFull(), "isFull should return true when the queue reaches its capacity");
        queue.deQueue();
        assertFalse(queue.isFull(), "isFull should return false when there is space available after dequeuing");
    }

    @Test
    public void testWrapAround() {
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.deQueue();
        queue.enQueue(4);
        assertEquals(2, queue.Front(), "Front should correctly update after wrap-around enqueueing");
        assertEquals(4, queue.Rear(), "Rear should correctly update after wrap-around enqueueing");
    }
}