package easy.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ImplementQueueUsingStacksTest {
    private final ImplementQueueUsingStacks solution = new ImplementQueueUsingStacks();

    @Test
    void example1() {
        assertTrue(solution.empty());
        solution.push(1);
        solution.push(2);
        solution.push(3);
        assertFalse(solution.empty());
        assertEquals(1, solution.peek());
        assertEquals(1, solution.pop());
        assertEquals(2, solution.pop());
        assertEquals(3, solution.pop());
        assertTrue(solution.empty());
    }
}