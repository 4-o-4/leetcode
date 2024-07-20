package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShuffleStringTest {
    private final ShuffleString shuffleString = new ShuffleString();

    @Test
    void Example1() {
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        assertEquals("leetcode", shuffleString.restoreString(s, indices));
    }

    @Test
    void Example2() {
        String s = "abc";
        int[] indices = {0, 1, 2};
        assertEquals("abc", shuffleString.restoreString(s, indices));
    }
}