package easy.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumNestingDepthOfTheParenthesesTest {
    private final MaximumNestingDepthOfTheParentheses test = new MaximumNestingDepthOfTheParentheses();

    @Test
    void example1() {
        String s = "(1+(2*3)+((8)/4))+1";
        assertEquals(3, test.maxDepth(s));
    }

    @Test
    void example2() {
        String s = "(1)+((2))+(((3)))";
        assertEquals(3, test.maxDepth(s));
    }
}