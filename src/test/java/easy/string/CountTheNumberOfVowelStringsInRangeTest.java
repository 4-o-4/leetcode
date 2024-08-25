package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountTheNumberOfVowelStringsInRangeTest {
    private final CountTheNumberOfVowelStringsInRange solution = new CountTheNumberOfVowelStringsInRange();

    @Test
    void example1() {
        String[] words = {"are", "amy", "u"};
        int left = 0;
        int right = 2;
        assertEquals(2, solution.vowelStrings(words, left, right));
    }

    @Test
    void example2() {
        String[] words = {"hey", "aeo", "mu", "ooo", "artro"};
        int left = 1;
        int right = 4;
        assertEquals(3, solution.vowelStrings(words, left, right));
    }
}