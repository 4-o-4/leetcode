package easy.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveOutermostParenthesesTest {
    private final RemoveOutermostParentheses solution = new RemoveOutermostParentheses();

    @Test
    void example1() {
        String s = "(()())(())";
        assertEquals("()()()", solution.removeOuterParentheses(s));
    }

    @Test
    void example2() {
        String s = "(()())(())(()(()))";
        assertEquals("()()()()(())", solution.removeOuterParentheses(s));
    }

    @Test
    void example3() {
        String s = "()()";
        assertEquals("", solution.removeOuterParentheses(s));
    }
}