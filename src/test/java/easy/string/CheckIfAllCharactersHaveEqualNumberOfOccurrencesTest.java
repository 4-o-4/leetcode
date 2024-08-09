package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CheckIfAllCharactersHaveEqualNumberOfOccurrencesTest {
    private final CheckIfAllCharactersHaveEqualNumberOfOccurrences test = new CheckIfAllCharactersHaveEqualNumberOfOccurrences();

    @Test
    void example1() {
        String s = "abacbc";
        assertTrue(test.areOccurrencesEqual(s));
    }

    @Test
    void example2() {
        String s = "aaabb";
        assertFalse(test.areOccurrencesEqual(s));
    }

    @Test
    void example3() {
        String s = "vvvvvvvvvvvvvvvvvvv";
        assertTrue(test.areOccurrencesEqual(s));
    }

    @Test
    void example4() {
        String s = "zpfupfkmsuistzmtkijj";
        assertTrue(test.areOccurrencesEqual(s));
    }
}