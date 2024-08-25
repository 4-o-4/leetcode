package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CheckIfAllCharactersHaveEqualNumberOfOccurrencesTest {
    private final CheckIfAllCharactersHaveEqualNumberOfOccurrences solution = new CheckIfAllCharactersHaveEqualNumberOfOccurrences();

    @Test
    void example1() {
        String s = "abacbc";
        assertTrue(solution.areOccurrencesEqual(s));
    }

    @Test
    void example2() {
        String s = "aaabb";
        assertFalse(solution.areOccurrencesEqual(s));
    }

    @Test
    void example3() {
        String s = "vvvvvvvvvvvvvvvvvvv";
        assertTrue(solution.areOccurrencesEqual(s));
    }

    @Test
    void example4() {
        String s = "zpfupfkmsuistzmtkijj";
        assertTrue(solution.areOccurrencesEqual(s));
    }
}