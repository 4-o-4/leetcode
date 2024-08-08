package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountingWordsWithGivenPrefixTest {
    private final CountingWordsWithGivenPrefix test = new CountingWordsWithGivenPrefix();

    @Test
    void example1() {
        String[] words = {"pay", "attention", "practice", "attend"};
        String pref = "at";
        assertEquals(2, test.prefixCount(words, pref));
    }

    @Test
    void example2() {
        String[] words = {"leetcode", "win", "loops", "success"};
        String pref = "code";
        assertEquals(0, test.prefixCount(words, pref));
    }
}