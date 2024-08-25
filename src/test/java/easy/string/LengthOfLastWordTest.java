package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LengthOfLastWordTest {
    private final LengthOfLastWord solution = new LengthOfLastWord();

    @Test
    void example1() {
        String s = "Hello World";
        assertEquals(5, solution.lengthOfLastWord(s));
    }

    @Test
    void example2() {
        String s = "   fly me   to   the moon  ";
        assertEquals(4, solution.lengthOfLastWord(s));
    }

    @Test
    void example3() {
        String s = "luffy is still joyboy";
        assertEquals(6, solution.lengthOfLastWord(s));
    }
}