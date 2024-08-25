package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CheckIfTwoStringArraysAreEquivalentTest {
    private final CheckIfTwoStringArraysAreEquivalent solution = new CheckIfTwoStringArraysAreEquivalent();

    @Test
    void example1() {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        assertTrue(solution.arrayStringsAreEqual(word1, word2));
    }

    @Test
    void example2() {
        String[] word1 = {"a", "cb"};
        String[] word2 = {"ab", "c"};
        assertFalse(solution.arrayStringsAreEqual(word1, word2));
    }

    @Test
    void example3() {
        String[] word1 = {"abc", "d", "defg"};
        String[] word2 = {"abcddefg"};
        assertTrue(solution.arrayStringsAreEqual(word1, word2));
    }
}