package easy.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BackspaceStringCompareTest {
    private final BackspaceStringCompare solution = new BackspaceStringCompare();

    @Test
    void example1() {
        String s = "ab#c", t = "ad#c";
        assertTrue(solution.backspaceCompare(s, t));
    }

    @Test
    void example2() {
        String s = "ab##", t = "c#d#";
        assertTrue(solution.backspaceCompare(s, t));
    }

    @Test
    void example3() {
        String s = "a#c", t = "b";
        assertFalse(solution.backspaceCompare(s, t));
    }

    @Test
    void example4() {
        String s = "a##c", t = "#a#c";
        assertTrue(solution.backspaceCompare(s, t));
    }
}