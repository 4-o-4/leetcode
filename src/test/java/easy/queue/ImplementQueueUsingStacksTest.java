package easy.queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImplementQueueUsingStacksTest {
    private ImplementQueueUsingStacks queue;

    @BeforeEach
    void init() {
        this.queue = new ImplementQueueUsingStacks();
    }

    @Test
    void ImplementQueueUsingStacksExample1() {
        assertTrue(queue.empty());
        queue.push(1);
        queue.push(2);
        queue.push(3);
        assertFalse(queue.empty());
        assertEquals(1, queue.peek());
        assertEquals(1, queue.pop());
        assertEquals(2, queue.pop());
        assertEquals(3, queue.pop());
        assertTrue(queue.empty());
    }
}