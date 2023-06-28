package easy.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveOutermostParenthesesTest {
    private RemoveOutermostParentheses removeOutermostParentheses;

    @BeforeEach
    void init() {
        this.removeOutermostParentheses = new RemoveOutermostParentheses();
    }

    @Test
    void removeOuterParenthesesExample1() {
        String s = "(()())(())";
        assertEquals("()()()", removeOutermostParentheses.removeOuterParentheses(s));
    }

    @Test
    void removeOuterParenthesesExample2() {
        String s = "(()())(())(()(()))";
        assertEquals("()()()()(())", removeOutermostParentheses.removeOuterParentheses(s));
    }

    @Test
    void removeOuterParenthesesExample3() {
        String s = "()()";
        assertEquals("", removeOutermostParentheses.removeOuterParentheses(s));
    }
}