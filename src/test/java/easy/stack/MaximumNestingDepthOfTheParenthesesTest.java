package easy.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumNestingDepthOfTheParenthesesTest {
    private MaximumNestingDepthOfTheParentheses maximumNestingDepthOfTheParentheses;

    @BeforeEach
    void init() {
        this.maximumNestingDepthOfTheParentheses = new MaximumNestingDepthOfTheParentheses();
    }

    @Test
    void maxDepthExample1() {
        String s = "(1+(2*3)+((8)/4))+1";
        assertEquals(3, maximumNestingDepthOfTheParentheses.maxDepth(s));
    }

    @Test
    void maxDepthExample2() {
        String s = "(1)+((2))+(((3)))";
        assertEquals(3, maximumNestingDepthOfTheParentheses.maxDepth(s));
    }
}