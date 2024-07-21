package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidParenthesesTest {
    private final ValidParentheses test = new ValidParentheses();

    @Test
    void example1() {
        String s = "()[]{}";
        assertTrue(test.isValid(s));
    }

    @Test
    void example2() {
        String s = "(]";
        assertFalse(test.isValid(s));
    }

    @Test
    void example3() {
        String s = ")";
        assertFalse(test.isValid(s));
    }

    @Test
    void example4() {
        String s = "(){}}{";
        assertFalse(test.isValid(s));
    }
}