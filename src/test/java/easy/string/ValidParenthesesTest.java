package easy.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {
    private ValidParentheses validParentheses;

    @BeforeEach
    void init() {
        this.validParentheses = new ValidParentheses();
    }

    @Test
    void isValidExample1() {
        String s = "()[]{}";
        assertTrue(validParentheses.isValid(s));
    }

    @Test
    void isValidExample2() {
        String s = "(]";
        assertFalse(validParentheses.isValid(s));
    }

    @Test
    void isValidExample3() {
        String s = ")";
        assertFalse(validParentheses.isValid(s));
    }

    @Test
    void isValidExample4() {
        String s = "(){}}{";
        assertFalse(validParentheses.isValid(s));
    }
}