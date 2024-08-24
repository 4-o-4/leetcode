package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountPrefixesOfGivenStringTest {
    private final CountPrefixesOfGivenString test = new CountPrefixesOfGivenString();

    @Test
    void example1() {
        String[] words = {"a", "b", "c", "ab", "bc", "abc"};
        String s = "abc";
        assertEquals(3, test.countPrefixes(words, s));
    }

    @Test
    void example2() {
        String[] words = {"a", "a"};
        String s = "aa";
        assertEquals(2, test.countPrefixes(words, s));
    }
}