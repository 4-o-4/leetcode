package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReplaceAllDigitsWithCharactersTest {
    private final ReplaceAllDigitsWithCharacters test = new ReplaceAllDigitsWithCharacters();

    @Test
    void example1() {
        String s = "a1c1e1";
        assertEquals("abcdef", test.replaceDigits(s));
    }

    @Test
    void example2() {
        String s = "a1b2c3d4e";
        assertEquals("abbdcfdhe", test.replaceDigits(s));
    }
}