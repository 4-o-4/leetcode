package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SplitStringInBalancedStringsTest {
    private final SplitStringInBalancedStrings splitStringInBalancedStrings = new SplitStringInBalancedStrings();

    @Test
    void Example1() {
        String s = "RLRRLLRLRL";
        assertEquals(4, splitStringInBalancedStrings.balancedStringSplit(s));
    }

    @Test
    void Example2() {
        String s = "RLRRRLLRLL";
        assertEquals(2, splitStringInBalancedStrings.balancedStringSplit(s));
    }

    @Test
    void Example3() {
        String s = "LLLLRRRR";
        assertEquals(1, splitStringInBalancedStrings.balancedStringSplit(s));
    }
}