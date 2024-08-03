package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecryptStringFromAlphabetToIntegerMappingTest {
    private final DecryptStringFromAlphabetToIntegerMapping test = new DecryptStringFromAlphabetToIntegerMapping();

    @Test
    void example1() {
        String s = "1326#";
        assertEquals("acz", test.freqAlphabets(s));
    }

    @Test
    void example2() {
        String s = "10#11#12";
        assertEquals("jkab", test.freqAlphabets(s));
    }
}