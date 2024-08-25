package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecryptStringFromAlphabetToIntegerMappingTest {
    private final DecryptStringFromAlphabetToIntegerMapping solution = new DecryptStringFromAlphabetToIntegerMapping();

    @Test
    void example1() {
        String s = "1326#";
        assertEquals("acz", solution.freqAlphabets(s));
    }

    @Test
    void example2() {
        String s = "10#11#12";
        assertEquals("jkab", solution.freqAlphabets(s));
    }
}