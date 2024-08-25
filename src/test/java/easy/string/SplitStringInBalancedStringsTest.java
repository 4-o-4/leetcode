package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SplitStringInBalancedStringsTest {
    private final SplitStringInBalancedStrings solution = new SplitStringInBalancedStrings();

    @Test
    void example1() {
        String s = "RLRRLLRLRL";
        assertEquals(4, solution.balancedStringSplit(s));
    }

    @Test
    void example2() {
        String s = "RLRRRLLRLL";
        assertEquals(2, solution.balancedStringSplit(s));
    }

    @Test
    void example3() {
        String s = "LLLLRRRR";
        assertEquals(1, solution.balancedStringSplit(s));
    }
}