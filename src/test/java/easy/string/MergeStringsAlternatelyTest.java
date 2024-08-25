package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeStringsAlternatelyTest {
    private final MergeStringsAlternately solution = new MergeStringsAlternately();

    @Test
    void example1() {
        String word1 = "abc";
        String word2 = "pqr";
        assertEquals("apbqcr", solution.mergeAlternately(word1, word2));
    }

    @Test
    void example2() {
        String word1 = "ab";
        String word2 = "pqrs";
        assertEquals("apbqrs", solution.mergeAlternately(word1, word2));
    }

    @Test
    void example3() {
        String word1 = "abcd";
        String word2 = "pq";
        assertEquals("apbqcd", solution.mergeAlternately(word1, word2));
    }
}