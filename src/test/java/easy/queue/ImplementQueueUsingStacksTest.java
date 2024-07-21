package easy.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ImplementQueueUsingStacksTest {
    private final ImplementQueueUsingStacks test = new ImplementQueueUsingStacks();

    @Test
    void example1() {
        assertTrue(test.empty());
        test.push(1);
        test.push(2);
        test.push(3);
        assertFalse(test.empty());
        assertEquals(1, test.peek());
        assertEquals(1, test.pop());
        assertEquals(2, test.pop());
        assertEquals(3, test.pop());
        assertTrue(test.empty());
    }
}