package easy.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveOutermostParenthesesTest {
    private final RemoveOutermostParentheses test = new RemoveOutermostParentheses();

    @Test
    void example1() {
        String s = "(()())(())";
        assertEquals("()()()", test.removeOuterParentheses(s));
    }

    @Test
    void example2() {
        String s = "(()())(())(()(()))";
        assertEquals("()()()()(())", test.removeOuterParentheses(s));
    }

    @Test
    void example3() {
        String s = "()()";
        assertEquals("", test.removeOuterParentheses(s));
    }
}