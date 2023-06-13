package easy.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWordTest {
    private LengthOfLastWord lengthOfLastWord;

    @BeforeEach
    void init() {
        this.lengthOfLastWord = new LengthOfLastWord();
    }

    @Test
    void lengthOfLastWordExample1() {
        String s = "Hello World";
        assertEquals(5, lengthOfLastWord.lengthOfLastWord(s));
    }

    @Test
    void lengthOfLastWordExample2() {
        String s = "   fly me   to   the moon  ";
        assertEquals(4, lengthOfLastWord.lengthOfLastWord(s));
    }

    @Test
    void lengthOfLastWordExample3() {
        String s = "luffy is still joyboy";
        assertEquals(6, lengthOfLastWord.lengthOfLastWord(s));
    }
}