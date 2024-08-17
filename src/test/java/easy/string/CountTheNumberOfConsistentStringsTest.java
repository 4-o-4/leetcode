package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountTheNumberOfConsistentStringsTest {
    private final CountTheNumberOfConsistentStrings test = new CountTheNumberOfConsistentStrings();

    @Test
    void example1() {
        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};
        assertEquals(2, test.countConsistentStrings(allowed, words));
    }

    @Test
    void example2() {
        String allowed = "abc";
        String[] words = {"a", "b", "c", "ab", "ac", "bc", "abc"};
        assertEquals(7, test.countConsistentStrings(allowed, words));
    }

    @Test
    void example3() {
        String allowed = "cad";
        String[] words = {"cc", "acd", "b", "ba", "bac", "bad", "ac", "d"};
        assertEquals(4, test.countConsistentStrings(allowed, words));
    }
}