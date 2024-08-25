package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShuffleStringTest {
    private final ShuffleString solution = new ShuffleString();

    @Test
    void example1() {
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        assertEquals("leetcode", solution.restoreString(s, indices));
    }

    @Test
    void example2() {
        String s = "abc";
        int[] indices = {0, 1, 2};
        assertEquals("abc", solution.restoreString(s, indices));
    }
}