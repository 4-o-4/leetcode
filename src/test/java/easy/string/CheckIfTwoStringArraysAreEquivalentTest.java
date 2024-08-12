package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CheckIfTwoStringArraysAreEquivalentTest {
    private final CheckIfTwoStringArraysAreEquivalent test = new CheckIfTwoStringArraysAreEquivalent();

    @Test
    void example1() {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        assertTrue(test.arrayStringsAreEqual(word1, word2));
    }

    @Test
    void example2() {
        String[] word1 = {"a", "cb"};
        String[] word2 = {"ab", "c"};
        assertFalse(test.arrayStringsAreEqual(word1, word2));
    }

    @Test
    void example3() {
        String[] word1 = {"abc", "d", "defg"};
        String[] word2 = {"abcddefg"};
        assertTrue(test.arrayStringsAreEqual(word1, word2));
    }
}